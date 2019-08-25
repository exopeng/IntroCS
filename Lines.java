public class Line {

    private Point start;
    private Point end;

    public Line(Point a, Point b) {
        start = a;
		end = b;
    }
	/** gets the slope of line
	/*@return slope of 2 points
	*/
    public double slopeLine() {
        return (getY(start) - getY(end))/(getX(start) - getX(end));
    }
    
    public Point getStart() {
    	return start;
    }
    
    public Point getEnd() {
    	return end;
    }
    
    public String toString() {
    	return start + " -> " + end + ". Slope = " + slopeLine();
    }
    
    public boolean equals(Line l) {
    	return start.equals(l.start) && end.equals(l.end);
    }
}
