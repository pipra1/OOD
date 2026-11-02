public class Main {
  public static void main(String[] args) {
    // 1. Singleton Pattern
    System.out.println("Singleton Pattern");
    FarmDataManager farmer1 = FarmDataManager.getInstance();
    FarmDataManager farmer2 = FarmDataManager.getInstance();
    System.out.println("Same instance: " + (farmer1 == farmer2));
    farmer1.saveData("Green Farm");
  
    // 2. Factory Pattern
    System.out.println("\nFactory Pattern");
    Sensor soil = SensorFactory.createSensor("soil");
    System.out.println("Moisture: " + soil.readValue());

    Sensor temp = SensorFactory.createSensor("temperature");
    System.out.println("Temperature: " + temp.readValue());

    try {
        SensorFactory.createSensor("humidity");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    // 3. Observer Pattern
    System.out.println("\nObserver Pattern");

    AlertPublisher publisher = new AlertPublisher();
    FarmerNotifier farmer = new FarmerNotifier();
    FarmDashboard dashboard = new FarmDashboard();

    publisher.subscribe(farmer);
    publisher.subscribe(dashboard);

    publisher.publish("Farm Monitoring Started");
    publisher.unsubscribe(dashboard);
    publisher.publish("Dashboard Unscribed");
  
    // 4. Strategy Pattern
    System.out.println("\nStrategy Pattern");
    double moisture = 30;
    boolean rainExpected = false;
    // Normal Strategy
    IrrigationStrategy normal = new NormalIrrigationStrategy();
    System.out.print("Normal Strategy:");
    System.out.println(normal.shouldIrrigate(moisture, rainExpected)
      ? "Irrigation ON" : "Irrigation OFF");

    // Water Saving Strategy
    IrrigationStrategy saving = new WaterSavingStrategy();
    System.out.print("Water Saving Strategy:");
    System.out.println(saving.shouldIrrigate(moisture, rainExpected)
      ? "Irrigation ON" : "Irrigation OFF");
  }
}