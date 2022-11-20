package com.main;


public class Average {

    public Float average(int k, int[] list){
        
        if(k<0 || list==null ||list.length==0 || k==0)
            return null;

        Float average = 0.0f;
        int n = Math.min(k, list.length);
        for(int i = 0 ; i < n; i++){
            average += list[i];
        }
        average = average/n;
        return average;

    }
}
