import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 * Returns the average number length of the sentances contained in a text
 * file based on user's defined sentence delimitter and user's defined
 * minimum number of character length for word. The input file must be a
 * plain text file and langauge is English. Only one delimitter to separate 
 * sentences are allowed.   
 * <p>
 * There is only one method and parameters are supplied as arguments. 
 * There are four parameter requried. The parameters must be passed in the
 * exact order as defined below:
 * 
 * @param  filename a name of text file (or full path of the text file) 
 * 					The text file contains sentences written in English.
 * @param  -d		This parameter indicates that next parameter is 
 * 					sentence delimitter. 
 * @parameter -l	This parmaeter indicates that the next parameter is
 * 					minimum number of character to be considered a 'word'.
 * @return      	Average legnth of sentence for qualified words rounded down to 
 * 					nearest integer. 
 */




public class AverageSentenceLength {
	
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
		
		//System.out.println((int)(numberOfValidWords/numberOfValidSentences));
		
		System.out.println("Output: " + (int)(numberOfValidWords/numberOfValidSentences));
	
	
	}

}
