package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(.5, .9, 0.3, 0.1);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(.5, .7, 0.3, 0.1);
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.5, .5, 0.3, 0.1);
		
	
	
		StdDraw.show();
		
	}
}