package com.wipro.WrapperClasses;

public class Wrapper2 {
	public static void main(String[] args) {
		System.out.println("Given Number :"+Integer.valueOf(args[0]));
		System.out.println("Binary equivalent :"+Integer.toBinaryString(Integer.valueOf(args[0])));
		System.out.println("Octal equivalent :"+Integer.toOctalString(Integer.valueOf(args[0])));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(Integer.valueOf(args[0])));
	}
}
