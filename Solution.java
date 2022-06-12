import java.util.*;
import java.io.*;

public class Solution {
    // For fast input output
    static class FastReader {
        private BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(
                        new FileReader("./input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
                str = str.trim();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArr(int skipNum) {
            int[] intArr;
            String input = nextLine();
            String[] inputStr = input.split(" ");
            intArr = new int[inputStr.length - skipNum];
            for (int i = skipNum, j = 0; j < intArr.length; i++, j++) {
                intArr[j] = Integer.parseInt(inputStr[i]);
            }
            return intArr;
        }

        ArrayList<Integer> nextIntArrayList(int skipNum) {
            ArrayList<Integer> intArr;
            String input = nextLine();
            String[] inputStr = input.split(" ");
            intArr = new ArrayList<>();
            for (int i = skipNum, j = 0; j < inputStr.length; i++, j++) {
                intArr.add(Integer.parseInt(inputStr[i]));
            }
            return intArr;
        }

        void close() throws IOException {
            br.close();
        }
    }

    static class FastOutput {
        private BufferedWriter bo;

        public FastOutput() {
            try {
                bo = new BufferedWriter(new FileWriter("./output.txt"));
            } catch (Exception e) {
                bo = new BufferedWriter(new OutputStreamWriter(System.out));
            }
        }

        public void write(String str) throws IOException {
            bo.write(str);
        }

        public void write(int a) throws IOException {
            bo.write(String.valueOf(a));
        }

        public void write(int[] arr) throws IOException {
            StringBuilder builder = new StringBuilder();
            for (int a : arr) {
                builder.append(String.valueOf(a));
                builder.append(" ");
            }
            bo.write(builder.toString().trim());
        }

        public void write(List<Integer> arr) throws IOException {
            StringBuilder builder = new StringBuilder();
            for (int a : arr) {
                builder.append(String.valueOf(a));
                builder.append(" ");
            }
            bo.write(builder.toString().trim());
        }

        public void close() throws IOException {
            bo.close();
        }
    }

    // end of fast i/o code
    public static void main(String[] args)
            throws IOException {
        FastReader reader = new FastReader();
        FastOutput writer = new FastOutput();
        List<Integer> input = reader.nextIntArrayList(0);
        writer.write(new Solution().solve(input));

        reader.close();
        writer.close();
    }

    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> tempList = new ArrayList<>();

        for(int i = A.size()-1; i>-1; i--){
            tempList.add(A.get(i));    
        }
        return tempList; 
    }

}

/**
 * 
 * 
 * Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints
1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format
First argument is a constant array A.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1] 
Output 2:

 [10,1,1] 


Example Explanation
Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]


 */