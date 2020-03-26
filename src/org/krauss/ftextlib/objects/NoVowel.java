package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>NoVowel</b> filter removes all the vowels within the word/text.
 *
 *	Example:
 *	<i>Hell of world!</i> becomes <b>Hll f wrld!</b>
 */
public class NoVowel extends Filter{

	@Override
	public String applyFilter(String txt) {		
		return txt.replaceAll("[aeiouAEIOU]", ""); 
	}

}
