import java.io.*;

import static java.lang.Math.floor;

class Result6 {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        // x1+y*v1 = x2+y*v2
        //y = (x2-x1)/(v1-v2)

//        String ans = "";

        if (x1 > x2 & v1 > v2)
            return "NO";
        else if (x1 < x2 & v1 < v2)
            return "NO";
        else if (v1 == v2)
            return "NO";
        else if ((x2-x1)%(v1-v2) == 0 | (x2-x1)%(v2-v1) == 0)
            return "YES";
        else return "NO";



    }

}

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result6.kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        bufferedReader.close();
    }
}
