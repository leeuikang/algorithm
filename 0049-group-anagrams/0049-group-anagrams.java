class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        List<List<String>> answerList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            
            tempList = resultMap.getOrDefault(key,new ArrayList<String>());
            tempList.add(str);
            
            resultMap.put(key, tempList);
        }

        for(String key : resultMap.keySet()){
            answerList.add(resultMap.get(key));
        }

        return answerList;
    }
}