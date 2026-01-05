import java.util.Scanner;

class IO {
    
    public void printNumber(Scanner sc) {
        
        int num = sc.nextInt() ;

        System.out.println("User Input : " + num);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        IO obj = new IO();

        obj.printNumber(sc);

        sc.close();
    }
}