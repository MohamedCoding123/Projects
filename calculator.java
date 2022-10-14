/*
 * Mohamed Sulevani
 * 10/14/22
 * basic calculator that can add, subtract, multiply, and divide two numbers 
 */

import java.util.Scanner;

public class  calculator{

    public static void add(double x, double y){
        double answer = x+y;
        System.out.println(answer);
    }
    
    public static void sub(double x, double y){
        double answer = x-y;
        System.out.println(answer);
    }
    
    
    
    public static void div(double x, double y){
        double answer = x/y;
        System.out.println(answer);
    }
    
    public static void mul(double x, double y){
        double answer = x*y;
        System.out.println(answer);
    }


    public static void main (String[] args){
        double x,y;
        Scanner s = new Scanner(System.in);


        System.out.println("Please type your desired action and numbers: \n" + "add # # \n" + "sub # # \n" + "div # # \n"+ "mul # #");

        String action = s.next();

        switch (action) {
            case "add":
                x= s.nextDouble();
                y= s.nextDouble();
                add(x, y);
                break;

            case "sub":
                x= s.nextDouble();
                y= s.nextDouble();
                sub(x, y);
                break;

            case "div":
                x= s.nextDouble();
                y= s.nextDouble();
                div(x, y);
                break;

            case "mul":
                x= s.nextDouble();
                y= s.nextDouble();
                mul(x, y);
                break;

            default:
                System.out.println("This is not a valid input");
                break;
}








}


}