package org.krauss.ftextlib.objects;


import org.krauss.ftextlib.def.Filter;

/**
 * @author jrkrauss
 *         <p>
 *         <b>Carioca Accent</b> 
 *         Replaces all words ending in '[aeiou]s' with '[aeiou]ix'. This filter only makes sense when used with portuguese language
 *
 *         Example:
 *         <ul>
 *         <li><b>pessoas</b> becomes <b>pessoaix</b></li>
 *         <li><b>casas</b> becomes <b>casaix</b></li>
 *         <li><b>tres</b> becomes <b>treix</b></li>
 *         </ul>
 */
public class CariocaAccent extends Filter {

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
		String result = "";
		
		for (String word : txt.split(" ")) {
			
			if (word.endsWith("as") || word.endsWith("az"))
				
				result += word.substring(0, word.length() - 2) + "aix ";
			
			else if (word.endsWith("es") || word.endsWith("ez")) {
				
				result += word.substring(0, word.length() - 2) + "eix ";
				
			} else if (word.endsWith("is") || word.endsWith("iz")) {
				
				result += word.substring(0, word.length() - 2) + "ix ";
				
			} else if (word.endsWith("os") || word.endsWith("oz")) {
				
				result += word.substring(0, word.length() - 2) + "oix ";
				
			} else if (word.endsWith("us") || word.endsWith("uz")) {
				
				result += word.substring(0, word.length() - 2) + "ux ";
				
			} else {
				
				result += word + " ";
				
			}
		}
		
		return result;
		
	}

}
