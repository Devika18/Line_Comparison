import java.util.Random;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        int x1 = 9;
        int y1 = 5;
        int x2 = 6;
        int y2 = 8;
        double length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length Of Line is:"+length);
    }
}
