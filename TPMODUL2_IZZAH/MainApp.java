public class MainApp {

    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80f);
        perangkat.informasi();

        System.out.println();
        Laptop leptop = new Laptop("Seagate", 8, 2.40f, true);
        leptop.informasi();
        leptop.bukaGame("Plan vs Zombie");
        leptop.kirimEmail("izzahkhairiyah@gmail.com");
        leptop.kirimEmail("aanarji.com", "rusmango.com");

        System.out.println("\n");

        Handphone hp = new Handphone("Sandisk", 3, 2.20f, false);
        hp.informasi();
        hp.telfon(681234567);
        hp.kirimSMS(680987654);
        hp.kirimSMS(681234567, 680987654);
    }
}