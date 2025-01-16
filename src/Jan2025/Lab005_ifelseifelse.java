package Jan2025;

import java.util.Scanner;

public class Lab005_ifelseifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers \n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is greater");
        }
        else if(num2>num1){
            System.out.println("Num2 is greater");
    }
        else{
            System.out.println("Numbers are equal");
        }

    }
}
