package org.krauss.filter_utils.def;

/**
 * 
 * All the Filters available in the library.
 * 
 * @author jrkrauss
 *
 */
public enum EFilter {

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

