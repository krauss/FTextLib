## FTextLib :capital_abcd: :arrow_right: :symbols:

#### 1. What is it?

FTextLib is a simple JAVA library that implements some of the most common text filters available out there. 

#### 2. How to use?

Download the [jar file](lib/) into your project's folder and import it into your project's path.
Once you've done that, that's how you use in your code:

```java
import org.krauss.ftextlib.def.EFilter;
import org.krauss.ftextlib.factory.FilterFactory;
```

Then using the `FilterFactory` class, you can create a filter and apply it straight away like this:

```java
//FilterFactory.getFilter(EFilter filter)
Filter filter = FilterFactory.getFilter(EFilter.REVERSE);

//filter.applyFilter(String text);
filter.applyFilter("Hell of world!");

//Output:

"lleH fo !dlrow" 
```

The static method `getFilter()` takes one argument `filter`, which is an `EFilter Enum` and returns an object `Filter` that has the method `applyFilter()`.

The method `applyFilter()` takes one argument `text` and returns a `String` which is the text already processed.


##### Filters available:

| Filter | Enum | Description |
| ------ | ---- | ----------- |
| **First Upper** | `EFilter.FIRST_UPPER` | Turns upper case all first letters |
| **No Space** | `EFilter.NO_SPACE` | Removes all the blank space |
| **No Vowel** | `EFilter.NO_VOWEL` | Removes all the vowels |
| **ROT13** | `EFilter.ROT13` | Replaces a letter with its 13th succeeding one it in the alphabet |
| **ATBASH** | `EFilter.ATBASH` | Replaces 'a' with 'z', 'b' with 'y', 'c' with 'x' and so on |
| **Pig Latim** | `EFilter.PIG_LATIM` | Appends an 'ay' at the end of the word if it starts with a vowel |
| **Opish** | `EFilter.OPISH` | Adds 'op' after every consonant |
| **Reverse** | `EFilter.REVERSE` | Reverses each word |
| **All Underscore** | `EFilter.ALL_UNDERSCORE` | Replaces all blank space by a _ (underscore) |
| **Carioca Accent** | `EFilter.CARIOCA_ACCENT` | Replaces portuguese words ending in '[aeiou]s' with '[aeiou]ix' |
 
#### 3. Docker Usage :whale:

If you just want to see how this library works, download our image available on Docker Hub following the instructions below:

##### Download the image :cd:

Once you have [Docker CE](https://docs.docker.com/) installed an running, from your Linux terminal or Windows cmd, type:  

```shell
$ docker pull jrkrauss/ftextlib:latest
```

##### Create the container and run/ship it :ship:

```shell
$ docker run -it jrkrauss/ftextlib:latest
```
 
 