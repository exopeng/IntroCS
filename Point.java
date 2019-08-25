public class Point {

    private double x;
    private double y;

    public Point(double xPosition, double yPosition) {
        x = xPosition;
		y = yPosition;
    }
    
    public double getX() {
    	return x;
    }
    
    public double getY() {
    	return y;
    }
    
    public String toString() {
    	return "(" + x + ", " + y +")";
    }
    
    public boolean equals(Point p) {
    	return x == p.x && y == p.y;
    }
}
