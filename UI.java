import java.util.Scanner;

public class UI {

  public void run() {
    Scanner scanner = new Scanner(System.in);
    Vehicle vehicle = null;

    System.out.println("Enter the type of vehicle (car, motorcycle, truck): ");
    String vehicleType = null;

    while (true) {
      vehicleType = scanner.nextLine();
      if (vehicleType.equals("car") || vehicleType.equals("motorcycle") || vehicleType.equals("truck")) {
        break;
      } else {
        System.out.println("Invalid vehicle type! Please enter either car, motorcycle, or truck.");
      }
    }

    System.out.println("Enter make: ");
    String make = scanner.nextLine();

    System.out.println("Enter model: ");
    String model = scanner.nextLine();

    System.out.println("Enter year of manufacture: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Please enter an integer.");
      scanner.next(); // discard the non-integer input
    }
    int year = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (vehicleType.toLowerCase()) {
      case "car":
        vehicle = new Car(make, model, year);

        System.out.println("Enter number of doors: ");
        while (!scanner.hasNextInt()) {
          System.out.println("Please enter an integer.");
          scanner.next(); // discard the non-integer input
        }
        int doors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter fuel type (petrol, diesel, electric): ");
        String fuelType = null;

        while (true) {
          fuelType = scanner.nextLine();
          if (fuelType.equals("petrol") || fuelType.equals("electric") || fuelType.equals("truck")) {
            break;
          } else {
            System.out.println("Invalid fuel type! Please enter either petrol, diesel, or electric.");
          }
        }
        
        ((Car) vehicle).setNumberOfDoors(doors);
        ((Car) vehicle).setFuelType(fuelType);

        break;

      case "motorcycle":
        vehicle = new Motorcycle(make, model, year);

        System.out.println("Enter number of wheels: ");
        while (!scanner.hasNextInt()) {
          System.out.println("Please enter an integer.");
          scanner.next(); // discard the non-integer input
        }
        int wheels = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter type of motorcycle (sport, cruiser, off-road): ");
        String type = scanner.nextLine();

        while (true) {
          type = scanner.nextLine();
          if (type.equals("petrol") || type.equals("electric") || type.equals("truck")) {
            break;
          } else {
            System.out.println("Invalid type! Please enter either sport, cruiser or off-road.");
          }
        }

        ((Motorcycle) vehicle).setNumberOfWheels(wheels);
        ((Motorcycle) vehicle).setMotorCycleType(type);

        break;

      case "truck":
        vehicle = new Truck(make, model, year);

        System.out.println("Enter cargo capacity (in tons): ");
        while (!scanner.hasNextDouble()) {
          System.out.println("Please enter an integer/double.");
          scanner.next(); // discard the non-integer input
        }
        double capacity = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter transmission type (manual, automatic): ");
        String transmission = null;

        while (true) {
          transmission = scanner.nextLine();
          if (transmission.equals("manual") || transmission.equals("automatic")) {
            break;
          } else {
            System.out.println("Invalid fuel type! Please enter either petrol, diesel, or electric.");
          }
        }

        ((Truck) vehicle).setCargoCapacity(capacity);
        ((Truck) vehicle).setTransmissionType(transmission);

        break;

      default:
        System.out.println("Please make sure all your input is valid!");
        System.exit(0);
    }

    // Display vehicle details
    System.out.println("\nVehicle Details:");
    System.out.println("Make: " + vehicle.getMake());
    System.out.println("Model: " + vehicle.getModel());
    System.out.println("Year: " + vehicle.getManufactureDate());

    if (vehicle instanceof Car) {
      Car car = (Car) vehicle;
      System.out.println("Number of doors: " + car.getNumberOfDoors());
      System.out.println("Fuel type: " + car.getFuelType() + "\n");
    } else if (vehicle instanceof Motorcycle) {
      Motorcycle motorcycle = (Motorcycle) vehicle;
      System.out.println("Number of wheels: " + motorcycle.getNumberOfWheels());
      System.out.println("Type of motorcycle: " + motorcycle.getMotorCycleType() + "\n");
    } else if (vehicle instanceof Truck) {
      Truck truck = (Truck) vehicle;
      System.out.println("Cargo capacity: " + truck.getCargoCapacity() + " tons");
      System.out.println("Transmission type: " + truck.getTransmissionType() + "\n");
    }

    scanner.close();
  }
}
