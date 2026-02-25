package cviceni;

public class pr3 {
    public static void main(String[] args) {
        int[] pole = {0,2,99,4,5,100,20,30,40,50};

        System.out.println(max(pole));
        System.out.println(min(pole));
    }

    public static int max(int[] pole){
        int nejvetsi=pole[0];
        for( int cislo:pole)

            if (cislo>nejvetsi){
                nejvetsi =cislo;
            }
        return nejvetsi;
    }

    public static int min(int[] pole){
        int nejmensi=pole[0];
        for( int cislo:pole)

            if (cislo<nejmensi){
                nejmensi =cislo;
            }
        return nejmensi;
    }
}
