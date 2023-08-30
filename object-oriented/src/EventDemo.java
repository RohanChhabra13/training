
 class OuterEventImpl implements Event{

	@Override
	public void doSomething() {
		System.out.println("Outer event implementation");
		
	}
	
}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
System.out.println("Simple event implementation");
	}
	class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
		System.out.println("Inner Event Implementation");
			
		}
		
	}
	public static class  StaticEventImpl implements Event{

		@Override
		public void doSomething() {
		System.out.println("Static Event Implementation");
			
		}
		
	}
	
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{
			@Override
			public void doSomething() {
				System.out.println("Nested Event Implementation");
				
			}
		};
		new NestedEventImpl().doSomething();

	}
	public void oneLastEvent() {
		Event e = new Event(){
			@Override
			public void doSomething() {
				System.out.println("Anonymous Event Implementation");
				
			}
		};
		e.doSomething();
	}
	public void pakkaLastEvent() {
		Event e = ()->System.out.println("Lambda Event Implementation");
		e.doSomething();
	}
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();
		
		OuterEventImpl oe = new OuterEventImpl();
		oe.doSomething();
		
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.doSomething();
		
		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
		}

}
