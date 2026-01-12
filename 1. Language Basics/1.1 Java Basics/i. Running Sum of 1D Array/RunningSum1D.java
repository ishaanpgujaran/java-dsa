import java.util.Scanner;

class RunningSum1D {
    
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        int result[] = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j >= 0; j--) {
                result[j] += nums[j];
            }
        }
        
        return result;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int nums[] = new int [size];

        for (int i= 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        RunningSum1D obj = new RunningSum1D();

        int result[] = obj.runningSum(nums);

        for (int i = 0; i < size; i++) {
            System.out.print(result[i]+" ");
        }

        sc.close();
      
    }
    
}
