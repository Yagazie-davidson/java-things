public class Coffee {
    String color;
    double temp;
    String type;
    Coffee (String color, double temp, String type){
        this.color = color;
        this.temp = temp;
        this.type = type;
    }
    void checkTemperature(){System.out.println(type + " coffee is at " + temp + "C");}
}
