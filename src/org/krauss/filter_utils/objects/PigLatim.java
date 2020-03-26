package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

/**
 * @author jrkrauss
 *	<p>
 *	<b>PigLatim</b> filter works this way: <br>
 *	For words beginning with consonant sounds, all letters before the initial vowel are placed at the end of<br>
 *	the word sequence and then, "ay" is appended.
 *
 */
public class PigLatim extends Filter {
	
	RegularExpression expresion = new RegularExpression("[^aeiouAEIOU]");
	
	public PigLatim(String text) {
		super(text);
	}

	@Override
	public String processFilter() {
		
		
		String result = "";
		String[] t = rawText.replaceAll("\\s+", " ").split(" ");
		
		for (String x : t) {
			if(expresion.matches(x.charAt(0)+"")){				
				result += x.substring(1) + x.substring(0, 1) + "ay ";
			} else {
				result += x + "way ";
			}
		}
		
		this.filteredText = result;
		return filteredText;
	}

}
