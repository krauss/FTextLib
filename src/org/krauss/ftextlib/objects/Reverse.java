package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>Reverse</b> filter works by simply reversing the word.
 *
 *	Example:
 *		<b>radio</b> becomes <b>oidar</b>
 */
public class Reverse extends Filter {

	@Override
	public String applyFilter(String txt) {
		
		String result = "";
		String[] t = txt.replaceAll("\\s+", " ").split(" ");
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length(); j++) {
				result += t[i].charAt((t[i].length() - 1) - j);
			}
			result += " ";
			
		}
		return result;
	}

}
