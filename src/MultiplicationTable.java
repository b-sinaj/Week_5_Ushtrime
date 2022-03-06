import java.util.Scanner;

public class MultiplicationTable {
    /*1. Write a Java program that takes a number and prints its multiplication table up to 10: 8
Output: 8, 16, 24, 32, …, 80*/

    public static void main(String[] args) {
        int nr;
        System.out.print("Vensoni nje numer : ");
        Scanner scanner=new Scanner(System.in);
        nr=scanner.nextInt();
        int mult=1;
        System.out.print("Rezultatet e shumezimit :");
        for (int i=1;i<=10;i++){
            mult=nr*i;
            System.out.print(" "+ mult);
        }
    }
}
