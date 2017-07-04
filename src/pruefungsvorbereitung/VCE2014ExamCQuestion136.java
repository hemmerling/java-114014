package pruefungsvorbereitung;

class Line {
	public class Point { 
		public int x,y;
	}
	
	public Point getPoint() { 
		return new Point(); 
	}
}

class Triangle {
	public Triangle() {
		// - Cannot make a static reference to the non-static method getPoint() from the type Line
		// - Point cannot be resolved to a type
		Point p1 = Line.getPoint(); 

		// Cannot make a static reference to the non-static method getPoint() from the type Line
		Line.Point p2 = Line.getPoint();

		// Point cannot be resolved to a type
		Point p3 = (new Line()).getPoint();
		
		Line.Point p4 = (new Line()).getPoint();
	}
}

public class VCE2014ExamCQuestion136 {
	public static void main(String[] args) {
	}
}
