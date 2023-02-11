package codechef;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Siddhant_Manna
 */
public class CodechefTemplet {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        KMEX solver = new KMEX();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class KMEX {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
        	int i,j,k,last;
	           int n=in.nextInt();
	           long[] ar= in.getLongArray(n);
	           HashMap hm= new HashMap();
	           int count=0;
	           for(i=0;i<n;i++)
	           {
	        	   if(!hm.containsKey(ar[i]))
	        	   {
	        		   hm.put(ar[i],1);
	        		   count++;
	        	   }
	        	   else
	        	   {
	        		   int a=(int) hm.get(ar[i]);
	        		   hm.put(ar[i],a+1);
	        	   }
	           }
	           if(count==0)System.out.println(0);
	           else System.out.println(count);
	           
        }

    }

    static class FastReader {
        static final int BUFSIZE = 1 << 20;
        static byte[] buf;
        static int index;
        static int total;
        static InputStream in;

        public FastReader(InputStream is) {
            try {
                in = is;
                buf = new byte[BUFSIZE];
            } catch (Exception e) {
            }
        }

        private int scan() {
            try {
                if (index >= total) {
                    index = 0;
                    total = in.read(buf);
                    if (total <= 0)
                        return -1;
                }
                return buf[index++];
            } catch (Exception | Error e) {
                System.err.println(e.getMessage());
                return 13 / 0;
            }
        }

        public String next() {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan())
                sb.append((char) c);
            return sb.toString();
        }

        public int nextInt() {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+')
                c = scan();
            for (; c >= '0' && c <= '9'; c = scan())
                val = (val << 3) + (val << 1) + (c & 15);
            return neg ? -val : val;
        }

        public long nextLong() {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+')
                c = scan();
            for (; c >= '0' && c <= '9'; c = scan())
                val = (val << 3) + (val << 1) + (c & 15);
            return neg ? -val : val;
        }

        public long[] getLongArray(int size) {
            long[] ar = new long[size];
            for (int i = 0; i < size; ++i) ar[i] = nextLong();
            return ar;
        }

    }
}

