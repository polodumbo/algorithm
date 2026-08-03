class Solution {
    
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int h = 0;
        int w = 0;
        
        // 시작 위치
        for (int i = 0; i < park.length; i++) {
            int startIdx = park[i].indexOf("S");
            
            if (startIdx != -1) {
                h = i;
                w = startIdx;
                break;
            }
        }
        
        // 명령
        for (String route : routes) {
            char dir = route.charAt(0);
            int dist = Integer.parseInt(route.substring(2));
            int dirH = 0;
            int dirW = 0;
            
            switch (dir) {
                case 'E' -> dirW = 1;
                case 'W' -> dirW = -1;
                case 'S' -> dirH = 1;
                case 'N' -> dirH = -1;
            }
            
            int tempH = h;
            int tempW = w;
            boolean possible = true;
            
            // 한 칸씩 검사
            for (int i = 0; i < dist; i++) {
                tempH += dirH;
                tempW += dirW;
                
                // 공원을 벗어나거나 장애물이 있다면
                if (tempH < 0 || tempH >= H ||
                    tempW < 0 || tempW >= W ||
                    park[tempH].charAt(tempW) == 'X') {
                    
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                h = tempH;
                w = tempW;
            }
        }
        
        return new int[]{h, w};
    }
}