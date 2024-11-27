package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_10811 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list =  new ArrayList<Integer>();
        for(int i=1; i <= n; i ++) {
        	list.add(i);
        }
        for(int i=1; i <= m; i ++) {
        	Collections.reverse(list.subList(sc.nextInt()-1, sc.nextInt() ));  
        }
        sc.close();
        for(int num : list) {
        	System.out.print(num+" ");
        }
	}	
}
