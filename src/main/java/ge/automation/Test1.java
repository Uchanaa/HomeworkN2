package ge.automation;

public class Test1 extends Test {
    @Override
    public int countVowel(String text) { // მეთოდის სწორად ოვერრაიდირება
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        return count; // ხმოვნების რაოდენობის დაბრუნება
    }
}