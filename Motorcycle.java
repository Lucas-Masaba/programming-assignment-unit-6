public class Motorcycle implements Vehicle, MotorVehicle{
  private String make;
  private String model;
  private int year;
  private int numberOfWheels;
  private String type;

  public Motorcycle(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
  }

  @Override
  public String getMake(){
    return make;
  } 

  @Override
  public String getModel(){
    return model;
  }

  @Override
  public int getManufactureDate(){
    return year;
  }

  @Override
  public int getNumberOfWheels(){
    return numberOfWheels;
  }

  @Override
  public String getMotorCycleType(){
    return type;
  }

  @Override
  public void setNumberOfWheels(int wheels){
    this.numberOfWheels = wheels;
  }

  @Override
  public void setMotorCycleType(String type){
    this.type = type;
  }
}
