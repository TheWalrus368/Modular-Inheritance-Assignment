import java.util.Scanner;
import java.util.InputMismatchException;

public class Circle extends Shapes2D{
    
    @Override
    public void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following values. None of which can be 0");
        while (true){
            try{
                radius = getValue("radius: ");
                if (radius == 0){
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

    public double circleArea(){
        return Pi*(radius*radius);
    }

    @Override
    public void results(){
        System.out.printf("%6s %10s","Radius","Area");
        System.out.println();
        System.out.printf("%6.2f %10.2f",radius,circleArea()); 
        System.out.println();
    }
}
