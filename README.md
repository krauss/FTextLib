## FTextLib

#### What is it?

FTextLib is a simple JAVA library that implements some of the most common text filters available out there. 

#### How to use

Download the [jar file](lib/) into your project's folder and import it into your project's path.
Once you've done that, that's how you use in your code:

```java
import org.krauss.ftextlib.def.EFilter;
import org.krauss.ftextlib.factory.FilterFactory;
```

Then using the `FilterFactory` class, you can create a filter and apply it straight away like this:

```java
FilterFactory.getFilter(EFilter.REVERSE).applyFilter("Hell of world!");


Output:

"lleH fo !dlrow" 
```

The static method `getFilter` receives one argument `EFilter`, which is an `Enum` 

The method `applyFilter` returns a String with text already processed.


At the moment, these are all the filters available:

Filter | Description
------ | -----------
`EFilter.FIRST_UPPER` | Turns upper case all first letters in a sentence
`EFilter.NO_SPACE` | Removes all the blank space from a sentence
`EFilter.NO_VOWEL` | Removes all the vowels from a sentence
`EFilter.ROT13` | Replaces a letter with the its 13th succeeding one it in the alphabet
`EFilter.ATBASH` | Replaces 'a' with 'z', 'b' with 'y', 'c' with 'x' and so on 
`EFilter.PIG_LATIM` | Appends an 'ay' at the end of the word if it starts with a vowel
`EFilter.OPISH` | Adds 'op' after every consonant 
`EFilter.REVERSE` | Reverses each word in a sentence
`EFilter.ALL_UNDERSCORE` | Replaces all blank space by a _ (underscore) 
 
#### Docker Image

If you just want to see how this library works, download our image available on Docker Hub following the instructions below:

##### Download the image:

Once you have [Docker CE](https://docs.docker.com/) installed an running, from your Linux terminal or Windows cmd, type:  

```shell
$docker pull jrkrauss/ftextlib:latest
```

##### Create the container and run it:

```shell
$docker run -it jrkrauss/ftextlib:latest
```
 
 