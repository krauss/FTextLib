package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>Reverse</b> filter works by simply reversing the word.
 *
 *	Example:
 *		<b>radio</b> becomes <b>oidar</b>
 */
public class Reverse extends Filter {
	
	

	public Reverse(String text) {
		super(text);
	}

	@Override
	public String processFilter() {
		
		String result = "";
		String[] t = rawText.replaceAll("\\s+", " ").split(" ");
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length(); j++) {
				result += t[i].charAt((t[i].length() - 1) - j);
			}
			result += " ";
			
		}
		filteredText = result;
		return filteredText;
	}

}
