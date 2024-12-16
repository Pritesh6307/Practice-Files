package accessspefiers;

class AC1 {
	public int a =30;
	private int b=40;
	int c = 50;
	protected int d=60;
	
	public void XYZ() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
		
	}
	
public class AC{
	public static void main(String[] args) {
		AC1 obj = new AC1();
		obj.XYZ();
	}

}
