public class Barber {
    String name;
    int experience;
    double price;
    Barber(String name, int experience, double price){
        this.name = name;
        this.experience = experience;
        this.price = price;
    }
    void barb(){
        System.out.println(this.name + " is barbing a customer");
    }
    void sayPrice(){
        System.out.println(this.name + " charges $" + this.price + " for the haircut.");
    }
    void sayExperience(){
        System.out.println(this.name + " has " + this.experience + " years of experience");
    }
}
