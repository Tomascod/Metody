package cviceni;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
dny();

    }
    public static void dny(){
        int odZacatku = 0;
        String[] mesice = {"Leden", "Únor", "Březen", "Duben", "Květen", "Červen", "Červenec", "Srpen", "Září", "Říjen", "Listopad", "Prosinec"};
        int[] dny = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.println("zadejte den");
        int inp =  input.nextInt();
        System.out.println("zadejte měsíc");
        String mesic = input.next();

        for (int i = 0; i < mesice.length; i++) {
            if (mesice[i].equalsIgnoreCase(mesic)) {
                odZacatku+= inp;
                break;
            }else  {
                odZacatku+=dny[i];
            }
        }
        System.out.println(odZacatku);
    }
}
