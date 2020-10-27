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

Below is a test case to test your code.  Make sure that your "Secret" is the give number and then use the guesses to check your outputs to see that they match up with the test.

Secret number: 6684

The guesses below are silly guesses, but they are probably the ones that you should make sure you test first.  If you cannot handle these two cases, you will have a difficult time handling the rest.  The concept is that you need to make sure that a found digit is not checked again.

Guess | Correct Digit, Correct Location | Correct Digit, Wrong Location
----- | ------------------------------- | -----------------------------
0000 | 0 | 0
6666 | 2 | 0

The guesses below are in a possible sequence that I would play a game.  It uses the information from the previous guesses to come up with the next guess.

Guess | Correct Digit, Correct Location | Correct Digit, Wrong Location
----- | ------------------------------- | -----------------------------
0123 | 0 | 0
4567 | 0 | 2
4589 | 1 | 1
6700 | 1 | 0
0798 | 0 | 1
6484 | 3 | 0
6480 | 2 | 1
6884 | 3 | 0
6684 | 4 | 0

The guesses below are additional guesses that will help you create your algorithm correctly.  There may be other guesses that pass the tests above but still need to be checked to help validate your algorithm.  These will be added as they are found.

Guess | Correct Digit, Correct Location | Correct Digit, Wrong Location
----- | ------------------------------- | -----------------------------
8468 | 0 | 3
8866 | 0 | 3
8466 | 0 | 4

The file [mastermind_4x6.txt](https://github.com/MichaelTMiyoshi/JavaWithMiyoshi/blob/master/Problems/mastermind_4x6.txt) shows all the correct feedback for all the secrets and guesses for a 4 pin, 6 color Mastermind board.  It is useful for those who want to dig deeper into Mastermind or who might even want to write code to play Mastermind.  Writing code to play Mastermind will surely put your mind to the test.  And it will also be able to test your own implementation of the game.  Plus you can test different algorithms to play the game.  Are you up for the challenge?

Table courtesy of @MikeMag.  It is a comma separated value (CSV) text file.  A few lines of the file are shown in the table below.  Thanks Mike.

Secret | Guess | Correct Digit and Location | Correct Digit Wrong Location
------ | ----- | -------------------------- | ----------------------------
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
