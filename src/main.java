import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       for (int i = 2; i < 20; i ++){
           if(isPrimeNumber(i)){
               System.out.println(i);
           }
       }
    }
    public static boolean isPrimeNumber (int num) {
        if (num < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(num);
        for (int i = 2; i <= squareRoot; i ++){
            if (num % i == 0){
                return false;
            }
        }return true;
    }
}
