public class EX_2_EvenNumber {
    /*2. Write a Java program that lists all even numbers from 1 to 100
Output: 2, 4, 6, 8, ...,100*/
    public static void main(String[] args) {

        int nr;
        for(int i=1;i<=100;i++){
           if(i%2==0)
            System.out.println(""+i);
        }

    }

}
