public class InterfaceSegregationPrinciple {
    // Interface for vehicles that can be rented
    interface Rentable {
        void rent();
        void returnVehicle();
    }

    // Interface for vehicles that need refueling
    interface Refuelable {
        void refuel();
    }

    // Car class that implements Rentable and Refuelable interfaces
    class Car implements Rentable, Refuelable {
        @Override
        public void rent() {
            System.out.println("Car rented.");
        }

        @Override
        public void returnVehicle() {
            System.out.println("Car returned.");
        }

        @Override
        public void refuel() {
            System.out.println("Car refueled.");
        }
    }

    // Bicycle class that only implements Rentable interface
    class Bicycle implements Rentable {
        @Override
        public void rent() {
            System.out.println("Bicycle rented.");
        }

        @Override
        public void returnVehicle() {
            System.out.println("Bicycle returned.");
        }
    }

    public void Test() {
        Car car = new Car();
        car.rent();
        car.refuel();
        car.returnVehicle();

        Bicycle bicycle = new Bicycle();
        bicycle.rent();
        bicycle.returnVehicle();

    }

}
