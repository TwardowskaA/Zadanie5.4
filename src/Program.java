import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj współrzędną X:");
        int a = scan.nextInt();
        System.out.println("Podaj współrzędną Y:");
        int b = scan.nextInt();


        if (a == 0 && b == 0) {
            System.out.println("Punkt w środku układu współrzędnych");
        } else if (a > 0 && b > 0) {
            System.out.println("Punkt" + "(" + a + "," + b + ")" + "leży w I cwiartce układu współrzędnych");
        } else if (a < 0 && b > 0) {
            System.out.println("Punkt" + "(" + a + "," + b + ")" + "leży w II cwiartce układu współrzędnych");
        } else if (a < 0 && b < 0) {
            System.out.println("Punkt" + "(" + a + "," + b + ")" + "leży w III cwiartce układu współrzędnych");
        } else if (a > 0 && b < 0) {
            System.out.println("Punkt" + "(" + a + "," + b + ")" + "leży w IV cwiartce układu współrzędnych");
        }


    }

}
