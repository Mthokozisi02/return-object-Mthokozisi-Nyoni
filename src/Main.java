



public class Main {
    public static void main(String[] args) {
            car Car = new car("Civic", "Honda", 2022, 25000.00, "Red", 5);

            System.out.println(Car.toString());

            car.sell(2);

            System.out.println("Model: " + Car.getModel());
            System.out.println("Brand: " + Car.getBrand());
            System.out.println("Year: " + Car.getYear());
            System.out.println("Price: " + Car.getPrice());
            System.out.println("Color: " + Car.getColor());
            System.out.println("Quantity: " + Car.getQuantity());

            Car.setColor("Blue");
            Car.setPrice(23000.00);

            System.out.println(Car.toString());
        }

    }
