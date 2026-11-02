interface RouteStrategy {
  String chooseRoute();
}

class ShortestRouteStrategy implements RouteStrategy {
  public String chooseRoute () {
    return "Route A (5km)";
  }
}

class FastestRouteStrategy implements RouteStrategy {
  public String chooseRoute() {
    return "Route B (20 minutes)";
  }
}