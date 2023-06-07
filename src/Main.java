import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static String[] fileReader() throws FileNotFoundException {
        int i = 0;
        String[] array = new String[50];
        File myFile = new File(new File("src/randomWords.txt").getAbsolutePath());
        Scanner in = new Scanner(myFile);
        while(in.hasNextLine()){
            array[i] = in.nextLine();
            i++;
        }
        String[] words = new String[i];
        System.arraycopy(array, 0, words, 0, i);
        return words;
    } // Function reads words from file and putting them in the array
    public static String[] randomWord(String[] array){
        Random rand = new Random();
        String[] word = new String[1];
        int random = rand.nextInt(array.length);
        word[0] = array[random];
        return word;
    } // Function draws random word from words list
    public static char[] stringToChar(String[] array){
        return array[0].toCharArray();
    } // Function breaks a word into letters
    public static char[] invisibleWord(char[] array){
        char[] passwordArray = new char[array.length];
        for(int i = 0; i < array.length; i++){
            passwordArray[i] = '_';
        }
        return passwordArray;
    } // Function making word invisible

    public static String toString(char[] array){
        return new String(array);
    } // Function changing array to string
    public static void hangmanGame(char[] characterArray, char[] passwordArray){
        int timer = 0;
        int secondTimer = 0;
        Scanner in = new Scanner(System.in);
        StringBuilder usedLetters = new StringBuilder();
        while(true){
            System.out.print("Take a guess: ");
            char guess = in.next().charAt(0);
            String s = String.valueOf(guess);
            usedLetters.append(s).append(" ");
            for(int i = 0; i < characterArray.length; i++){
                if(guess == characterArray[i]){passwordArray[i] = characterArray[i];}
                else{secondTimer++;}
            }
            if(secondTimer == passwordArray.length){
                timer++;
                System.out.println("Bad guesses: "+timer);
            }
            secondTimer = 0;

            System.out.println(Arrays.toString(passwordArray));
            boolean condition = Arrays.equals(passwordArray, characterArray);
            if(condition){
                System.out.println("You won, Congratulations!");
                break;
            }
            else{
                System.out.println("Try again");
                System.out.println("Used letters: "+usedLetters);
            }
            if(timer > 5){
                System.out.println("You lost, try again later.");
                System.out.println("The word was: "+toString(characterArray));
                break;
            }
        }
    } // Function that simulates hangman game
    public static void main(String[] args) throws FileNotFoundException {
        String[] array = randomWord(fileReader());
        char[] stringToChar = stringToChar(array);
        char[] invisibleWord = invisibleWord(stringToChar);
        hangmanGame(stringToChar, invisibleWord);
    }
}