

public class Rectangle {
	double length;
	double breadth;

	Rectangle() {
		length = 1.0;
		breadth = 1.0;
	}

	Rectangle(double _length, double _breadth) {
		this.length = _length;
		System.out.println("Length : " + length);
		this.breadth = _breadth;
		System.out.println("Breadth : " + breadth);

	}

	public void calculator() {
		double area = length * breadth;
		System.out.println("Rectangle area : " + area);

	}

}
