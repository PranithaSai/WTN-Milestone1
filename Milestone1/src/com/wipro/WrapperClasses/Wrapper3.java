package com.wipro.WrapperClasses;
import java.util.*;
public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1&&n<=255)
		System.out.println(String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0"));
		
		sc.close();
	}

}
