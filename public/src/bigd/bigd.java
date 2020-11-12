package bigd;

import java.math.BigDecimal;

public class bigd {
	
	BigDecimal a;
	//@Test
	public static void main(String[] args) {
		BigDecimal a = BigDecimal.valueOf(0l);
		add(a);
		System.out.println(a);
		System.out.println(a.hashCode());
		
	}
	
	public static void add(BigDecimal a) {
		a = a.add(BigDecimal.valueOf(10.00));
		System.out.println(a.hashCode());
	}

}
