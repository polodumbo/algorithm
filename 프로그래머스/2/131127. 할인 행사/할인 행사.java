import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> discountMap = new HashMap<>();
        
        int answer = 0;
        int num = 0; // 총 원하는 제품 수
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
            num += number[i];
        }
        
        // 첫 번째
        for (int i = 0; i < num; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }
        
        // 결과 확인
        if (isSignUppable(wantMap, discountMap)) {
            answer++;
        }
        
        // i번째를 빼고 i+num번째를 더함
        for (int i = 0; i <= discount.length - num - 1; i++) {
            // 맨 앞 제품 제거
            String outProduct = discount[i];
            discountMap.put(outProduct, discountMap.get(outProduct) - 1);
            
            // 맨 뒤 제품 추가
            String inProduct = discount[i + num];
            discountMap.put(inProduct, discountMap.getOrDefault(inProduct, 0) + 1);
            
            // 결과 확인
            if (isSignUppable(wantMap, discountMap)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isSignUppable(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) {
            if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        
        return true;
    }
}