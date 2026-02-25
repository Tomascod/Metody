package cviceni;

import java.util.Random;
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("zadejte počet čísel");
        int a = sc.nextInt();
        System.out.println("zadejte minimální hodnotu");
        int min = sc.nextInt();
        System.out.println("Zadejte maximální hodnotu");
        int max = sc.nextInt();
numbers(a,min,max);
    }

    public static void numbers(int a,int min,int max) {
        int cislo=0;
        Random rn = new Random();
        for (int i = 0; i < a; i++) {
            cislo = rn.nextInt(min, max+1);
            System.out.print(cislo+"|");

        }
    }
}
