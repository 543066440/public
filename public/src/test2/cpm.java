package test2;

import java.sql.Date;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>Title: cpm</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年8月22日
 */
public class cpm {
	public static void main(String[] args) {
		Comparator<Object> com = Collator.getInstance(java.util.Locale.CHINA);
		String[] newArray = { "中山", "汕头", "广州", "安庆", "阳江", "南京", "武汉", "北京", "安阳", "北方" };
		List<String> list = Arrays.asList(newArray);
		Collections.sort(list, com);
		for (String i : list) {
			System.out.print(i + "  ");
		}
	}
	
	public void test(){
		System.currentTimeMillis();
//		String a = "陈 为隆";
//		String b ="陈为 隆";
		//String 
		if("陈 为隆".trim().equals("陈为 隆".trim())){
			System.out.println("YIY");
		}
	}
}
