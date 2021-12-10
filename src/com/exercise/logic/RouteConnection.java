package com.exercise.logic;

public class RouteConnection {

  private final char mainIdRoute;
  private final char mainStation;
  private final char secondIdRoute;
  private final char secondStation;

  public RouteConnection(char mainIdRoute, char mainStation, char secondIdRoute,
      char secondStation) {
    this.mainIdRoute = mainIdRoute;
    this.mainStation = mainStation;
    this.secondIdRoute = secondIdRoute;
    this.secondStation = secondStation;
  }

  public char getSecondIdRoute() {
    return secondIdRoute;
  }

  public char getSecondStation() {
    return secondStation;
  }

  public char getMainIdRoute() {
    return mainIdRoute;
  }

  public char getMainStation() {
    return mainStation;
  }

  @Override
  public String toString() {
    return "RouteConnection{" +
        "mainIdRoute=" + mainIdRoute +
        ", mainStation=" + mainStation +
        ", secondIdRoute=" + secondIdRoute +
        ", secondStation=" + secondStation +
        '}';
  }
}
