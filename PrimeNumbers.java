import java.util.*;
public class PrimeNumbers {
  public static void main(String[] args) {
     Scanner kbd = new Scanner(System.in);
     int prime = kbd.nextInt();
     for(int i=1;i<=prime;i++){
        if(prime%i==1){
           System.out.print("PrimeNumber");
         }
     
     }
  }
}
