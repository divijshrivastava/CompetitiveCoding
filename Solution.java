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
            String input = nextLine().trim();
            String[] inputStr = input.split(" ");
            intArr = new ArrayList<>();
            for (int i = skipNum; i < inputStr.length; i++) {
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

        public void close() throws IOException {
            bo.close();
        }
    }

    // end of fast i/o code
    public static void main(String[] args)
            throws IOException {
        FastReader reader = new FastReader();
        FastOutput writer = new FastOutput();
        ArrayList<Integer> numList = reader.nextIntArrayList(0);

        writer.write(new Solution().solve(numList));

        reader.close();
        writer.close();
    }

    public int solve(ArrayList<Integer> A) {

        int sum = 0;
        int sumLeft= 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
        }

        for(int i = 0; i<A.size(); i++){
            if(sum - sumLeft-A.get(i)==sumLeft){
                return i;
            }
            sumLeft+=A.get(i);
        }


        return -1;
    }
}


/**
 * Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.



Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105


Input Format
First arugment is an array A .


Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.


Example Input
Input 1:
A=[-7, 1, 5, 2, -4, 3, 0]
Input 2:

A=[1,2,3]


Example Output
Output 1:
3
Output 2:

-1
 */