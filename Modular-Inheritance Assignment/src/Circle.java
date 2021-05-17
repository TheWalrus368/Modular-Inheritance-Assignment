/******************************************************************
*Author - Darren Wallace                                          *
*The purpose of this program is to calculate the area of a        *
*rectangle and cirle giving any valid inputs                      *
******************************************************************/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Circle extends Shapes2D{
    
    @Override               //overriding the user method for the circle
    public void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following values. None of which can be 0");   //input of the circle method
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

    public double circleArea(){         //calculation method for the circle
        return Pi*(radius*radius);
    }

    @Override
    public void results(){
        System.out.printf("%6s %10s","Radius","Area");      //results of the area of the circle output
        System.out.println();
        System.out.printf("%6.2f %10.2f",radius,circleArea()); 
        System.out.println();
    }
}
