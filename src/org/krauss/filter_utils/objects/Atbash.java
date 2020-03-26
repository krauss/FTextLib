package org.krauss.filter_utils.objects;

import org.krauss.filter_utils.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *	<b>Atbash</b> filter works by replacing the first letter of the alphabet for the last letter,<br>
 *	the second letter for the second last and so on, effectively reversing the alphabet.
 *
 *	Example:
 *	<ul>  
 *		<li><b>a</b> becomes <b>z</b></li>
 *		<li><b>b</b> becomes <b>y</b></li>
 *		<li><b>c</b> becomes <b>x</b></li>
 *	</ul>
 */
public class Atbash extends Filter{

	public Atbash(String text) {
		super(text);
	}

	@Override
	public String processFilter() {
		String tmp = rawText;
		String result = "";

		for (int i = 0; i < rawText.length(); i++) {
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
		this.filteredText = result;
		return filteredText;

	}

}
