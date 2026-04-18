class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

         List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());

     list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        // Step 4: Pick first k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
