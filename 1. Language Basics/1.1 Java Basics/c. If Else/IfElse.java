import java.util.Scanner;

class IfElse {

    public void isAdult(int age) {
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        IfElse obj = new IfElse();

        obj.isAdult(age);

        sc.close();
    }
}