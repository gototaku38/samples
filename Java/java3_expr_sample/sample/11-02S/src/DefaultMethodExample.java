interface SayHello {
	default void hello() {
		System.out.println("Hello");
	}
}

class EnglishGreet implements SayHello {
}

class JapaneseGreet implements SayHello {
	public void hello() {
		System.out.println("こんにちは");
	}
}

public class DefaultMethodExample {
	public static void main(String[] args) {
		SayHello a = new EnglishGreet();
		SayHello b = new JapaneseGreet();
		a.hello();
		b.hello();
	}
}
