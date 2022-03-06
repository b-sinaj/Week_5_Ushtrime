public class EX_8_PimeNr {
    //Printim i numrave TEK

    public static void primeAfishim(int nr){
        int count=0;
        for(int i=2 ; i<100 ; i++){
            if(i%2==0){
                continue;
            }
            else if (count!=nr){
                count++;
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

            primeAfishim(4);
        }
    }


