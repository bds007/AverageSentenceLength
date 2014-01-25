import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class AverageSentenceLength {
	
	/*
	 * @input - File name: input file (*.txt)
	 * @input - delimitter marker: -d
	 * @input - delimitter symbol: string("")
	 * @input - Minimum word marker: -l
	 * @input - minimum word length: int(x)
	 */
	public static void main(String[] args) throws IOException{
		
		String file = args[0];
		String delimitter = args[2];
		int minLength = Integer.parseInt(args[4]);
		
		Scanner reader = new Scanner (new FileInputStream(file));  
		
		if (delimitter.equals("."))  
			delimitter = "\\.";
		
		String text = "";
		int numberOfValidWords = 0;
		
		while (reader.hasNext()) 
		{
			String nextWord = reader.next();
			if (nextWord.length() >= minLength)
			{
				text = text + nextWord +" ";
				numberOfValidWords++;
			}
		}
		text = text.trim();
		int numberOfValidSentences = (text.split(delimitter)).length;
		
		System.out.println((int)(numberOfValidWords/numberOfValidSentences));
		
		
	
	}

}
