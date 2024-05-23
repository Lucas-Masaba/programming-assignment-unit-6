public class Car implements Vehicle, CarVehicle {
  private String make;
  private String model;
  private int year;
  private int numberOfDoors;
  private String fuelType;

  public Car(String make, String model, int year) {
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
  public int getNumberOfDoors(){
    return numberOfDoors;
  }

  @Override
  public String getFuelType(){
    return fuelType;
  }

  @Override
  public void setNumberOfDoors(int doors){
    this.numberOfDoors = doors;
  }


  @Override
  public void setFuelType(String fuelType){
    this.fuelType = fuelType;
  }
  
}
