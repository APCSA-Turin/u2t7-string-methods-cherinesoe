package U2T7_P2_MoreStringMethods;

import java.util.Scanner;
public class U2T7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int count = 1;
        System.out.print("Enter first word: ");
        String prevWord = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter next word: ");
            String currentWord = scan.nextLine();
            if (prevWord.compareTo(currentWord) == 0) {
                score -= 10;
                System.out.println("-10 points: current word equals previous word; SCORE: " + score);
            } 
            if (prevWord.compareTo(currentWord) > 0){
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            if (prevWord.compareTo(currentWord) < 0){
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            if (prevWord.substring(prevWord.length() - 2).equals(currentWord.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
            String firstletter = prevWord.substring(0, 1);
            if (currentWord.indexOf(firstletter) != -1) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if (prevWord.length() == currentWord.length()) {
                score += 2;
                System.out.println("+2 points: both previous and current words are same length; SCORE: " + score);
            }
            prevWord = currentWord;
            count ++;
        }
        System.out.println("You win! It took you " + count + " words! Try again for a lower word count.");
    }
}