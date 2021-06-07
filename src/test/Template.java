package test;

import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Template
{
    public static class rtn
    {
        int a;
        int b;
        public rtn(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
    }

    private static rtn test(int a, int b)
    {
        rtn result = new rtn(a, b);
        result.a = a;
        result.b = b;
        return result;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        
        int[] breedids = new int[n];
        for (int i = 0; i < n; i++)
        {
            breedids[i] = in.nextInt();
        }
        
        in.close();

        rtn result = test(1, 2);
        System.out.println(result.a);
        System.out.println(result.b);


        int answer = 0;
        System.out.println(answer);
    }
}