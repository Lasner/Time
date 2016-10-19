/**
 * Created by Lauri on 19.10.2016.
 */
public class Time {
    public static void main(String[] args) {

        int tund = 16;
        int minut = 5;
        int sekund = 10;

        System.out.print("Sekundeid möödas keskööst: ");
        System.out.println(tund * 3600 + minut * 60 + sekund);

        double sekundeidÖöpäevas = 24 * 3600;
        System.out.print("Sekundeid ööpäeva lõpuni: ");
        System.out.println((sekundeidÖöpäevas) - (tund * 3600 + minut * 60 + sekund));

        double kellaaegsek = tund * 3600 + minut * 60 + sekund;

        System.out.println("Päevast on möödas ");
        System.out.println(kellaaegsek/sekundeidÖöpäevas * 100 + " %");

        int tund1 = 17;
        int minut1 = 5;
        int sekund1 = 36;

        System.out.println("Selle ülesande peale on kulunud ");
        System.out.println(tund1 * 3600 + minut1 * 60 + sekund1 - kellaaegsek + " sekundit");









    }
}
