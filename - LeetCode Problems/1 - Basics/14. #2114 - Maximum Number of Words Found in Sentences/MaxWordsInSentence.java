class MaxWordsInSentence {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            int count = 1; // at least one word in a sentence

            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    count++;
                }
            }

            if (count > maxWords) {
                maxWords = count;
            }
        }

        return maxWords;
    }
}
