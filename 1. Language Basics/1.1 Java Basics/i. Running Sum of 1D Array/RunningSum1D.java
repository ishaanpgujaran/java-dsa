import java.util.Scanner;

class RunningSum1D {
    
    // My Approach - Not Optimized
    public int[] runningSum1(int[] nums) {
        int size = nums.length;
        int result[] = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j >= 0; j--) {
                result[i] += nums[j];
            }
        }
        
        return result;
    }

    // Vaaniii Approach - Optimal Solution
    public int[] runningSum2(int[] nums) {
        int sum = 0;
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        
        return result;
    }

    // GPT Approach - More Optimized Solution
    public int[] runningSum3(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        
        return nums;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int nums[] = new int [size];

        for (int i= 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        RunningSum1D obj = new RunningSum1D();

        int result1[] = obj.runningSum1(nums);
        System.out.println("**My Appraoch**");
        for (int i = 0; i < size; i++) {
            System.out.print(result1[i]+" ");
        }
        System.out.println("");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("Not Optimized - Works but Slower for Large Inputs");
        
        System.out.println("______________________________________________________");
        System.out.println("");

        int result2[] = obj.runningSum2(nums);
        System.out.println("**Vaaniii Appraoch**");
        for (int i = 0; i < size; i++) {
            System.out.print(result2[i]+" ");
        }
        System.out.println("");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("The Optimal Solution");
        
        System.out.println("______________________________________________________");
        System.out.println("");
    
        int result3[] = obj.runningSum3(nums);
        System.out.println("**GPT Appraoch**");
        for (int i = 0; i < size; i++) {
            System.out.print(result3[i]+" ");
        }
        System.out.println("");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("Optimizes Memory More - Modifies the Same Array");
        System.out.println("#Note - Starting the Loop with i=1 to avoid ArrayIndexOutOfBoundError");

        sc.close();
      
    }
    
}
