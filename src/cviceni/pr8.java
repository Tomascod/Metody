package cviceni;

import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        System.out.println(dny());
    }
    public static Integer dny(){
        int odZacatku = 0;
        String[] mesice = {"Leden", "Únor", "Březen", "Duben", "Květen", "Červen", "Červenec", "Srpen", "Září", "Říjen", "Listopad", "Prosinec"};
        int[] dny = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.println("je rok přestupný? (true/false)");
        boolean prestupny = input.nextBoolean();
        System.out.println("zadejte den");
        int inp =  input.nextInt();
        System.out.println("zadejte měsíc");
        String mesic = input.next();

        for (int i = 0; i < mesice.length; i++) {
            if (prestupny){
                dny[1] = 29;
            }
            if (mesice[i].equalsIgnoreCase(mesic)) {
                odZacatku+= inp;
                break;
            }else  {
                odZacatku+=dny[i];
            }
        }
        return odZacatku;
    }
}
