class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> hs = new HashSet<>();
        int x=0; 
        int y=0;
        hs.add("0,0");

        for(char ch : path.toCharArray()){
            if(ch == 'N'){
                y++; 
            }else if(ch == 'S'){
                y--; 
            }else if(ch == 'E'){
                x++; 
            }else if(ch == 'W'){
                x--; 
            }
        
        String pos =  x+ "," +y;
        if(hs.contains(pos)){
            return true;
        }
        hs.add(pos);
    }
        return false;
    }
    }
