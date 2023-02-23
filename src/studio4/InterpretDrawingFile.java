package studio4;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		StdDraw.clear();
		
		String name = in.next();

		int r = 0;
		int g = 0;
		int b = 0 ;
		
		r = in.nextInt();
		g = in.nextInt();
		b = in.nextInt();
		
		
		
		Color black = new Color(r, g, b);
		StdDraw.setPenColor(black);
		
		boolean m = true;
		m = in.nextBoolean();
	
		double s1 = 0.0, s2=0.0, s3=0.0, s4=0.0;
		s1 = in.nextDouble();
		s2 = in.nextDouble();
		s3 = in.nextDouble();
		s4 = in.nextDouble();
	

		if (m = true) {
			StdDraw.filledRectangle(s1, s2, s3, s4);
		}
		else {
			StdDraw.rectangle(s1, s2, s3, s4);
		}
		
		StdDraw.show();
		

	}
}
