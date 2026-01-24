import java.util.Scanner;

class TargetArray {
    
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            
            // Shift Elements Loop 
            for(int j = count; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            target[index[i]] = nums[i];
            count++;
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();    
        }

        int index[] = new int[n];

        for(int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        TargetArray obj = new TargetArray();

        int result[] = obj.createTargetArray(nums, index);

        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
