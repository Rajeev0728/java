import java.util.Scanner;

class name {
    public static void main(String[] args) {

        System.out.println("What is your name :-");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Hello " + name + " Have a nice day!");

        sc.close();
    }
}