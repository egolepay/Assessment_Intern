class Car {
  // Properties
  String brand;
  String model;
  int year;

  // Constructor
  Car(this.brand, this.model, this.year);

  // Method
  void displayInfo() {
    print("Car: $brand $model ($year)");
  }
}

void main() {
  // Create an instance of Car
  Car myCar = Car("Toyota", "Corolla", 2022);

  // Call the method
  myCar.displayInfo();
}
