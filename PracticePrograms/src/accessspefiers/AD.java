package accessspefiers;

 class AD1 {
	
	public int w=1;
	private int x=2;
	protected int y =3;
	int z=4;
	
	public void ad() {
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
 }
 public class AD{
	 
	public static void main(String[] args) {
		AD1 obj=new AD1();
		obj.ad();
		

	}

}
