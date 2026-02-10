class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        String[] transformations = new String[words.length];
        int size = 0;

        for (int i = 0; i < words.length; i++) {
            String code = "";

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                code += morse[ch - 'a'];
            }

            // check if this transformation already exists
            boolean found = false;
            for (int k = 0; k < size; k++) {
                if (transformations[k].equals(code)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                transformations[size] = code;
                size++;
            }
        }

        return size;
    }
}
