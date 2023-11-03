import java.util.Random;

public class Roller {
    Random random = new Random();
    int output = 0;
//    Roller(){
//       roll();
//    }
    int roll(){
        return output = random.nextInt((6)+1);
    }
}
