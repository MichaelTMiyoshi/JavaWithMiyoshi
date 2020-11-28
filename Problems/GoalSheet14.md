# Goal Sheet 14

**Maps, Strings, Recursion, etc.**

Note: BJP = Building Java Programs (by Reges and Stepp)

**Problem GS14-01 - Levenshtein Distance (double)**

BJP Ch 11 project 1.  Find edit (Levenshtein) distance between words.  Read words from a [sorted dictionary file](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/dictionarySorted.txt).  Compute a map from every word to its immediate neighbors, that is, the words that have an edit distance of 1 from it.  You can walk the map to find paths from one word to another, and can use a linked list of words to visit neighbors.  (Full description in BJP)  You might also find a [dictionary sorted by length](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/dictionarySortedLength.txt) to be of help.  (By the way, that is a little hint.)  One last thing to note, the dictionaries have 370,099 words in them (the same words).  I forget where I found the original dictionary otherwise I would give a link to it.  It was mostly, but not completely, sorted alphabetically.  I sorted them alphabetically and by length for best use in solving the problem.  Use one or both to help you solve the problem.

**Problem GS14-02 - isReverse (recursive)**

BJP Ch 12 Ex 11.  Write a recursive method called isReverse that accepts two strings as parameters and returns true if the two strings contain the same sequence of characters as each other but in opposite order (ignoring capitalization), and false otherwise.  For example, the call of isReverse(“hello”, “oLLeH”); would return true.  The empty string, as well as any one-letter string, is considered to be its own reverse.  (Full description in BJP)

**Problem GS14-03 - Anagrams (double)**

BJP Ch 13 project 4.  Write a program that discovers all anagrams of all words listed in an input file that stores the entries in a large dictionary.  Write and use a comparator.  Anagrams of words.  (Full description in BJP)

**Problem GS14-04 - AP Practice**

Start/continue multiple choice packet of practice problems.
