package org.krauss.ftextlib.objects;

import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>Atbash</b> filter works by replacing the first letter of the alphabet for the last letter,<br>
 *	the second letter for the second last and so on, effectively reversing the alphabet.
 *
 *	Example:
 *	<ul>  
 *		<li>every <b>a</b> becomes <b>z</b></li>
 *		<li>every <b>b</b> becomes <b>y</b></li>
 *		<li>every <b>c</b> becomes <b>x</b></li>
 *	</ul>
 * <i>politian cocksuckers</i> becomes <b>klorgrzm xlxphfxpvih</b>
 * 
 */
public class Atbash extends Filter{

	public Atbash() {
		super();
	}

	@Override
	public String processFilter(String txt) {
		String tmp = txt;
		String result = "";

		for (int i = 0; i < txt.length(); i++) {
			if (!Character.isWhitespace(tmp.charAt(i))) {
				for (int x = 0; x < 26; x++) {
					if (tmp.charAt(i) == alphabet[x]) {
						result += alphabet[(alphabet.length - 1) - x];
					} else if (tmp.charAt(i) == ALPHABET[x]) {
						result += ALPHABET[(ALPHABET.length - 1) - x];
					}
				}
			} else {
				result += ' ';
			}
		}
		return result;

	}

}
