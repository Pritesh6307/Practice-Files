package q_oops_Concept;

public class H_InterfaceDemo_Main implements H_InterfaceDemo {

	public static void main(String[] args) {
		H_InterfaceDemo_Main obj = new H_InterfaceDemo_Main();
		obj.a();
		obj.b();
		obj.c();

	}

	@Override
	public void a() {
		System.out.println("a Method");
	}

	@Override
	public void b() {
		System.out.println("b Method");

	}

	@Override
	public void c() {
		System.out.println("c Method");

	}

}
