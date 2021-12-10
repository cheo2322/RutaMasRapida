package com.exercise.logic;

import java.util.ArrayList;
import java.util.List;

public class Route {

  private char id;
  private final List<Character> stations = new ArrayList<>();
  private final List<RouteConnection> routeConnections = new ArrayList<>();

  public void addConnection(RouteConnection connection) {
    this.routeConnections.add(connection);
  }

  public void addStations(List<Character> stationsArray) {
    stations.addAll(stationsArray);
  }

  public char getId() {
    return id;
  }

  public void setId(char id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Route{" +
        "id=" + id +
        ", stations=" + stations +
        ", routeConnections=" + routeConnections +
        '}';
  }
}
