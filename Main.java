import java.util.*;
import java.io.*;

public class Main {
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

        public void close() throws IOException {
            bo.close();
        }
    }

    // end of fast i/o code
    public static void main(String[] args)
            throws IOException {
        FastReader reader = new FastReader();
        FastOutput writer = new FastOutput();
        writer.write(findMaxAndMin(reader.nextIntArr(1)));
        reader.close();
        writer.close();
    }

    private static int[] findMaxAndMin(int[] nextIntArr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nextIntArr.length; i++) {
            int temp = nextIntArr[i];
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }

        return new int[] { max , min};
    }
}

/**
 * 
 * Problem Description

Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and other N elements as input from the user.



Problem Constraints

1 <= N <= 1000

1 <= A <= 1000



Input Format

A single line representing N followed by N integers of the array A



Output Format

A single line containing two space separated integers representing maximum and minimum elements of the input array.


Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output

Output 1:

5 1
Output 2:

80 10
 */