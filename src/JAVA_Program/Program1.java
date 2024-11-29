package JAVA_Program;

import java.util.Scanner;

public class Program1 {
    //ODD Number
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number " + num + " Is Even");
        }
        else
        {
            System.out.println("Number " + num + " Is ODD");
        }

    }
}
