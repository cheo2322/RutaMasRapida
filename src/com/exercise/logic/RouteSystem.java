package com.exercise.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RouteSystem {

  private final List<Route> routes = new ArrayList<>();
  private List<String> paths = new ArrayList<>();

  public void findFastestRoutes() {
    for (String path : this.paths) {
      System.out.println(path.concat(" exit"));
      System.out.println(findFastestRoute(path));
    }
  }

  private String findFastestRoute(String path) {
    String begin = path.substring(0, 2);
    String end = path.substring(2);

    return begin.concat(" : ").concat(end);
  }

  public void addRouteFromLine(String line) {
    Route route = new Route();

    String[] idAndRoutes = line.split(":");
    route.setId(idAndRoutes[0].charAt(0));

    String[] routesString = idAndRoutes[1].split("=");
    for (int i = 0; i < routesString.length; i++) {
      if (i > 0) {
        route.addConnection(new RouteConnection(route.getId(),
            routesString[i - 1].charAt(routesString[i - 1].length() - 1),
            routesString[i].charAt(0),
            routesString[i].charAt(1)));
      }

      String stationsString = routesString[i];
      if (i > 0) {
        stationsString = routesString[i].substring(2);
      }

      List<Character> stations = stationsString.chars()
          .mapToObj(value -> (char) value).collect(Collectors.toList());
      route.addStations(stations);
    }

    routes.add(route);
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  @Override
  public String toString() {
    return "RouteSystem{" +
        "routes=" + routes +
        '}';
  }
}
