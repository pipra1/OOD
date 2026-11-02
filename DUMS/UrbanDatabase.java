class UrbanDatabase {
  private static final UrbanDatabase instance = new UrbanDatabase();

  private UrbanDatabase() {}

  public static UrbanDatabase getInstance() {
    return instance;
  }

  public void saveComplaint(String id) {
    System.out.println("Complaint saved: " + id);
  }
}