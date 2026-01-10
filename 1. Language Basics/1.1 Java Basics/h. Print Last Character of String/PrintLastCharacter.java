import java.util.Scanner;

class PrintLastCharacter {

    public char lastChar(String s) {
        int size = s.length();
        char ch = s.charAt(size - 1);
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        PrintLastCharacter obj = new PrintLastCharacter();

        char ch = obj.lastChar(s);

        System.out.println("Last Character in String is : "+ch);

        sc.close();
    }
}
