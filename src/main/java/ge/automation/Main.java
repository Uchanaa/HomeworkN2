package ge.automation;

public class Main {
    public static void main(String[] args) {
        SymbolReplacer replaceSymbol = new SymbolReplacer();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("შეიყვანეთ ტექსტი პირველი მეთოდისთვის: ");
        String inputA = scanner.nextLine();
        System.out.println("პირველი მეთოდის შედეგი: " + replaceSymbol.replaceSymbolA(inputA));
        System.out.print("შეიყვანეთ ტექსტი მეორე მეთოდისთვის: ");
        String inputB = scanner.nextLine();
        System.out.println("მეორე მეთოდის შედეგი: " + replaceSymbol.replaceSymbolB(inputB));
    }
}