
public class Main {
    public static void main(String[] args) {
        pozdrav("Ahoj",1);
        System.out.println();
        pozdrav("Nazdar",2);
        System.out.println();

        int cast1 = objemKvadru(10, 20, 30);
        int cast2 = objemKvadru(25, 25, 5);

        System.out.println("Celkem: "+(cast1+cast2));

    }
    //tahle část je v public class Main ale není ve static void main
    private static void pozdrav(String text,int pocet){
        for (int i = 0; i < pocet; i++) {
            System.out.println(text);
        }
    }
    public static int objemKvadru(int a,int b, int c){
        int vysledek = a*b*c;

        return vysledek;
    }
}
