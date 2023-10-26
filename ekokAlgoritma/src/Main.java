import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to my least common multiple and greatest common factor finder program! ");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Type the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Type the second number: ");
        int num2 = scanner.nextInt();
        //Multiplied because multiplication of gcf and lcm equals the multiplication of those two numbers
        int product = num1*num2;
        //The point of the loop is equaling num1 and num2 because at the end both of them will be gcf
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else if (num2>num1){
                num2=num2-num1;
            }
        }
        //We divided here because if we divide the product of two numbers by their greatest common factor, we find their least common multiple
        System.out.println("The least common multiple of those numbers are: " + product / num1);
        System.out.println("The greatest common factor finder of those numbers are: " + num1);
    }
    }
