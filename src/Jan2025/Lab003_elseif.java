package Jan2025;

import java.util.Scanner;

public class Lab003_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age \n");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Not allowed to vote");
        }
    }
}
