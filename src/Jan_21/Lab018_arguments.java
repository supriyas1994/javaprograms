package Jan_21;

public class Lab018_arguments {
    public static void main(String[] args) {
        String age = args[0];
        int age1 = Integer.parseInt(age);
        System.out.println(age1);
        while(age1>0)
        {
            System.out.println(age1);
            age1--;
        }

    }
}
