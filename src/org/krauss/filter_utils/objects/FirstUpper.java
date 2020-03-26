package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>FirstUpper</b> turns the initial letter of each word into upper case.
 *
 */
public class FirstUpper extends Filter{

	public FirstUpper(String text) {
		super(text);
	}

	@Override
	public String processFilter() {
		String result = "";
		String[] t = rawText.replaceAll("\\s+", " ").split(" ");
		for (String x : t) {
			result += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
		}
		
		this.filteredText = result;
		return filteredText;
	}
	
		
	

}
