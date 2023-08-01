package java_projects;

import java.util.*;
public class Calculator {
    public void addition(Float a, Float b){
        System.out.println("Addition : " + (a + b) + "\n");
    }

    public void subtraction(Float a, Float b){
        System.out.println("Subtraction : " + (a - b) + "\n");
    }

    public void multiplication(Float a, Float b){
        System.out.println("Multiplication : " + (a * b) + "\n");
    }

    public void division(Float a, Float b){
        System.out.println("Division : " + (a / b) + "\n");
    }

    public  void modulus(Float a, Float b){
        System.out.println("Modulus : " + (a % b) + "\n");
    }
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        
        Calculator obj = new Calculator();
        while(true){
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\nEnter Your Choice: ");
            int n = ns.nextInt();
            if (n == 1){
                System.out.println("Enter Value one: ");
                Float val1 = ns.nextFloat();
                System.out.println("Enter Value two: ");
                Float val2 = ns.nextFloat();
                obj.addition(val1, val2);
            }
            else if (n == 2){
                System.out.println("Enter Value one: ");
                Float val1 = ns.nextFloat();
                System.out.println("Enter Value two: ");
                Float val2 = ns.nextFloat();
                obj.subtraction(val1, val2);
            }
            else if (n == 3){
                System.out.println("Enter Value one: ");
                Float val1 = ns.nextFloat();
                System.out.println("Enter Value two: ");
                Float val2 = ns.nextFloat();
                obj.multiplication(val1, val2);
            }
            else if (n == 4){
                System.out.println("Enter Value one: ");
                Float val1 = ns.nextFloat();
                System.out.println("Enter Value two: ");
                Float val2 = ns.nextFloat();
                obj.division(val1, val2);
            }
            else if (n == 5){
                System.out.println("Enter Value one: ");
                Float val1 = ns.nextFloat();
                System.out.println("Enter Value two: ");
                Float val2 = ns.nextFloat();
                obj.modulus(val1, val2);
            }
            else if (n == 6){
                System.out.println("You Exit!");
                ns.close();
                break;
            }
            else{
                System.out.println("Invalid Input!");
            }
        }
    }
}
