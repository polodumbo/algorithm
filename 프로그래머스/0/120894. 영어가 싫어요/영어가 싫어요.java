class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int idx = 0;
        
        while (idx < numbers.length()) {
            int num = 0;
            int length = 0;
            
            if (numbers.substring(idx).startsWith("zero")) {
                num = 0;
                length = 4;
            } else if (numbers.substring(idx).startsWith("one")) {
                num = 1;
                length = 3;
            } else if (numbers.substring(idx).startsWith("two")) {
                num = 2;
                length = 3;
            } else if (numbers.substring(idx).startsWith("three")) {
                num = 3;
                length = 5;
            } else if (numbers.substring(idx).startsWith("four")) {
                num = 4;
                length = 4;
            } else if (numbers.substring(idx).startsWith("five")) {
                num = 5;
                length = 4;
            } else if (numbers.substring(idx).startsWith("six")) {
                num = 6;
                length = 3;
            } else if (numbers.substring(idx).startsWith("seven")) {
                num = 7;
                length = 5;
            } else if (numbers.substring(idx).startsWith("eight")) {
                num = 8;
                length = 5;
            } else if (numbers.substring(idx).startsWith("nine")) {
                num = 9;
                length = 4;
            }
            
            answer = answer * 10 + num;
            idx += length;
        }
        
        return answer;
    }
}