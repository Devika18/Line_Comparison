import java.util.Random;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        Integer x1 = 9;
        Integer y1 = 5;
        Integer x2 = 6;
        Integer y2 = 8;
        double lengthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length of Line is: "+lengthOfLine);

        boolean result1 = x1.equals(y1);
        System.out.println("Result of equals()="+result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result of equals()="+result2);

        int compareLength1 = Integer.compare(x1,y1);
        System.out.println("Result of compare(x1,y1)is:"+ compareLength1);
        int compareLength2 = Integer.compare(x2,y2);
        System.out.println("Result of compare(x2,y2)is:"+ compareLength2);
    }
}
