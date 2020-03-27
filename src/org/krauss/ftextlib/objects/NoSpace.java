package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *         <b>NoSpace</b> filter works by removing all the spaces within a word.
 * 
 *         Example: <i>Hello world!</i> becomes <b>Helloworld!</b>
 *
 */
public class NoSpace extends Filter {

	@Override
	public String applyFilter(String txt) {
		// txt can't be null
		if (txt == null) {
			return "It can't be null";
		}

		// txt can't be empty
		if (txt.equalsIgnoreCase("")) {
			return "It can't be empty";
		}

		return txt.replaceAll("\\s+", "");
	}

}
