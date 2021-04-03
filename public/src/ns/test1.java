package ns;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>Title: test1</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年4月19日
 */
public class test1 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IntrospectionException {
		Person person = new Person();
		Person person2 = null;
		BeanUtils.tobean(person);
		String nString = null;
		String string = "";
		if("1".equals(nString)){
			System.out.println("111");
		}
	//	System.out.println("年龄"+person.getAge());
	}
}
