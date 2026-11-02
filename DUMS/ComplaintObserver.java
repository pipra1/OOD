
import java.util.ArrayList;
import java.util.List;

interface ComplaintObserver {
  void update(String message);
}

class CitizenNotifier implements ComplaintObserver {
  public void update(String message) {
    System.out.println("Citizen: " + message);
  }
}

class GovernmentDashboard implements ComplaintObserver {
  public void update(String message) {
    System.out.println("Dashboard: " + message);
  }
}

class StatusPublisher {
  private List<ComplaintObserver> observers = new ArrayList<>();

  public void subscribe(ComplaintObserver o) {
    observers.add(o);
  }
  public void unsubscribe(ComplaintObserver o) {
    observers.remove(o);
  }
  public void publish(String message) {
    for (ComplaintObserver o : observers) {
      o.update(message);
    }
  }
}