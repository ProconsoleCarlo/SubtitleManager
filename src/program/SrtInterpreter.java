package program;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import utils.FileLoaderWriter;

public class SrtInterpreter {
	
	private FileLoaderWriter fileLoaderWriter = new FileLoaderWriter();
	
	public ArrayList<Subtitle> readSrt(File srtFile) {
		ArrayList<Subtitle> subtitles = new ArrayList<>();
		try {
		ArrayList<String> srt = fileLoaderWriter.load(srtFile);
			for (int i = 0; i < srt.size(); i++) {
				int index = Integer.valueOf(srt.get(i));
				i++;
				String[] timeSplitted = srt.get(i).split(" --> ");
				SimpleDateFormat ora = new SimpleDateFormat("HH:mm:ss,SSS");
				Date startTime = ora.parse(timeSplitted[0]);
				Date endTime = ora.parse(timeSplitted[1]);
				i++;
				String text = "";
				while (!srt.get(i).equals("")) {
					text = text+"\n"+srt.get(i);
					i++;
					if (i >= srt.size()) {
						break;
					}
				}
				subtitles.add(new Subtitle(index, startTime, endTime, text));
			}
		} catch (ParseException e) {
			System.err.println("problema date");
		}
		return subtitles;
	}
}
