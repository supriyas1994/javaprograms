package Jan2025;

import java.util.Scanner;

public class Lab006_gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage \n");
        int score = sc.nextInt();

        char grade = 'F';
        if(score>=90 && score<=100){
            grade='A';
            System.out.println("Your score is " +grade);
        }
        else if(score>=70 && score<=89){
            grade='B';
            System.out.println("Your score is " +grade);
        }
        else if(score>=50 && score<=69){
            grade='C';
            System.out.println("Your score is " +grade);
        }
        else{
            grade='F';
            System.out.println("Your score is " +grade);
        }

    }

}
