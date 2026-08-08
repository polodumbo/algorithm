class Solution {
    public String solution(String s, String skip, int index) {
        char[] arr = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            for (int j = 0; j < index; j++) {
                do {
                    c++;

                    if (c > 'z') {
                        c = 'a';
                    }
                } while (skip.indexOf(c) != -1);
            }
            
            arr[i] = c;
        }
        
        return String.valueOf(arr);
    }
}