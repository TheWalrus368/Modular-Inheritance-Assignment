import java.util.Scanner;
import java.util.InputMismatchException;

public class Shapes2D {

    double length;
    double width;
    double radius;
    final double Pi = 3.14159;

    public double getValue(String value){
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
        System.out.println("Enter the following values. None of which can be 0");
        while (true){
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

    public double recArea(){
        return length*width;
    }

    public static void main(String[] args){
        Shapes2D rec = new Shapes2D();
        rec.user();
    }
}
