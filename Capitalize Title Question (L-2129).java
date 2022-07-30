class Solution {
    public String capitalizeTitle(String title) {
        String t = "";
        
        String words[] = title.split(" ");
        for(String w : words){
            if(w.length()<=2){
                t += w.toLowerCase() + " ";
            }else{
                t+= w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase()+" ";
            }
        }
        return t.trim();
    }
}