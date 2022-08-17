package tasks1dz;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);//считываем из консоли число
        System.out.println("введите число: ");
        int value = iScanner.nextInt();
        int counter;
        counter = 0;//счетчик
        int result;
        result = 0;
        while (counter<=value){
            result = result + counter;
            counter++;
        }
        System.out.println(result);
    }
}
