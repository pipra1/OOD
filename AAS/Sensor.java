public interface Sensor {
  double readValue();
}

class SoilMoistureSensor implements Sensor {
  public double readValue() {
    return 30;
  }
}

class TemperatureSensor implements Sensor {
  public double readValue() {
    return 28;
  }
}

class SensorFactory {
  public static Sensor createSensor(String type) {
    if(type.equalsIgnoreCase("soil"))
      return new SoilMoistureSensor();

    if(type.equalsIgnoreCase("temperature"))
      return new TemperatureSensor();

    throw new IllegalArgumentException (
      "Invalid sensor type"
    );
  }
}