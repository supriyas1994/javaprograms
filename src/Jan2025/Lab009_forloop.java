package Jan2025;

import java.util.Scanner;

public class Lab009_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for( int age=0;age<18;age++){
            if(age>15){
                System.out.println("Gift!!!");
            }
            else{
                System.out.println("No Gift ");
            }
        }
    }
}
