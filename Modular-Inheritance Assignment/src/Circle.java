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
}
