package q_oops_Concept;

public class G_AbstractDemo_Main extends G_AbstractDemo{

	public static void main(String[] args) {
		G_AbstractDemo_Main obj = new G_AbstractDemo_Main();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

	@Override
	void a() {
		System.out.println("Abstract a Method");
		
	}

	@Override
	void b() {
		System.out.println("Abstract b Method");
		
	}

	@Override
	void c() {
		System.out.println("Abstract c Method");
		
	}

}
