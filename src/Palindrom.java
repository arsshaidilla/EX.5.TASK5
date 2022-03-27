import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main (String[] args) {
        String word, reversedWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word: ");
        word = sc.next().toLowerCase();

        char[] splitWord =  new char[word.length()];

        for(int j = 0; j<word.length(); j++ ){
            splitWord[j] = word.charAt(j);
        }

        for(int j=splitWord.length-1; j <= splitWord.length; j--){
            if(j < 0) break;
            reversedWord += splitWord[j];
        }

        if(reversedWord.equals(word)) System.out.println("The word: " + word + " is a Palindrom!");
        else System.out.println("The word: " + word + " is not Palindrom! ");

    }
}
