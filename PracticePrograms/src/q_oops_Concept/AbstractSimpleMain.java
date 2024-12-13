package q_oops_Concept;

public class AbstractSimpleMain extends AbstractSimple {

	public static void main(String[] args) {
		AbstractSimpleMain asm = new AbstractSimpleMain();
		asm.A();
		asm.B();

	}

	@Override
	void A() {
		System.out.println("A");

	}

	@Override
	void B() {
		System.out.println("B");

	}

}
