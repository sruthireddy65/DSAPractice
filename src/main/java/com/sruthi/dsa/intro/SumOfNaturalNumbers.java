package com.sruthi.dsa.intro;

public class SumOfNaturalNumbers {

    //approach1
    public int sum1(int n) {

        return n*(n+1)/2;
    }

    //approach2
    public int sum2(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum+=i;
        }
        return sum;
    }

    //approach3
    public int sum3(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                sum+=1;
            }
        }
        return sum;
    }
}
