package JDK8;

/**
 * <p>Title: A</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年9月24日
 */
public interface Default {
	default void test(){
		System.out.println("test");
	}
	default void test3(){
		System.out.println("test3");
	}
	public void test2();
}
