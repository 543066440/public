package JDK8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * <p>Title: Lambda</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年9月24日
 */
public class Lambda {
	public static void main(String[] args) {
		B b = new B();
		b.test();
		b.test3();
	}
	
	public int max(int a,int b){
		return a>b?a:b;
	}
	
	public BigDecimal max(BigDecimal a,BigDecimal b){
		return b;
	}
	public void printvalue(String str){
		System.out.println(str);
	}
	
	@Test
	public void test1(){
		Default d = new Default(){
			public void test2(){
			     System.out.println("eat something");
			};
		};
		d.test2();
	}
	
	@Test
	public void test2(){
		//Lambda
		Default d = () ->{
			System.out.println("test2-1");
		};
		d.test2();

		//如果只有一行代码
		Default d2 = () -> System.out.println("test2-2");System.out.println("test2-2");
		d2.test2();
		
	}
	@Test
	public void test3() throws Exception{
		String age1 = "test3";
		LambdaTest lambdaTest = age -> System.out.println("age:" + age);
		lambdaTest.test(age1);
		LambdaTest2 lambdaTest2 = (str1,str2,str3) -> {
			String str = str1 + str2 + str3;
			return str;
		};
		String string = lambdaTest2.get("T", "I", "T");
		System.out.println(string);
	}
	
	@Test
	public void test4(){
	//	LambdaTest2 get = LambdaTest2::get;
	}

	@Test
	public void test5(){
		//不能对外部的变量修改
		int a = 1;
		Default d = () ->{
			System.out.println(a);
		};
	}
	
}
