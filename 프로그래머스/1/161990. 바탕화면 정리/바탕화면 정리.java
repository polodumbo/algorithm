class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                char c = wallpaper[i].charAt(j);
                
                if (c == '#') {
                    lux = Math.min(i, lux);
                    luy = Math.min(j, luy);
                    rdx = Math.max(i, rdx);
                    rdy = Math.max(j, rdy);
                }
            }
        }
        
        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}