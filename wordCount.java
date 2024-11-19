import java.util.*;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	public int numberOfWords(String statement) {
		
		String [] words =  statement.split(" ");
		int number = 0;
		
		for(int i = 0; i < words.length ; i++) {
		number++;
		}
		
	return number;
	}

}
