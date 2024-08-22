package Azzam;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        calcu calculator=new calcu();
        
        System.out.println("STANDARD CALCULATOR");

        System.out.print("Enter first number: ");
        calculator.num1=scanner.nextInt();
        System.out.println();
        System.out.print("Enter second number: ");
        calculator.num2=scanner.nextInt();
        System.out.println();
        System.out.print("Choose the operator (+, *, -, or /) ---> ");
        char choice=scanner.next().charAt(0);

        switch (choice){
            case '+':
            calculator.sum();
            break;

            case '-':
            calculator.min();
            break;

            case '*':
            calculator.multi();
            break;

            case '/':
            calculator.divide();
            break;

            default:
            System.out.println("Invalid Operator Choice!!");
            return;
        }
        System.out.println();
        calculator.showRes();
        scanner.close();
    }
}
