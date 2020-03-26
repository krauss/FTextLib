package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>NoSpace</b> filter works by removing all the spaces within a word.
 *	
 *	Example:
 *	<i>Hello world!</i> becomes <b>Helloworld!</b>
 *
 */
public class NoSpace extends Filter{


	@Override
	public String processFilter(String text) {
		return  text.replaceAll("\\s+", "");
	}
		
}
