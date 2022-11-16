interface SayHello {
	public void hello();
}

class Greeting {
	static void greet(SayHello s) {
		s.hello();
	}
}

public class AnonymousClassExample {
	public static void main(String[] args) {
		class Person implements SayHello {
			public void hello() {
				System.out.println("こんにちは");
			}
		}
		Person p = new Person();
		Greeting.greet(p);
	}
}