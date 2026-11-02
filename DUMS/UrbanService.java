interface UrbanService {
  String assign();
}

class WaterService implements UrbanService {
  public String assign() { return "Waste team assigned"; }
}

class TrafficService implements UrbanService {
  public String assign() { return "Traffic team assigned"; }
}

class EmergencyService implements UrbanService {
  public String assign() { return "Emergency team assigned"; }
}

class UrbanServiceFactory {
  public static UrbanService creatService (String type) {
    if(type.equalsIgnoreCase("waste")) return new WaterService();
    if(type.equalsIgnoreCase("traffic")) return new TrafficService();
    if(type.equalsIgnoreCase("emergency")) return new EmergencyService();

    throw new IllegalArgumentException("Invalid service type");
  }
}