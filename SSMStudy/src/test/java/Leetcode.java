import java.util.*;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-14:28
 */
public class Leetcode {
    int[] dx=new int[]{1,-1,0,0};
    int[] dy=new int[]{0,0,-1,1};
    public int movingCount(int m, int n, int k) {
        if(k==0){
            return 1;
        }
        boolean[][] visited=new boolean[m][n];
        return dfs(0,0,m,n,k,visited);
    }
    public int dfs(int x,int y,int m,int n,int k,boolean[][] visited){
        if(x<0||x>m-1||y<0||y>n-1||visited[x][y]){
            return 0;
        }

        if(x/10+x%10+y/10+y%10>k){
            return 0;
        }
        int ans=0;
        visited[x][y]=true;
        for(int i=0;i<4;i++){
            int next_x=x+dx[i];
            int next_y=y+dy[i];
            ans+=dfs(next_x,next_y,m,n,k,visited);
        }
        return ans+1;
    }
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        List<String> ans=new ArrayList<>();
        if(n<10){
            return  ans;
        }
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<n-10;i++){
            map.put(s.substring(i,i+10),map.getOrDefault(s.substring(i,i+10),0)+1);
        }
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    // "static void main" must be defined in a public class.
        public static void main(String[] args) {
            // 1. Initialize a queue.
            Queue<Integer> q = new LinkedList();
            // 2. Get the first element - return null if queue is empty.
            System.out.println("The first element is: " + q.peek());
            // 3. Push new element.
            q.offer(5);
            q.offer(13);
            q.offer(8);
            q.offer(6);
            // 4. Pop an element.
            q.poll();
            // 5. Get the first element.
            System.out.println("The first element is: " + q.peek());
            q.poll();
            System.out.println("The first element is: " + q.peek());
            // 7. Get the size of the queue.
            System.out.println("The size is: " + q.size());
        }

}
