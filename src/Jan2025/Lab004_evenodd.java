package Jan2025;

import java.util.Scanner;

public class Lab004_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number \n");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
