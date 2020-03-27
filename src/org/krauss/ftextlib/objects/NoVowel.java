package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *         <b>NoVowel</b> filter removes all the vowels within the word/text.
 *
 *         Example: <i>Hell of world!</i> becomes <b>Hll f wrld!</b>
 */
public class NoVowel extends Filter {

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
		
		return txt.replaceAll("[aeiouAEIOU]", "");
	}

}
