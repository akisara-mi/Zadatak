import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] nizPojmova = new String[]{"bicikl", "automobil","mobilni telefon"};
        String[] nazivPojmova = new String[]{"BMX", "Polo","i-Phone"};
        Double[] cene = new Double[]{50.5, 1000.0, 500.0};

        for (int i = 0; i < nazivPojmova.length; i++){

            System.out.println(nazivPojmova[i] +  " is type" + " "+  nizPojmova[i] +" and its cost " +cene[i]);

        }





    }


}
