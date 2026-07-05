class Solution {
    public String solution(String polynomial) {
        String[] polynomials = polynomial.split(" ");
        int coefficient = 0;
        int num = 0;
        
        for (int i = 0; i < polynomials.length; i++) {
            if (polynomials[i].equals("+")) {
                continue;
            } else if (polynomials[i].charAt(0) == 'x') {
                coefficient++;
            } else if (polynomials[i].contains("x") && polynomials[i].length() > 1) {
                coefficient += Integer.parseInt(polynomials[i].replace("x", ""));
            } else {
                num += Integer.parseInt(polynomials[i]);
            }
        }
        
        if (coefficient > 0 && num > 0) {
            return (coefficient == 1 ? "x" : coefficient + "x") + " + " + num;
        } else if (coefficient > 0 && num == 0) {
            return coefficient == 1 ? "x" : coefficient + "x";
        } else {
            return String.valueOf(num);
        }
    }
}