import java.util.Scanner;

public class EX_3 {
    /*3. Write a Java program that accepts an integer (n) and displays n, nn, nnn, nnnn, nnnnnn: 5
Output: 5, 55, 555, 5555, 55555*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nr: ");
        int nr = scanner.nextInt();
        int para=nr;
        System.out.println(nr);
        for (int i=1;i<nr;i++){
            int current = (int) (nr*Math.pow(10,i) +para);
            System.out.println(current);
            para = current;
        }

    }
}
