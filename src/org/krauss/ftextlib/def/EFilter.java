package org.krauss.ftextlib.def;

/**
 * 
 * All the Filters available in the library.
 * 
 * @author jrkrauss
 *
 */
public enum EFilter {
	
	/**
	 *	<b>FirstUpper</b> turns the initial letter of each word into upper case.
	 *
	 *	Example:
	 *	 <i>hello</i> becomes <b>H</b>ello
	 *
	 */
    FIRST_UPPER("First Upper"),
    NO_SPACE("No Space"),
    NO_VOWEL("No Vowel"),
    ROT13("Rot13"),
    ATBASH("Atbash"),
    PIG_LATIM("Pig Latim"),
    OPISH("Opish"),
    REVERSE("Reverse");

    private String name;

    private EFilter(String name){
        this.name = name;
    }
    
    
    
}

