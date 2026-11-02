
import java.util.*;


public interface AlertObserver {
  void update(String message);
}

class FarmerNotifier implements AlertObserver {
  public void update(String message) {
    System.out.println("Farmer: " + message);
  }
}

class FarmDashboard implements AlertObserver {
  public void update(String message) {
    System.out.println("Dashboard: " + message);
  }
}

class AlertPublisher {
  private List<AlertObserver> observers = new ArrayList<>();

  public void subscribe(AlertObserver o) {
    observers.add(o);
  }

  public void unsubscribe(AlertObserver o) {
    observers.remove(o);
  }

  public void publish(String message) {
    for (AlertObserver o : observers) {
      o.update(message);
    }
  }

}