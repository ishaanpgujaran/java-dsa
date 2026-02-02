class MaxPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101]; // 1950 to 2050

        // Step 1: mark population changes
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0] - 1950;
            int death = logs[i][1] - 1950;

            population[birth]++;
            population[death]--;
        }

        // Step 2: find year with max population
        int maxPop = 0;
        int year = 0;
        int current = 0;

        for (int i = 0; i < 101; i++) {
            current += population[i];
            if (current > maxPop) {
                maxPop = current;
                year = i;
            }
        }

        return year + 1950;
    }
}

