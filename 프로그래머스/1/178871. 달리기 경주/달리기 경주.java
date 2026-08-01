import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int callingIdx = playerMap.get(calling);
            String front = players[callingIdx - 1];
            int frontIdx = callingIdx - 1;
            
            playerMap.put(calling, frontIdx);
            players[callingIdx] = players[frontIdx];
            
            playerMap.put(front, callingIdx);
            players[frontIdx] = calling;
        }
        
        return players;
    }    
}