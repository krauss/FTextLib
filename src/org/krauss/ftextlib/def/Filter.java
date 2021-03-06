package org.krauss.ftextlib.def;


/**
 * 
 * @author jrkrauss
 *	<p>
 *	Abstract class that represents an object Filter. As more text filters are added, 
 *	this class has to be extended in order to be used by the FilterFactory.
 */
public abstract class Filter {

	protected String filteredText;
	protected String expression = "[^aeiouAEIOU]";
	protected char[] vowel = {'a','e','i','o','u'};
	protected char[] VOWEL = {'A','E','I','O','U'};
	protected char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	protected char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	/*
	 * 
	 * The filter method to be overridden when this class is extended
	 * 
	 */	
	public abstract String applyFilter(String txt);

}
