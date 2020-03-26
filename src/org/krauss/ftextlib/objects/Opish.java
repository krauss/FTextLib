package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>Opish</b> filter works by adding an ‘op’ after each consonant.
 *
 *	Example:
 *	<i>fuck sake</i> becomes <b>fopucopkop sopakope</b> 
 */
public class Opish extends Filter {

	@Override
	public String applyFilter(String txt) {
		
		String result = "";
		String[] t = txt.replaceAll("\\s+", " ").split(" ");
				
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
		return result;
	}

}
