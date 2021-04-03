package date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Title: mobile</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年11月5日
 */
public class mobile {
	public static void main(String[] args) {
        System.out.println("是正确格式的手机号:"+isMobile("18650314385"));
    }
    public static boolean isMobile(String mobiles) {
    	Pattern p = Pattern.compile("^1[3456789]\\d{9}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();	
    }
}
