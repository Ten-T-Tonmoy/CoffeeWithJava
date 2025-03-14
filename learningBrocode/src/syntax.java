import java.util.Scanner;

public class syntax {
    public static void main(String[] args){
        //well comments are same anyways
        System.out.println("curse u griffith");
        //umm yea does shit println and print

        int age=30;
        double price=20.5;
        char ds='$';
        String name="myself";
        //bruh left to right num+char=math addition
        //char+num=concatenation
        if(age>20){
            System.out.println(String.valueOf(age)+" "+ds+name);
        }
        else{
            System.out.println("Nothing was here");
        }
        //System is class out is  static and print is method
        //since static field so yea no object needed ig
        //bruh capital for Objects
        //String
        //sout does same shits makes sysoutprint

        //Inputs======================>
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ur name: ");
        String user=scanner.nextLine();
        System.out.println("Hi "+user);
        int time=scanner.nextInt();
        System.out.println("So u are "+String.valueOf(time)+" years old");
        //one scanner object to type them all
        // scanner.next to get specific inputs

        scanner.close();

    }
}