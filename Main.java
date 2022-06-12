import java.util.*;
import java.io.*;

public class Main{
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

        int[] nextIntArr(int skipNum){
            int [] intArr;

            String input = nextLine();

            String[] inputStr = input.split(" ");

            intArr = new int[inputStr.length-skipNum];

            for(int i = skipNum, j=0; j<intArr.length;i++,j++){
                intArr[j] = Integer.parseInt(inputStr[i]);
            }

            return intArr;
        }

        void close() throws IOException{
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
            bo.write(a);
        }

        public void write(int[] arr) throws IOException {

            for (int a : arr) {
                bo.write(String.valueOf(a));
                bo.append(" ");
            }

        }

        public void close() throws IOException{
            bo.close();
        }
    }

    // end of fast i/o code
    public static void main(String[] args) 
    throws IOException {
        FastReader reader = new FastReader();
        FastOutput writer = new FastOutput();
        int [] arr = reader.nextIntArr(1);
        
        int rotateBy = reader.nextInt();

        arr = rotateBy%arr.length==0?arr:rotate(arr, rotateBy%arr.length);

        writer.write(arr);

        reader.close();
        writer.close();

    }

    private static int[] rotate(int[] arr, int rotateBy) {

        arr = reverse(arr, 0, (arr.length-rotateBy-1));
        arr = reverse(arr, arr.length-rotateBy, arr.length-1);
        arr = reverse(arr, 0, arr.length-1);
        return arr;
    }

    private static int[] reverse(int[] arr, int startIndex, int endIndex){

        for(int i = 0; i<=(endIndex - startIndex)/2; i++){
            int temp = arr[startIndex + i];
            arr[startIndex+ i] = arr[endIndex-i];
            arr[endIndex-i] = temp;
        }

        return arr;
    }

}

/**
 * 
 * Problem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109
 * 
 */