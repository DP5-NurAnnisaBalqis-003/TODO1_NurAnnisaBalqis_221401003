public class Main {
    public static void main(String[] args) {

        Kucing kucing1 = new Kucing("Billy", "Jantan", 5, "Hitam", 4, "Dry Food");
        System.out.println("Kucing 1");
        System.out.println("Nama            : " + kucing1.catname);
        System.out.println("Jenis kelamin   : " + kucing1.gender);
        System.out.println("Umur            : " + kucing1.age + " tahun");
        System.out.println("Warna           : " + kucing1.color);
        System.out.println("Berat tubuh     : " + kucing1.weight + " Kg");
        System.out.println("Jenis makanan   : " + kucing1.typeoffood);
        kucing1.tidur();
        kucing1.makan();
        kucing1.meong();                                                                                      
        kucing1.lari();
        kucing1.pup();
        kucing1.pee();
        System.out.println();

        Kucing kucing2 = new Kucing("Molly", "Betina", 3, "Coklat", 4, "Dry Food");
        System.out.println("Kucing 2");
        System.out.println("Nama            : " + kucing2.catname);
        System.out.println("Jenis kelamin   : " + kucing2.gender);
        System.out.println("Umur            : " + kucing2.age + " tahun");
        System.out.println("Warna           : " + kucing2.color);
        System.out.println("Berat tubuh     : " + kucing2.weight + " Kg");
        System.out.println("Jenis makanan   : " + kucing2.typeoffood);
        kucing2.tidur();
        kucing2.makan();
        kucing2.meong();
        kucing2.lari();
        kucing2.pup();
        kucing2.pee();
        System.out.println();

        Kucing kucing3 = new Kucing("Lulu", "Betina", 2, "Putih", 3, "Wet Food");
        System.out.println("Kucing 3");
        System.out.println("Nama            : " + kucing3.catname);
        System.out.println("Jenis kelamin   : " + kucing3.gender);
        System.out.println("Umur            : " + kucing3.age + " tahun");
        System.out.println("Warna           : " + kucing3.color);
        System.out.println("Berat tubuh     : " + kucing3.weight + " Kg");
        System.out.println("Jenis makanan   : " + kucing3.typeoffood);
        kucing3.tidur();
        kucing3.makan();
        kucing3.meong();
        kucing3.lari();
        kucing3.pup();
        kucing3.pee();
        System.out.println();
    }
}
