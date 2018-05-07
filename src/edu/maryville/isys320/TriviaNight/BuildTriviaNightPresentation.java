package edu.maryville.isys320.TriviaNight;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BuildTriviaNightPresentation {

	private static final boolean String = false;


	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "TriviaNight.pptx";
		SlideShowBuilder builder = new SlideShowBuilder();
		QuestionsManager qm = new QuestionsManager("data");
		
		builder.buildSlideShow(qm.getCategories(), qm.getQuestions(), qm.getAnswers(), fileName);
//		builder.printSlideShowInfo("Sample.pptx");

	}
	
}