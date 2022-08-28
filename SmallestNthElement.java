import java.util.ArrayList;

public class SmallestNthElement {
 
    public static void main(String[] args) {

        int [] arr = new int[]{1, 2, 0, 4, 5, 7};

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int a: arr){
            arrList.add(a);
        }

        int smallNum = 1;
        int min = Integer.MAX_VALUE;
        for(int j = 0;j<smallNum; j++){
            min = arrList.get(0);
            int minIndex = 0;
            for(int i = 0; i<arrList.size(); i++){
                
                if(arrList.get(i)<min){
                    min = arrList.get(i);
                    minIndex = i;
                }

            }
            arrList.remove(minIndex);
        }

        System.out.println(min);
            
    }
        
}

