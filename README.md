## FTextLib

#### How to use

Download the [jar file](lib/) into your project's folder and import it into your project's path.
Once you've done that, that's how you use in your code:

```
import org.krauss.ftextlib.def.EFilter;
import org.krauss.ftextlib.factory.FilterFactory;
```

Then using the `FilterFactory` class, you can create a filter and apply it straight away like this:

```
FilterFactory.getFilter(EFilter.REVERSE).applyFilter("Hell of world!");
```

The static method `getFilter` receives two arguments: `EFilter` and a `String` text.

The method `applyFilter` returns a String with text already processed.

At the moment, these are all the filters available:

Filter | Description
------ | -----------
`FIRST_UPPER` | Turns upper case all first letters
`NO_SPACE` | Removes all the blank space
`NO_VOWEL` | Removes all the vowels 
`ROT13` | Replaces a letter with the its 13th succeeding one it in the alphabet
`ATBASH` | Replaces 'a' with 'z', 'b' with 'y', 'c' with 'x' and so on 
`PIG_LATIM` | Appends an 'ay' at the end of the word if it starts with a vowel
`OPISH` | Adds 'op' after every consonant 
`REVERSE` | Reverses the word 
 
 