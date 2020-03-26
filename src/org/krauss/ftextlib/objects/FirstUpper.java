package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>FirstUpper</b> turns the initial letter of each word into upper case.
 *
 *	Example:
 *	 <i>hello</i> becomes <b>H</b>ello
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
