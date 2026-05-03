class Solution {
    public int solution(String binomial) {
        String[] binomials = binomial.split(" ");
        int a = Integer.parseInt(binomials[0]);
        char op = binomials[1].charAt(0);
        int b = Integer.parseInt(binomials[2]);
        
        int answer = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
        
        return answer;
    }
}