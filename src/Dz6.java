import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class DZ6 {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 9;
        double result = Math.abs(a - b) / Math.pow((a + b),3) - Math.sqrt(c);
        System.out.println("Result is: " + result);
    }
}
