package tests;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import program.SrtInterpreter;
import program.Subtitle;

public abstract class Test02 {

	public static void main(String[] args) {
		SrtInterpreter srtInterpreter = new SrtInterpreter();
		ArrayList<Subtitle> subtitles = srtInterpreter.readSrt(new File("dataTests/Aeon Flux.srt"));
		for (int i = 0; i < subtitles.size(); i++) {
			System.err.println(subtitles.get(i));
		}
		
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("<html><s>prova</s></html>");
		frame.add(label);
		frame.setVisible(true);

	}

}
