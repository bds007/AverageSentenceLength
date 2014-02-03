import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//<<<<<<< HEAD
/**
 * Returns the average number length of the sentences contained in a text
 * file based on user's defined sentence delimiter and user's defined
 * minimum number of character length for word. The input file must be a
 * plain text file and language is English. Only one delimiter to separate 
 * sentences are allowed.   
 * <p>
 * There is only one method and parameters are supplied as arguments. 
 * There are four parameter required. The parameters must be passed in the
 * exact order as defined below:
 * 
 * @param  filename a name of text file (or full path of the text file) 
 * 					The text file contains sentences written in English.
 * @param  -d		This parameter indicates that next parameter is 
 * 					sentence delimiter. 
 * @parameter -l	This parameter indicates that the next parameter is
 * 					minimum number of character to be considered a 'word'.
 * @return      	Average length of sentence for qualified words rounded down to 
 * 					nearest integer. 
 */




//=======
//>>>>>>> origin/WorkingBranch
public class AverageSentenceLength {
	
	public static void main(String[] args) throws IOException{
		
		ArrayList<String> delimiterList = new ArrayList<String>();
		
		String delimiter="";
		for (int i = 0; i < args.length; i++)
		{	
			if (args[i].equals("-d")) {
				delimiter = delimiter + args[i+1];
				i=i+1;
			}
		}
		
		System.out.println(delimiter);
		
		
		String file = args[0];
		int minLength = Integer.parseInt(args[4]);
		
		Scanner reader = new Scanner (new FileInputStream(file));  
		
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
		System.out.println(text);
		int numberOfValidSentences = (text.split("["+delimiter+"]")).length;
		
//<<<<<<< HEAD
		//System.out.println((int)(numberOfValidWords/numberOfValidSentences));
		
		System.out.println("Output: " + (int)(numberOfValidWords/numberOfValidSentences));
	
//=======
		//System.out.println((int)(numberOfValidWords/numberOfValidSentences));
		
		
//>>>>>>> origin/WorkingBranch
	
	}

}
