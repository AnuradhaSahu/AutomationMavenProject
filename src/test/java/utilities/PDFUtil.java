package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFUtil {
	
	public static String getPDFText(String fileName) {
			
		String text = "";
		
		try {
			//read any file in java
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\File\\"+fileName);
			
			//load pdf file into PDD document class to read it 
			PDDocument  document = PDDocument.load(fis);
			
			//copy text from pdf file
			PDFTextStripper pdf = new PDFTextStripper();
			
			//adding spefici pages to copy text
			pdf.setStartPage(1);
			pdf.setEndPage(2);
			
			text = pdf.getText(document);
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return text;
	}

}
