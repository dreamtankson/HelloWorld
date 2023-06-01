package com.hsoedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("2999999999999999999999");
		BigInteger bigInteger2 = new BigInteger("100");
		
		System.out.println(bigInteger);
		
		
		BigInteger add = bigInteger.add(bigInteger2);
		System.out.println(add);
		BigInteger subtract = bigInteger.subtract(bigInteger2);
		System.out.println(subtract);
		BigInteger multiply = bigInteger.multiply(bigInteger2);
		System.out.println(multiply);
		BigInteger divide = bigInteger.divide(bigInteger2);
		System.out.println(divide);
	}

}
