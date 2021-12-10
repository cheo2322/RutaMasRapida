package com.exercise;

import com.exercise.logic.Route;
import com.exercise.logic.RouteSystem;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String line = "";
    int indexRoutes = 0;
    int count = 0;
    List<String> routes = new ArrayList<>();
    List<String> stations = new ArrayList<>();
    List<Route> routeList = new ArrayList<>();

    RouteSystem routeSystem = new RouteSystem();

    while (!line.equals("#")) {
      if (count == 0) {
        try {
          indexRoutes = scanner.nextInt();
          count++;
        } catch (InputMismatchException e) {
          throw new RuntimeException("First line must be a number!");
        }
      } else if (count == 1) {
        for (int i = 0; i < indexRoutes; i++) {
          line = scanner.nextLine();
          routes.add(line);
          routeSystem.addRouteFromLine(line);
        }
        count++;
      }

      line = scanner.nextLine();
      stations.add(line);
    }

    System.out.println(routeSystem);
  }
}
