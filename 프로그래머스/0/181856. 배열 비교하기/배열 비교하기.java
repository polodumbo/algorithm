class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            int arr1Total = 0;
            int arr2Total = 0;
            
            for (int n : arr1) {
                arr1Total += n;
            }
            
            for (int n : arr2) {
                arr2Total += n;
            }
            
            if (arr1Total == arr2Total) {
                return answer;
            }
            
            answer = arr1Total > arr2Total ? 1 : -1;
        }
        
        return answer;
    }
}