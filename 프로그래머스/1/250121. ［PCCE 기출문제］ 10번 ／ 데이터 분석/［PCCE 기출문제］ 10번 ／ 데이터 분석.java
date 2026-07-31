import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> dataList = new ArrayList<>();
        Map<String, Integer> extMap = new HashMap<>();
        extMap.put("code", 0);
        extMap.put("date", 1);
        extMap.put("maximum", 2);
        extMap.put("remain", 3);
        
        for (int[] dataArr : data) {
            if (dataArr[extMap.get(ext)] < val_ext) {
                dataList.add(dataArr);
            }
        }
        
        dataList.sort((a, b) -> a[extMap.get(sort_by)] - b[extMap.get(sort_by)]);
        
        int[][] answer = new int[dataList.size()][data[0].length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = dataList.get(i);
        }
        
        return answer;
    }
}