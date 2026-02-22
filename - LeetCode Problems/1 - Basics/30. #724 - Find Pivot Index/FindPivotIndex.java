class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Step 1: calculate total sum
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;

        // Step 2: find pivot
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

