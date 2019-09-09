package com.LiuXi.Util;

public class GetSum {

    public static  int getSum(int...ids){


        int sum=0;

        for (int i :ids){

            sum+=i;
        }

        return  sum;

    }


}
