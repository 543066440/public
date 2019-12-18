package string;

import java.io.UnsupportedEncodingException;

/**
 * <p>
 * Title: test
 * </p>
 * <p>
 * Describe: TODO
 * </p>
 * 
 * @author wangsp
 * @date 2019年6月13日
 */
public class test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String bstr = "12345678901234567890123456789是";
		//String bstr = "一二三四五六七八九十0";
		int lenght = bstr.getBytes("UTF-8").length;
		if(lenght > 30){
			int n = isChinese(bstr,30);
			String astr = bstr.substring(0,n);
			System.out.println("截取后的字符串:" + astr);
		} else {
			System.out.println(bstr);
		}
	}
	/**
	 * 
	 * @param str
	 * @param n
	 * @return
	 */
	public static int isChinese(String str,int n) {
		int num = 0;
		int index = 0;
		for (char c : str.toCharArray()) {
			if(num < n){
				if (isChineseByBlock(c) || isChinesePunctuation(c)) {
					num = num + 3;
				} else {


				}
				index++;
			}
		}
		if(num > n ){
			index --;
			return index;
		} else {
			return index;
		}
	}
	// 判断汉字
	public static boolean isChineseByBlock(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) {
			return true;
		} else {
			return false;
		}
	}
	// 判断中文标点符号
	public static boolean isChinesePunctuation(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.GENERAL_PUNCTUATION 
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS
				|| ub == Character.UnicodeBlock.VERTICAL_FORMS) {
			return true;
		} else {
			return false;
		}
	}

	// JDK1.7版本以上相当于 isChineseByBlock全部
	public static boolean isChineseByScript(char c) {
		Character.UnicodeScript sc = Character.UnicodeScript.of(c);
		if (sc == Character.UnicodeScript.HAN) {
			return true;
		}
		return false;
	}

	public static boolean isChinese(char c) {
		return c >= 0x4E00 && c <= 0x9FA5;// 根据字节码判断
	}
}
