import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second word: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()){
            System.out.println("The first word is longer.");
        } else if (str1.length() == str2.length()){
            System.out.println("Both words are the same length.");
        } else {
            System.out.println("The second word is longer.");
        }

        if (str1.length() % 2 == 0) {
            System.out.print("The first word split in half is: ");
            System.out.println(str1.substring(0, str1.length() / 2) + " " + str1.substring(str1.length() / 2));
        } else {
            System.out.print("The first word split in half is: ");
            System.out.println(str1.substring(0, str1.length() / 2) + " " + str1.substring(str1.length() / 2));
        }

        if (str2.length() % 2 == 0) {
            System.out.print("The second word split in half is: ");
            System.out.println(str2.substring(0, str2.length() / 2) + " " + str2.substring(str2.length() / 2));
        } else {
            System.out.print("The second word split in half is: ");
            System.out.println(str2.substring(0, str2.length() / 2) + " " + str2.substring(str2.length() / 2));
        }

        if (str1.indexOf(str2) != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is NOT found in " + str1);
        }
    }
}