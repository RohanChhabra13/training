
public class Person {
	private String name;
	private int age;
	
	public Person() {
		//constructor chaining
		this("Anonymous",-1); // Calling another constructor with matching signature
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Name: "+ name + "\tAge: "+age);
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Name: "+ name + "\tAge: "+age;
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [Name: "+ name + "\tAge: "+age+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person p) {
//			Person p = (Person) obj;
			if(this.age==p.age && name.equals(p.name))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Declaration = Instantiation
		Person p1 = new Person("Polo",21);
		p1.print();
		
		Person p2 = new Person();
		p2.print();
		
		System.out.println(p1.hashCode());
		System.out.println(p1);// calling the toString(), either simply type or use toString()
		
		Person p3 = new Person("Polo",21);
		System.out.println(p3);
		
		System.out.println(p1.equals(p3));
	}

}
