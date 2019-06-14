package string;

import java.io.UnsupportedEncodingException;

/**
 * <p>Title: test</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年6月13日
 */
public class test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "中文字符床长度）*&输入的错误提示断点断点断点断点断点断我啦啦啦";
		
		int a = s1.getBytes("UTF-8").length;
		System.out.println(a);
		String s2 = "";
		if(a>90){
			s2 = s1.substring(0, 30);
		}
		
		System.out.println(s2);
	}
}
