public class Main {
  public static void main(String[] args) {
    // 1. Singleton Pattern
    System.out.println("\nSingleton Pattern");
    UrbanDatabase db1 = UrbanDatabase.getInstance();
    UrbanDatabase db2 = UrbanDatabase.getInstance();

    System.out.println("Same instance: " + (db1 == db2));
    db1.saveComplaint("C101");

    // 2. Factory Pattern
    System.out.println("\nFactory Pattern");
    UrbanService waste = UrbanServiceFactory.creatService("waste");
    UrbanService traffic = UrbanServiceFactory.creatService("traffic");
    UrbanService emergency = UrbanServiceFactory.creatService("emergency");

    System.out.println(waste.assign());
    System.out.println(traffic.assign());
    System.out.println(emergency.assign());

    try {
        UrbanServiceFactory.creatService("test");
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid service");
    }

    // 3. Observer Pattern
    System.out.println("\nObserver Pattern");

    ComplaintObserver citizen = new CitizenNotifier();
    ComplaintObserver government = new GovernmentDashboard();
    StatusPublisher publisher = new StatusPublisher();

    publisher.subscribe(citizen);
    publisher.subscribe(government);
    publisher.publish("Broadcast message");
    publisher.unsubscribe(government);
    publisher.publish("Government removed");

    // 4. Strategy Pattern
    System.out.println("\nStrategy Pattern");

    RouteStrategy shortest = new ShortestRouteStrategy();
    RouteStrategy fastest = new FastestRouteStrategy();
  
    System.out.println("Shortest Route: " + shortest.chooseRoute());
    System.out.println("Fastest Route: " + fastest.chooseRoute());
  }
}