package org.codetest.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//P_12969_직사각형별
public class P_12969_StarOfLectangular {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] arr =  br.readLine().split(" ");
    	int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        for(int i=1;i<=a*b;i++){
            System.out.print("*");
            if(i%a==0) System.out.println();
        }
        br.close();
    }
}
