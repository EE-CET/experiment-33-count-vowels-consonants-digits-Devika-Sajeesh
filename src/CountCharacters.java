import java.util.Scanner;

public class CountCharacters {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String S = sc.nextLine();
                sc.close();

                int vowels = 0, consonants = 0, digits = 0, special = 0;

                String lowerS = S.toLowerCase();
                for (int i = 0; i < lowerS.length(); i++) {
                        char ch = lowerS.charAt(i);
                        if (ch >= 'a' && ch <= 'z') {
                                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                        vowels++;
                                } else {
                                        consonants++;
                                }
                        } else if (ch >= '0' && ch <= '9') {
                                digits++;
                        } else {
                                special++;
                        }
                }
    
        // TODO: Read the string line
        // TODO: Initialize counters for vowels, consonants, digits, special
        // TODO: Convert to lowercase for easier checking (optional but recommended)
        // TODO: Iterate through characters and update counters
        // Hint: Character.isDigit(ch), Character.isLetter(ch) might be useful
        // TODO: Print the 4 counts separated by spaces

        System.out.println(vowels + " " + consonants + " " + digits + " " + special);
        }
    }