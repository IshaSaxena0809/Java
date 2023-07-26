package DayWiseCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Day83 {
    public static BigInteger MOD = new BigInteger ("1000000007");
    public static BigInteger pr (int i, int len, BigInteger v[]) {
        if (2 * i > len)
            return v[i];
        return pr(2 * i, len, v).max(pr(2 * i + 1, len, v)).multiply(v[i]);
    }
    public static void main (String [] ar) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n, len;
        BigInteger v[];
        String tmp[];
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            len = (1 << n) - 1;
            v = new BigInteger[len + 5];
            tmp = br.readLine().split(" ");
            for (int i = 1; i <= len; i++)
                v[i] = new BigInteger(tmp[i - 1]);
            System.out.println(pr(1, len, v).mod(MOD));
        }
    }

}
