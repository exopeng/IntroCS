import java.util.Scanner;

public class PointsAndLines068V1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1, x2, y1, y2;
        Point p1, p2;
        Line line;
        
        
        System.out.println("Enter x1: ");
        x1 = s.nextDouble();
        System.out.println("Enter y1: ");
        y1 = s.nextDouble();
        
        p1 = new Point(x1, y1);
        
        System.out.println("It creates the point: " + p1);
        
        System.out.println("Enter x2: ");
        x2 = s.nextDouble();
        System.out.println("Enter y2: ");
        y2 = s.nextDouble();
        
        p2 = new Point(x2, y2);
        
        System.out.println("It creates the point: " + p2);
        
        line = new Line(p1, p2);
        
        System.out.println("Together they make the line: " + line);
		
    }
}
