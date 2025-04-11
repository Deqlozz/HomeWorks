package lesson_8.task_1;

public class ShapeStarter {
        public static void main(String[] args) {
            Shape triangle = new Triangle(10, 10, 10);
            Shape rectangle = new Rectangle(15, 20);
            Shape circle = new Circle(15);
            Shape rectangleTwo = new Rectangle(15, 20);
            Shape circleTwo = new Circle(15);

            Shape[] shapesArray = new Shape[]{triangle, rectangle, circle, rectangleTwo, circleTwo};
            getSumOfPerimeter(shapesArray);
        }

        public static void getSumOfPerimeter(Shape[] array) {

            double sumPerimeter = 0;
            for (Shape shape  : array) {
                sumPerimeter += shape.getPerimeter();
            }

            System.out.printf("The sum in the array:"+ sumPerimeter);
        }
    }

