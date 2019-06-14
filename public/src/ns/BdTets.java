package ns;

import java.math.BigDecimal;

/**
 * <p>Title: BdTets</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年4月24日
 */
public class BdTets {
	public static void main(String[] args) {
		String bd = "10.12";
		BigDecimal b = new BigDecimal(bd);
		String st = b.toString();
		System.out.println(st);
	}
}
