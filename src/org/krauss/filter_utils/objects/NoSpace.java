package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>NoSpace</b> filter works by removing all the spaces within a word.
 *
 */
public class NoSpace extends Filter{
		

	public NoSpace(String text) {
		super(text);
	}

	@Override
	public String processFilter() {
		
		this.filteredText = rawText.replaceAll("\\s+", "");;
		return filteredText;
	}
		
}
