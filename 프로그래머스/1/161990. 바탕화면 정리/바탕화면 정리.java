class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (wallpaper[i].charAt(j) == '#') {
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