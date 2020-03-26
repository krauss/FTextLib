package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

/**
 * @author jrkrauss
 *	<p>
 *	<b>Opish</b> filter works by adding an ‘op’ after each consonant.
 *
 *	Example:
 *	<i>fuck sake</i> becomes <b>fopucopkop sopakope</b> 
 */
public class Opish extends Filter {
	
	RegularExpression expresion = new RegularExpression("[^aeiouAEIOU]");

	
	public Opish(String text) {
		super(text);
	}

	
	@Override
	public String processFilter() {
		
		String result = "";
		String[] t = rawText.replaceAll("\\s+", " ").split(" ");
				
		for (String x : t) {
			for (int j = 0; j < x.length(); j++) {
				if(expresion.matches(x.charAt(j)+"")){
					result += x.charAt(j)+"op";
				}else{
					result += x.charAt(j)+"";
				}
			}
			result += " ";
		}
		this.filteredText = result;
		return filteredText;
	}

}
