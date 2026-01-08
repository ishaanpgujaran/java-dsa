import java.util.Scanner;

class SumFLarray {

    public int sumOfFirstAndLast(int[] nums) {
        int sum = nums[0] + nums[nums.length - 1];
        return sum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Size of Array : ");

        int size = sc.nextInt();

        int nums[] = new int[size];

        // System.out.println("Enter the Elements of Array : ");
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        SumFLarray obj = new SumFLarray();

        int result = obj.sumOfFirstAndLast(nums);

        System.out.println("Sum of First & Last Element of array = "+ result);

        sc.close();
    }
}