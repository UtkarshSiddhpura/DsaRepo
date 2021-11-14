import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println(args[0]);// input java Main 3 after compiling
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
//        System.out.print("Please enter some input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        String name = input.next();
//        System.out.println(name);

//        float marks = input.nextFloat();
//        System.out.println(marks);
//		  ------------------------------------------------------

        // Data types in java
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 4567654.4567;
        long largeInteger = 34567834567876543L;
        boolean check = false;

        float c = 30.6f;
        c++;
        System.out.println(c);
        c = (int)(c) + 1;
        System.out.println(c);
    }
}
