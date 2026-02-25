package cviceni;

import java.util.Scanner;

public class pr9 {
    public static void main(String[] args) {
        System.out.println(reverse());

    }
    public static String reverse(){
        System.out.println("zadejte slovo");
        Scanner input = new Scanner(System.in);
        String slovo = input.nextLine();

        StringBuilder word = new StringBuilder(slovo);
        word.reverse();

        return word.toString();
    }
}
