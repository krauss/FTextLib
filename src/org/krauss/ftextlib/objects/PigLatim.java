package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>PigLatim</b> filter works by appending an 'way' at the end of each word.
 *	 - If the word starts with a vowel, just append 'way'
 *	 - If the word starts with a consonant, bring that consonant to the end and append 'ay'
 *	
 *	Example:
 *	<i>economy sucks</i> becomes <b>economyway uckssay</b>
 *
 */
public class PigLatim extends Filter {


	@Override
	public String applyFilter(String txt) {	
		
		String result = "";
		String[] t = txt.replaceAll("\\s+", " ").split(" ");
		
		for (String x : t) {
			if(expresion.matches(x.charAt(0)+"")){				
				result += x.substring(1) + x.substring(0, 1) + "ay ";
			} else {
				result += x + "way ";
			}
		}
		return result;
	}

}
