public class OpenClosedPrinciple {
    interface Shape {
        double calculateArea();
    }

    class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double calculateArea() {
            return width * height;
        }
    }

    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class AreaCalculator {
        public double calculateTotalArea(Shape[] shapes) {
            double totalArea = 0;
            for (Shape shape : shapes) {
                totalArea += shape.calculateArea();
            }
            return totalArea;
        }
    }

    public void Test(){
        Shape[] shapes = {
                new Rectangle(5, 10),
                new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);

    };
}
