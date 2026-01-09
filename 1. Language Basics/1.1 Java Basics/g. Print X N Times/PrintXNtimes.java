import java.util.Scanner;

class PrintXNtimes {

    public void printX(int X, int N){

        for(int i = 0 ; i < N ; i++){
            
            if(i < N-1){
                System.out.print(X);
                System.out.print(" ");
            } else {
                System.out.println(X);
            }

        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        PrintXNtimes obj = new PrintXNtimes();

        obj.printX(X, N);

        sc.close();
    }

}