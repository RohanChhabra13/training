import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.ey.shop.Product;

public class ProductReflection {
public static void main(String[] args)throws Exception {
//	Product p1 = new Product("Parker",120);
//	p1.print();
//	System.out.println(p1);
//	
//	Class pc =p1.getClass();
	Class pc = Class.forName("com.ey.shop.Product");
	System.out.println(pc.getName());
	System.out.println(pc.getPackageName());
	System.out.println(pc.getSimpleName());
	
	System.out.println("List of constructors");
	Constructor [] constructors = pc.getConstructors();
	for(Constructor c : constructors)System.out.println(c);
	
	System.out.println("List of methods");
	Method [] methods = pc.getMethods();
	for(Method m: methods)
System.out.println(m);			
	
	System.out.println("List of declared methods");
	Method [] decMethods = pc.getDeclaredMethods();
	for(Method m: decMethods)
		System.out.println(m);
	
	System.out.println("List of fields");
			Field [] fields = pc.getFields();
			for(Field f:fields)
		System.out.println(f);
			
			System.out.println("List of fields");
			Field [] fieldss = pc.getDeclaredFields();
			for(Field f:fieldss) {
		System.out.println(f.getModifiers());
			System.out.println(f);}
	
 }
}
