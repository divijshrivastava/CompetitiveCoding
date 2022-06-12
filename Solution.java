import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, 4, 4); 
        int B = 4;
        
        System.out.println(new Solution().solve(A, B));
    }

    public int solve(List<Integer> a, int b) {
        
        for(int i = 0; i<a.size(); i++){
            for( int j = i+1; j<a.size(); j++){
                if(a.get(i)+a.get(j)==b){
                    return 1;
                }
            }
        }
        
        return 0;
    }
    
}
