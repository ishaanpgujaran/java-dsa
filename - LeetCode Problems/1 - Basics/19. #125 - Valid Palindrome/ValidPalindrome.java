class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = s.charAt(left);
            char r = s.charAt(right);

            // skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // convert uppercase to lowercase manually
            if (l >= 'A' && l <= 'Z') {
                l = (char)(l + 32);
            }
            if (r >= 'A' && r <= 'Z') {
                r = (char)(r + 32);
            }

            if (l != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

