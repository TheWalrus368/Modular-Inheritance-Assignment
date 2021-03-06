/******************************************************************
*Author - Darren Wallace                                          *
*The purpose of this program is to calculate the area of a        *
*rectangle and cirle giving any valid inputs                      *
******************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Shapes2D {

    double length;
    double width;
    double radius;
    final double Pi = 3.14159;

    public double getValue(String value){           //Helper method to get valid input
        System.out.print(value);
        Scanner input = new Scanner(System.in);
        double num;
        while (true){
            try{
                num = input.nextDouble();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.println("This is not a valid number. Try again");
            }
        }
        return num;
    }

    public void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following values. None of which can be 0");   //area of the rectangle class.
        while (true){                                                               //also includes some bullet proofing
            try{
                length = getValue("Length: ");
                if (length == 0){
                    System.out.println("Invalid input. Number must not be 0");
                    System.out.println("Try again");
                }
                else{
                    break;
                }
            }
            catch(InputMismatchException err){
                System.out.println("This is not a valid number. Try again");
            }
        }
        while (true){
            try{
                width = getValue("Width: ");
                if (width == 0){
                    System.out.println("Invalid input. Number must not be 0");
                    System.out.println("Try again");
                }
                else{
                    break;
                }
            }
            catch(InputMismatchException err){
                System.out.println("This is not a valid number. Try again");
            }
        }
    }

    public double recArea(){        //helper calculation method for the are of the rectangles
        return length*width;
    }

    public void results(){
        System.out.printf("%6s %10s %12s","Length","Width","Area");     //results of the rectangle area output
        System.out.println();
        System.out.printf("%6.2f %10.2f %12.2f",length,width,recArea()); 
        System.out.println();
    }

    public static void main(String[] args){
        Shapes2D rec = new Shapes2D();              //main class to run everything
        rec.user();
        rec.results();

        Circle cir = new Circle();
        cir.user();
        cir.results();
    }
}
