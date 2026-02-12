import java.util.Scanner;

class ValueAfterStringOperation {

    // Using contains Method
    public int finalValueAfterOperations1(String[] operations) {
        int X = 0;

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")) {
                X++;
            } else {
                X--;
            }
        }

        return X;
    }

    
    // Using equals Method
    public int finalValueAfterOperations2(String[] operations) {
        int X = 0;

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("X++") || operations[i].equals("X++")) {
                X++;
            } else {
                X--;
            }
        }

        return X;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String operations[] = new String[size];

        for(int i = 0; i < size; i++) {
            operations[i] = sc.next();
        }


        ValueAfterStringOperation obj = new ValueAfterStringOperation();

        int X1 = obj.finalValueAfterOperations1(operations);

        System.out.println("");
        
        System.out.println("**Using contains Method**");
        System.out.println("Final Value of X = " + X1);
        System.out.println("______________________________");
    
        System.out.println("");

        int X2 = obj.finalValueAfterOperations2(operations);

        System.out.println("**Using equals Method**");
        System.out.println("Final Value of X = " + X2);
        System.out.println("______________________________");

        sc.close();
    }
}