# Goal Sheet 05

**Arrays**

Note: BJP = Building Java Programs (by Reges and Stepp)

**Problem GS05-01 - Output Squares**

Use a two-dimensional array to write a game of Tic-Tac-Toe that represents the board.  (BJP Ch 7 Proj 5)

**Problem GS05-02 - Hangman**

Write a game of Hangman using arrays.  Allow the user to guess letters and represent which letters have been guessed in an array.  (BJP Ch 7 Proj 2)

**Problem GS05-03 - Mastermind (worth triple points)**

Write a program that plays a variation of the game Mastermind with a user.  The program should generate a four digit number.  User allowed to guess until she gets the number correct.  Clues are given to the user indicating how many digits are correct and in the correct place.  (BJP Ch 7 Proj 3)

You should output two things after the user guesses.  The number of digits that are correct AND in the correct location.  The number of digits that are correct BUT not in the correct location.  These are mutually exclusive.  A digit cannot be both in the correct location and not in the correct location.

Below is a test case to test your code.  Make sure that your "Secret" is the given number (6684) and then use the guesses to check your outputs to see that they match up with the test.

By the way, traditional Mastermind had only 4 pins which could have 6 different colors (we are using 4 pins with 10 colors/digits).  One player put in the secret and the other player guessed based on feedback.  Feedback was given in terms of black and white pegs.  A black peg signified that the guesser had gotten a pin of the correct color in the correct position.  A white peg signified that the guesser had gotten a pin of the correct color in the wrong location.

Secret number: 6684

The guesses below are silly guesses, but they are good for initial tests.  If you cannot handle these two cases, you will have a difficult time handling the rest.  The concept is that you need to make sure that a found digit is not checked again.

Secret | Guess | Correct Digit and Location (Black Peg) | Correct Digit, Wrong Location (White Peg)
------ | ----- | -------------------------------------- | -----------------------------------------
6684 | 0000 | 0 | 0
6684 | 6666 | 2 | 0

The guesses below are in a possible sequence that somebody might play a game.  It uses the information from the previous guesses to come up with the next guess.

Secret | Guess | Correct Digit and Location (Black Peg) | Correct Digit, Wrong Location (White Peg)
------ | ----- | -------------------------------------- | -----------------------------------------
6684 | 0123 | 0 | 0
6684 | 4567 | 0 | 2
6684 | 4589 | 1 | 1
6684 | 6700 | 1 | 0
6684 | 0798 | 0 | 1
6684 | 6484 | 3 | 0
6684 | 6480 | 2 | 1
6684 | 6884 | 3 | 0
6684 | 6684 | 4 | 0

The guesses below are additional guesses that will help you create your algorithm correctly.  There may be other guesses that pass the tests above but still need to be checked to help validate your algorithm.  These will be added as they are found.

Secret | Guess | Correct Digit and Location (Black Peg) | Correct Digit, Wrong Location (White Peg)
------ | ----- | -------------------------------------- | -----------------------------------------
6684 | 8468 | 0 | 3
6684 | 8866 | 0 | 3
6684 | 8466 | 0 | 4

Well, it did not take long to find more test cases that pass might pass the original tests above.  So here are a couple secrets, guesses, and answers you should check your code against.

Secret | Guess | Correct Digit and Location (Black Peg) | Correct Digit, Wrong Location (White Peg)
------ | ----- | -------------------------------------- | -----------------------------------------
1111 | 1121 | 3 | 0
1112 | 1222 | 2 | 0

In reality, you should test mastermind against all the possible secrets and guesses.  Which is where the following paragraphs and associated files comes in handy.

The best way to test your algorithm is to use Mike Magruder's testing program.  [MastermindTester](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/MastermindTester.java)  To take best advantage of the tester, write your code so that you use byte arrays for your secret and guess, and return a two-dimensional int array which has the number of black pegs (correct color and location) in the first element and white pegs (correct color but wrong location) in the second element.  You can see this in the following code segment from the tester program:

```
public int[] scoreCodewords(String codeword1, String codeword2) {
      // This algorithm likes the codewords to be in byte arrays.
      byte[] secretDigits = codeStringToBytes(codeword1);
      byte[] guessDigits = codeStringToBytes(codeword2);
```

You will also need to use the file [mastermind_4p6c.txt](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/mastermind_4p6c.txt), which shows all the correct feedback for all the secrets and guesses for a 4-pin, 6-color Mastermind board (plus the test cases for 6684).  Include this in your project one folder (directory) level above the src folder.

If you really want to test your skills, write code to play Mastermind.  Writing code to play Mastermind will surely put your mind to the test.  But make sure to test your own implementation of the scoring function with Mike Magruder's tester first.  (By the way, if you can pass 4 pins with 6 colors, you can pass more pins and more colors).  Once you write one algorithm to play the game, you can certainly write more.  You can even test other people's algorithms to play the game.  Are you up for the challenge?

Code and table are courtesy of [Michael M. Magruder](https://github.com/MikeMag).  The file [mastermind_4x6.txt](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/mastermind_4x6.txt) is a comma separated value (CSV) text file with all the secrets, guesses, and feedback for a 4-pin, 6-color game.  A few lines of the file are shown in the table below.  Thanks Mike.

Secret | Guess | Correct Digit and Location (Black Peg) | Correct Digit, Wrong Location (White Peg)
------ | ----- | -------------------------------------- | -----------------------------------------
1111 | 1111 | 4 | 0
1111 | 1112 | 3 | 0
1111 | 1113 | 3 | 0
1111 | 1114 | 3 | 0
1111 | 1115 | 3 | 0
1111 | 1116 | 3 | 0
1111 | 1121 | 3 | 0
1111 | 1122 | 2 | 0
1111 | 1123 | 2 | 0
1111 | 1124 | 2 | 0
1111 | 1125 | 2 | 0
1111 | 1126 | 2 | 0
1111 | 1131 | 3 | 0
1111 | 1132 | 2 | 0
1111 | 1133 | 2 | 0
1111 | 1134 | 2 | 0
1111 | 1135 | 2 | 0
1111 | 1136 | 2 | 0

**Problem GS05-04 - AP Practice**

Sign up on the AP site if you have not done so yet.  Start/continue multiple choice packet of practice problems.
