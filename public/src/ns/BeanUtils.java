package ns;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>Title: BeanUtils</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年4月19日
 */
public class BeanUtils {
	

	public static void tobean(Person pe) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
		//获得该bean
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class); 
		
		PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();  
		 
        for (PropertyDescriptor propDesc : proDescrtptors) {  
            if (propDesc.getName().equals("age")) {  
                Method methodSetUserName = propDesc.getWriteMethod();  
                methodSetUserName.invoke(pe, 25);  
                System.out.println("AGE" + pe.getAge());  
                break;  
            }  
        }  
	}
}
