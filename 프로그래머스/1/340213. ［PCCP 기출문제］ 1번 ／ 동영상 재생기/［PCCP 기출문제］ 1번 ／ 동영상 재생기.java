class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = convertToSeconds(video_len);
        int now = convertToSeconds(pos);
        int opStart = convertToSeconds(op_start);
        int opEnd = convertToSeconds(op_end);
        
        for (String command : commands) {
            // 오프닝 건너뛰기
            now = skipOpening(now, opStart, opEnd);
            
            // 10초 전으로 이동
            if (command.equals("prev")) {
                now = Math.max(0, now - 10);
            }
            // 10초 후로 이동
            else if (command.equals("next")) {
                now = Math.min(videoLen, now + 10);
            }
            
            // 오프닝 건너뛰기
            now = skipOpening(now, opStart, opEnd);
        }
        
        return String.format("%02d:%02d", now / 60, now % 60);
    }
    
    private int convertToSeconds(String pos) {
        int mm = Integer.parseInt(pos.substring(0, 2));
        int ss = Integer.parseInt(pos.substring(3, 5));
        
        return mm * 60 + ss;
    }
    
    private int skipOpening(int now, int opStart, int opEnd) {
        if (now >= opStart && now <= opEnd) {
            return opEnd;
        }
        
        return now;
    }
}