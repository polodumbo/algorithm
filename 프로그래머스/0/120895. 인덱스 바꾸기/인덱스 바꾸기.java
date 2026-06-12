class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charList = my_string.toCharArray();
        
        charList[num1] = my_string.charAt(num2);
        charList[num2] = my_string.charAt(num1);
        
        return String.valueOf(charList);
    }
}