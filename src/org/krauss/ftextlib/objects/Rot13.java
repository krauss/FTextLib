package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>Rot13</b> filter works by replacing a letter with the its 13th succeeding<br>
 *	letter it in the alphabet.
 *
 *	Example:
 *	<ul>  
 *		<li><b>a</b> becomes <b>n</b></li>
 *		<li><b>b</b> becomes <b>o</b></li>
 *		<li><b>c</b> becomes <b>p</b></li>
 *	</ul>
 *	<i>earth isn't flat</i> becomes <b>rnegu vfag syng</b> 
 */
public class Rot13 extends Filter{

	@Override
	public String processFilter(String txt) {
		String tmp = txt;
		String result = "";

		for (int i = 0; i < txt.length(); i++) {
			if (!Character.isWhitespace(tmp.charAt(i))) {
				for (int x = 0; x < 13; x++) {
					if (tmp.charAt(i) == alphabet[x]) {
						result += alphabet[x+13];
					} else if (tmp.charAt(i) == ALPHABET[x]) {
						result += ALPHABET[x+13];
					} else if (tmp.charAt(i) == alphabet[x+13]) {
						result += alphabet[x];
					} else if (tmp.charAt(i) == ALPHABET[x+13]) {
						result += ALPHABET[x];
					}
				}
			} else {
				result += ' ';
			}
		}
		return result;
	}

}
