class GoalParserInterpretation {
        public String interpret(String command) {
        String result = "";
        int i = 0;

        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                result += 'G';
                i++;
            } 
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result += 'o';
                i += 2;
            } 
            else { // "(al)"
                result += "al";
                i += 4;
            }
        }

        return result;
    }
}
