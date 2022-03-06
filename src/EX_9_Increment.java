import java.util.Scanner;

public class EX_9_Increment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nr=scanner.nextInt();
        int res=0;
        for (int i=1;i<=nr;i++){
            res=i*nr;
            System.out.println(" "+res);
        }
    }
}
