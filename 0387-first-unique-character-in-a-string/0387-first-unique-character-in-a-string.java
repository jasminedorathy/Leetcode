class Solution {
    public int firstUniqChar(String s) {
         
        Queue<Integer> queue = new LinkedList<>();
        int [] freq = new int [128];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            queue.offer(i);
            freq[ch-'a']++;
        }

        while(!queue.isEmpty()){
            char ch=s.charAt(queue.peek());
            if(freq[ch-'a']==1){
                return queue.peek();
            }
            queue.poll();
        }

        return -1;
    }
}