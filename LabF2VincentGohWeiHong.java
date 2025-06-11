package apr25.lab;

import java.util.Scanner;

public class LabF2VincentGohWeiHong {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int selectionOperation;
        int num1,num2;
        int total = 0;

        System.out.println("Pick an operation:\n1.Plus\n2.Minus\n3.Times\n4.Divide");
        System.out.print("\nEnter selection (1/2/3/4): ");
        selectionOperation = input.nextInt();
        
        System.out.print("\nEnter first number: ");
        num1 = input.nextInt();
        System.out.print("\nEnter first number: ");
        num2 = input.nextInt();
        
        switch(selectionOperation){
            case 1: plus(num1,num2);
            break;
            case 2: minus(num1,num2);
            break;
            case 3: times(num1,num2);
            break;
            case 4: divide(num1,num2);
            break;
        }
        
        int answer;
        System.out.println("What is the value" + num1 + selectionOption + num2 + "?");
        answer = input.nextInt();
        
        while(answer == total){
                System.out.println("Answer is correct");
                break;
                System.out.println("Answer is incorrect");
            }
        
        }
    }
public static int plus(int num1,int num2) {
    num1 + num2;
    return total;
}
public static int minus(int num1,int num2) {
    num1 - num2;
    return total;
}
public static int times(int num1,int num2) {
    num1 * num2;
    return total;
}
public static int divide(int num1,int num2) {
    num1 / num2;
    return total;
}