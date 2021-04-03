package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * <p>Title: test</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年4月10日
 */
public class test {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(){
			{
				add("SS");
			}
		};

		Set<Integer> set = new HashSet(arrayList);
		if(arrayList.isEmpty()){
			System.out.println("w");
		}
		
		BigDecimal value = new BigDecimal(0.1);
		BigDecimal value2 = BigDecimal.valueOf(0.1);
		String a ="1";
		String b = null;
		System.out.println(Objects.equals(a, b));
		
	}

	public void test(){
		System.out.println("111");
		String b = null;
		String c = "迪桑便";
	}
}
