import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int a= input.nextInt();
        System.out.println("Please Enter Min Number");
        System.out.println("Please Enter Max Number");
        int minValue = input.nextInt();
        int maxValue = input.nextInt();
        int reversedNumber= reverse (a);
        int randomValue =randomValue(a);
        char randomCharacter = randomcharacter();
        Integer[] arr= {1,2,3,4,5};
        String[] array ={"Sara", "Aber", "Mohamed"};
        printArray(arr);
        printArray(array);
        System.out.println("Reversed Number "+ reversedNumber);
        System.out.println("random value " +  randomValue);
        System.out.println("Random Character is " + randomCharacter);

        System.out.println("Random int value from min to max is" + randomRange(minValue,maxValue));

    }
    public static int reverse (int X){
            int reversed =0;
            while(X!=0){
                int digit = X%10;
                reversed= reversed*10 + digit;
                X/=10;
            }
            return reversed;
    }
    public static int randomValue(int a){
        int z = (int) (Math.random()*a);
        return z;
    }
    public static char randomcharacter(){
        char y = (char) (Math.random()*26 +'a');
        return y;
    }
    public static int randomRange(int min,int max) {
        int x= Random.nextInt((max-min)+1) +min ;
        return x;
    }
    public static <T> Void printArray(T[]array){
      for(T element : array) {
          System.out.print(element +" ");
      }
      System.out.println();

    }
}