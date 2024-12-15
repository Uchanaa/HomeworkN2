package ge.automation;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Test1 object1 = new Test1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ ტექსტი:");
        String text = scanner.nextLine();
        int vowelCount = object1.countVowel(text);
        System.out.println("ხმოვნის რაოდენობაა: " + vowelCount);
    }
}






