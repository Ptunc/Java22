package Java22;

import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, bolum, basamak=0, toplam=0, b;

        System.out.println("sayiyi girin: ");
        a = input.nextInt();
        bolum = a;

        while(bolum!=0){
            bolum/=10;
            System.out.println(bolum);
            basamak++;
       }
       System.out.println(basamak);

       for(int i=0; i<basamak; i++){
        b = a%10;
        toplam+=b;

        a= a/10;

       }
       System.out.println(toplam);
    }
}
