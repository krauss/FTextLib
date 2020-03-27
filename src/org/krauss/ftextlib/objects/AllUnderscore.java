package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>AllUnderscore</b> filter works by replacing all the spaces by an _ (underscore).
 * 
 *	Example: <i>Hello world!</i> becomes <b>Hello_world!</b>
 *
 */
public class AllUnderscore extends Filter {

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

		return txt.replaceAll("\\s+", "_");
	}

}
