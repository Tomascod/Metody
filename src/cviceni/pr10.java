package cviceni;

import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        System.out.println("je prvocíslo: " + jePrvocislo());
    }

    public static boolean jePrvocislo(){
        System.out.println("zadejte číslo");
Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    if(n<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
