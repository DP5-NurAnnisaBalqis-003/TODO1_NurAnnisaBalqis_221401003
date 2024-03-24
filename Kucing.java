public class Kucing {
    
    String catname;
    String gender;
    int age;
    String color;
    double weight;
    String typeoffood;

    public Kucing(String catname, String gender, int age, String color, double weight, String typeoffood) {
        this.catname = catname;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.typeoffood = typeoffood;
    }

    public void tidur() {
        System.out.println(catname + " sedang tidur.");
    }

    public void makan() {
        System.out.println(catname + " sedang makan.");
    }

    public void meong() {
        System.out.println(catname + " suka mengeong.");
    }

    public void lari() {
        System.out.println(catname + " sedang berlari.");
    }

    public void pup() {
        System.out.println(catname + " selalu pup pada tempatnya.");
    }

    public void pee() {
        System.out.println(catname + " suka kencing sembarangan.");
    }
}
