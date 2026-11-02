public class FarmDataManager {
  private static final FarmDataManager instance = new FarmDataManager();

  private FarmDataManager() {}

  public static FarmDataManager getInstance() {
    return instance;
  }

  public void saveData(String data) {
    System.out.println("Saved: " + data);
  }
}