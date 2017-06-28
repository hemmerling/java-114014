package pruefungsvorbereitung;

class Line {
public static class Point {}
public class Point2 {}
}

class Triangle1 {
	Line.Point p = new Line.Point();
}

class Triangle2 {
	Line l = new Line() ; 
	// l.Point p = new l.Point();
	Line.Point2 p1 = l.new Point2();
	Line.Point2 p2 = new Line().new Point2();
}

public class VCE2014ExamCQuestion091 {

	public static void main(String[] args) {
		Triangle1 triangle1 = new Triangle1();
		Triangle2 triangle2 = new Triangle2();
	}

}
