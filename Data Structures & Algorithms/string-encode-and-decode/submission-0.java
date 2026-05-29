class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodingStr = new StringBuilder();
        for(String s: strs){
            encodingStr.append(s.length()).append("#").append(s);
        }
        return encodingStr.toString();

    }

    public List<String> decode(String str) {

        List<String> dStr = new ArrayList<String>();
        int i=0;

        while(i < str.length()){
            int j=i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            j++;
            String word = str.substring(j,j+length);
            dStr.add(word);
            i = j + length;
        }

        return dStr;

    }
}
