package Section_01;

import java.util.Scanner;

public class PountToKilo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of pound: ");
        double pound = sc.nextDouble();
        double result = pound * 0.4535924;
        System.out.println(result);
    }
}
