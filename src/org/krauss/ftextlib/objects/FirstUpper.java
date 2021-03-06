package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *         <b>FirstUpper</b> turns the initial letter of each word into upper
 *         case.
 *
 *         Example: <i>hello</i> becomes <b>H</b>ello
 *
 */
public class FirstUpper extends Filter {

	@Override
	public String applyFilter(String txt) {
		String result = "";

		// txt can't be null
		if (txt == null) {
			return "It can't be null";
		}

		// txt can't be empty
		if (txt.equalsIgnoreCase("")) {
			return "It can't be empty";
		}

		String[] t = txt.replaceAll("\\s+", " ").split(" ");
		for (String x : t) {
			result += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
		}
		
		return result;

	}

}
