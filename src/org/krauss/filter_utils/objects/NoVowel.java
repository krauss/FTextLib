package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

/**
 * @author jrkrauss
 *	<p>
 *	<b>NoVowel</b> filter removes all the vowels within the word/text.
 *
 */
public class NoVowel extends Filter{

	public NoVowel(String text) {
		super(text);
	}

	@Override
	public String processFilter() {		
		
		this.filteredText = rawText.replaceAll("[aeiouAEIOU]", "");;		
		return filteredText; 
	}

}
