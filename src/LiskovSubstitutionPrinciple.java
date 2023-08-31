public class LiskovSubstitutionPrinciple {
    class Shape {
        public double getArea() {
            return 0.0;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    public void Test() {

        //Substitution in type (Using Shape class directly)
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(4);

        System.out.println(rectangle.getArea()); // Output: Area: 20.0
        System.out.println(square.getArea());// Output: Area: 16.0

    }

}
