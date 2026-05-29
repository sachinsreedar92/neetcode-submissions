class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0) return new int[0];

        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        int n = nums.length;
        List<Integer>[] buckets = new List[n+1];

        for(int i=0; i<=n; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            buckets[e.getValue()].add(e.getKey());
        }

        int idx=0;
        int[] res = new int[k];

        for(int f=n; f>=1 && idx < k; f--){
            for(int num : buckets[f]){
                res[idx++] = num;
                if(idx == k) 
                break;
            }
        }
        return res;
    }
}
