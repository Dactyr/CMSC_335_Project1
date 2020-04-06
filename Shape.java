/*
Name: Shape.java
Author: Tyler Bell
Date: 26 March
Purpose:To create the shapes and ask the users for input on the shapes
being created. Then to display the volume or area of the shape.
 */

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

//Shape class
public class Shape {

    //creating variable to collect userChoice
    public static boolean userChoice = true;
    //Creating the scanner for userChoice
    public static Scanner scan = new Scanner(System.in);


    //Method to catch if the user is done with the program
    //and throw an error if they enter an invalid number
    static boolean setChoice() {
        Character choice;
        Boolean goodInput = false;
        System.out.println("\nWould you like to continue? (Y or N)");
        //do-while loop to ensure userChoice is acceptable
        do{
            choice = scan.next().charAt(0);
            if(choice =='N'){
                userChoice = false;
                goodInput = true;
                return goodInput;
            }else if (choice == 'Y') {
                userChoice = true;
                goodInput = true;
                return goodInput;
            }else {
                System.out.println("Sorry I do no understand. Enter Y or N");
            }
        }while (goodInput == false);
        return false;
    }
    //Main Method
    public static void main(String[] args) {

        System.out.println("*********Welcome to the Java OO Shapes Program **********");
        //while loop that will continue till the user is done
        while(userChoice == true) {
            System.out.println("\n Select from the Menu");
            System.out.println("\n1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");

            //Switch statement to allow user to switch through different
            //Shapes they want to select.
            switch(scan.nextInt()){
                case 1:
                    Circle circle = new Circle();
                    System.out.println("What is the Radius?");
                    circle.setRadius(scan.nextDouble());
                    System.out.println("The area of Circle is " + Math.round(circle.getArea()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    System.out.println("What is the Height?");
                    rectangle.setHeight(scan.nextDouble());
                    System.out.println("What is the Width?");
                    rectangle.setWidth(scan.nextDouble());
                    System.out.println("The area of the Rectangle is " + Math.round(rectangle.getArea()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 3:
                    Square square = new Square();
                    System.out.println("What is the Side?");
                    square.setSide(scan.nextDouble());
                    System.out.println("The area of the square is " + Math.round(square.getArea()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 4:
                    Triangle triangle = new Triangle();
                    System.out.println("What is the Base?");
                    triangle.setBase(scan.nextDouble());
                    System.out.println("What is the Height?");
                    triangle.setHeight(scan.nextDouble());
                    System.out.println("The area of the Triangle is " + Math.round(triangle.getArea()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 5:
                    Sphere sphere = new Sphere();
                    System.out.println("what is the Radius?");
                    sphere.setRadius(scan.nextDouble());
                    System.out.println("The volume of the Sphere is " + Math.round(sphere.getVolume()*100)/100.0 + " .");
                    setChoice();
                    break;
                case 6:
                    Cube cube = new Cube();
                    System.out.println("What is the Side length?");
                    cube.setSide(scan.nextDouble());
                    System.out.println("The volume of the Cube is " + Math.round(cube.getVolume()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 7:
                    Cone cone = new Cone();
                    System.out.println("What is the Radius?");
                    cone.setRadius(scan.nextDouble());
                    System.out.println("What is the Height?");
                    cone.setHeight(scan.nextDouble());
                    System.out.println("The volume of the Cone is " + Math.round(cone.getVolume()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 8:
                    Cylinder cylinder = new Cylinder();
                    System.out.println("What is the Radius?");
                    cylinder.setRadius(scan.nextDouble());
                    System.out.println("What is the Height?");
                    cylinder.setHeight(scan.nextDouble());
                    System.out.println("The volume of the Cylinder is "  + Math.round(cylinder.getVolume()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 9:
                    Torus torus = new Torus();
                    System.out.println("What is the Major Radius?");
                    torus.setMajRadius(scan.nextDouble());
                    System.out.println("What is the Minor Radius?");
                    torus.setMinRadius(scan.nextDouble());
                    System.out.println("The volume of the Torus is  " + Math.round(torus.getVolume()*100)/100.0 + ".");
                    setChoice();
                    break;
                case 10:
                    userChoice = false;
                    break;

                default:
                    System.out.println("That isn't an acceptable answer.");
            }
        }
        //Calendar information to get the final
        //thank you + date and time for using
        //the program
        Calendar cal = Calendar.getInstance();
        System.out.print("Thanks for using the program. " +
                new SimpleDateFormat("MMM dd").format(cal.getTime()) + " at ");
        System.out.println(new SimpleDateFormat("hh:mm a").format(cal.getTime()));
    }
}
