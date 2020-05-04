package org.krauss.ftextlib.main;

import java.util.Scanner;
import org.krauss.ftextlib.def.EFilter;
import org.krauss.ftextlib.factory.FilterFactory;


public class MainConsole {
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence_regex = "^\\D+$";
		String input = "";
		EFilter filter = null;
		boolean isFilterPicked = false;
		
		System.out.println("+------------------------------+");
		System.out.println("|                              |");
		System.out.println("|   Welcome to the FTextLib    |");
		System.out.println("|    library usage sample.     |");
		System.out.println("|                              |");
		System.out.println("|   - A simple text filter     |");
		System.out.println("|     library for playing      |");
		System.out.println("|     around with words and    |");
		System.out.println("|     sentences                |");
		System.out.println("|                              |");
		System.out.println("+------------------------------+\n");
		System.out.println("1. Choose a filter:\n");
		System.out.println("[1] FIRST_UPPER\t\tTurns upper case all first letters");
		System.out.println("[2] NO_SPACE\t\tRemoves all the white spaces");
		System.out.println("[3] NO_VOWEL\t\tRemoves all the vowels");
		System.out.println("[4] ROT13\t\tReplaces a letter with the its 13th succeeding one it in the alphabet");
		System.out.println("[5] ATBASH\t\tReplaces 'a' with 'z', 'b' with 'y', 'c' with 'x' and so on");
		System.out.println("[6] PIG_LATIM\t\tAppends an 'ay' at the end of the word if it starts with a vowel");
		System.out.println("[7] OPISH\t\tAdds 'op' after every consonant");
		System.out.println("[8] REVERSE\t\tReverses each word");
		System.out.println("[9] ALL_UNDERSCORE\tTurns all white spaces in underscore\n");
		
		do {
			
			System.out.print("Filter [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ]: ");		
			input = in.nextLine();
			Integer language = Integer.parseInt(input);
			
			if (language == 1) {
				filter = EFilter.FIRST_UPPER;
				isFilterPicked = true;
			} else if (language == 2) {
				filter = EFilter.NO_SPACE;
				isFilterPicked = true;
			} else if (language == 3) {
				filter = EFilter.NO_VOWEL;
				isFilterPicked = true;
			} else if (language == 4) {
				filter = EFilter.ROT13;
				isFilterPicked = true;
			} else if (language == 5) {
				filter = EFilter.ATBASH;
				isFilterPicked = true;
			} else if (language == 6) {
				filter = EFilter.PIG_LATIM;
				isFilterPicked = true;
			} else if (language == 7) {
				filter = EFilter.OPISH;
				isFilterPicked = true;
			} else if (language == 8) {
				filter = EFilter.REVERSE;
				isFilterPicked = true;
			} else if (language == 9) {
				filter = EFilter.ALL_UNDERSCORE;
				isFilterPicked = true;
			}
			
		} while (isFilterPicked == false);
			
		System.out.println();
		System.out.println();
				
		do {
			System.out.print("2. Type the sentence (no numbers): ");
			input = in.nextLine();
			
		} while (!input.matches(sentence_regex));
		
		System.out.println();
		System.out.println("3. Result: "+FilterFactory.getFilter(filter).applyFilter(input));
		System.out.println();
		in.close();

	}

}
