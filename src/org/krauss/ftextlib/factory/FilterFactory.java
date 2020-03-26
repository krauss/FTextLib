package org.krauss.ftextlib.factory;

import org.krauss.ftextlib.def.EFilter;
import org.krauss.ftextlib.def.Filter;
import org.krauss.ftextlib.objects.*;

public class FilterFactory {
	
	/**
	 * 
	 * @param filtertype - the enum EFilter to be applied on the text
	 * @param text - the text to be filtered
	 * @return - the text processed through the filter
	 * 
	 */
	public static Filter getFilter(EFilter filtertype, String text){
		Filter f = null;
		
		if(filtertype == null){
			return null;
		} 
		
		
		switch (filtertype) {
		
		case FIRST_UPPER:
			f = new FirstUpper(text);
			break;
		case NO_VOWEL:
			f = new NoVowel(text);
			break;
		case NO_SPACE:
			f = new NoSpace(text);
			break;
		case ROT13:
			f = new Rot13(text);
			break;
		case ATBASH:
			f = new Atbash(text);
			break;
		case PIG_LATIM:
			f = new PigLatim(text);
			break;
		case OPISH:
			f = new Opish(text);
			break;
		case REVERSE:
			f = new Reverse(text);
			break;
		default:
			break;
		}
		
		return f;
	}

}
