package cviceni;

import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        System.out.println("Zadejte vaši značku ve formátu (XYX XXXX)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pismeno = input.substring(1,2);


        System.out.println(znacka(pismeno));
    }
    public static String znacka( String pismeno) {

        String[][] znacky = {
                {"A", "Praha"},
                {"B", "Jihomoravský kraj"},
                {"C", "Jihočeský kraj"},
                {"E", "Pardubický kraj"},
                {"H", "Královéhradecký kraj"},
                {"J", "Kraj Vysočina"},
                {"K", "Karlovarský kraj"},
                {"L", "Liberecký kraj"},
                {"M", "Olomoucký kraj"},
                {"P", "Plzeňský kraj"},
                {"S", "Středočeský kraj"},
                {"T", "Moravskoslezský kraj"},
                {"U", "Ústecký kraj"},
                {"Z", "Zlínský kraj"}
        };
String kraj = "";

        for (int i = 0; i < znacky.length; i++) {
            if (pismeno.equals(znacky[i][0])) {
                kraj = znacky[i][1];
            }
            }
        return kraj;
    }

    }
