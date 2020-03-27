package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *         <b>Reverse</b> filter works by simply reversing each word in a sentence.
 *
 *         Example: <b>radio</b> becomes <b>oidar</b>
 */
public class Reverse extends Filter {

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

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length(); j++) {
				result += t[i].charAt((t[i].length() - 1) - j);
			}
			result += " ";

		}
		return result;
	}

}
