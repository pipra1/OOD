public interface IrrigationStrategy {
  boolean shouldIrrigate(double moisture, boolean  rain);
}

class NormalIrrigationStrategy implements IrrigationStrategy {
  public boolean shouldIrrigate(double moisture, boolean rain) {
    return moisture < 40 && !rain;
  }
}

class WaterSavingStrategy implements IrrigationStrategy {
  public boolean shouldIrrigate(double  moisture, boolean rain) {
    return moisture < 25 && !rain;
  }
}
