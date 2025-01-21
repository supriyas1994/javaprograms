package Jan2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab007_triangeside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle \n");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        if(side1==side2 && side1==side3 && side2==side3){
            System.out.println("It is an Equilateral triangle");
        }
        else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("It is an Isosceles triangle");
        }
        else{
            System.out.println("It is an scelen triangle");
        }
    }
}
