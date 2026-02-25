package cviceni;

public class pr2 {
    public static void main(String[] args) {
        int[] pole = {0,2,99,4,5,100,20,30,40,50};
max(pole);
min(pole);
    }

    public static void max(int[] pole){
        int nejvetsi=pole[0];
        for( int cislo:pole)

            if (cislo>nejvetsi){
                nejvetsi =cislo;
            }
        System.out.println(nejvetsi);
    }

    public static void min(int[] pole){
        int nejmensi=pole[0];
        for( int cislo:pole)

            if (cislo<nejmensi){
                nejmensi =cislo;
            }
        System.out.println(nejmensi);
    }
}
