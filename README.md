# HangmanBot
Java program that guesses the word you are thinking of
UNFINISHED

To run this program properly you must first change the file location on line 15 of
GameInteract.java to the location of all words.txt on your pc. Then you can run
GameInteract.java to play.

RULES:
1. The point of this program is to make as few incorrect guesses as possible, NOT to guess the 
word in the least guesses possible.
2. To play think of a word first and enter the length of the word. (ex. if your word is table, enter 5)
3. Then the program will guess a letter based on the words it knows. If your word does not contain the letter
enter 0. If it does contain the letter, then enter the position of the letter in the word. (ex. if your
word is table and the program guesses the letter "a", enter 2 since "a" is in the second position)
4. If your word contains the lettter multiple times, then you enter the positions of the letters one by one.
(ex. if your word is green, and the program guesses "e", first you type in 2, then enter, then type in 3, then enter,
then type in 0 meaning there are no more letter e's in the word)

DISCLAIMERS
-Build is not final and is prone to bugs.
-The words it can guess rely entirely on the "all words.txt" file. If you wish to add more words to the program's
knowledge you can add to this file. 
-The longer the word, the more accurate the program will be. 
-In most cases this program is better at guessing than humans.
