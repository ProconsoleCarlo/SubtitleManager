package tests;

import java.io.File;
import java.util.ArrayList;

import utils.FileLoaderWriter;

/**
 * Test the correctly reading of .srt and .sub as text files
 * @author Carlo Bobba
 */
public class Test01 {
	public static void main(String[] args) {
		FileLoaderWriter fileLoaderWriter = new FileLoaderWriter();
		File srtFile = new File("dataTests/Aeon Flux.srt");
		File subFile = new File("dataTests/Aeon Flux.sub");
		ArrayList<String> srt = fileLoaderWriter.load(srtFile);
		ArrayList<String> sub = fileLoaderWriter.load(subFile);
		System.err.println("Srt");
		for (int i = 0; i < srt.size(); i++) {
			System.err.println(srt.get(i));
		}
		System.err.println("Sub");
		for (int i = 0; i < sub.size(); i++) {
			System.err.println(sub.get(i));
		}
	}
}
