
# Hangman game in Java

Simple console java game based on hangman game rules. Writed in IntelliJ IDEA.

## Used imports

- java.util.Arrays

- java.util.Scanner

- java.util.Random

- java.io.File

- java.io.FileNotFoundException

## How it works
- User type a letter in 'Take a guess' place
- If letter wasn't in the answer 'Bad guesses' counter goes up by 1
- Program shows hidden password [_, _, _, _]
- If letter was in the asnwer 'Bad guesses' counter doesn't change
- Program uncover a guessed letter [s, _, _, _]
- Program also shows used letters so user know which letters he used
- If user guessed the password there is winning case announcement
- If user doesn't guess the password in 6 tries there is losing case announcement and Program print what was the password word



## Screenshots

### First guess
![First guess](https://github.com/janFranczakk/hangmanGame_Java/blob/main/Screenshots/Screenshot%202023-06-06%20at%2020.21.49.png?raw=true)

### Next guess
![Next guess](https://github.com/janFranczakk/hangmanGame_Java/blob/main/Screenshots/Screenshot%202023-06-06%20at%2020.22.04.png?raw=true)

### Good ending
![Good ending](https://github.com/janFranczakk/hangmanGame_Java/blob/main/Screenshots/Screenshot%202023-06-06%20at%2020.22.53.png?raw=true)

### Bad ending
![Bad ending](https://github.com/janFranczakk/hangmanGame_Java/blob/main/Screenshots/Screenshot%202023-06-06%20at%2020.24.01.png?raw=true)
