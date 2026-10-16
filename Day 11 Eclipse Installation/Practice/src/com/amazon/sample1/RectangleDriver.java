package com.amazon.sample1;

public class RectangleDriver {

	public static void main(String[] args) {
		double l = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		Rectangle rec = new Rectangle(l, b);
		rec.calculator();
	}

}
