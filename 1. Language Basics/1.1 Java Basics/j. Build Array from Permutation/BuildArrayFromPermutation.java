import java.util.Scanner;

class BuildArrayFromPermutation {
    
    public int[] buildArray (int[] nums) {
        int ans[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int nums[] = new int[size];

        for(int i=0; i<size; i++) {
            nums[i] = sc.nextInt();
        }
        
        BuildArrayFromPermutation obj = new BuildArrayFromPermutation();

        int ans[] = obj.buildArray(nums);

        for(int i=0; i<size; i++) {
            System.out.print(ans[i]+" ");
        }

        sc.close();
    }
}
