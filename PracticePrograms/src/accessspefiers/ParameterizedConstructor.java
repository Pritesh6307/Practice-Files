package accessspefiers;

public class ParameterizedConstructor {

	
		int id; //Global variable
		String name; //Global variable
		String address; //Global variable
		
		//Default Constructor
		ParameterizedConstructor(){
			System.out.println("Hello Default Constructor");
			
		}
		//Parameterized Constructor
		ParameterizedConstructor(int a, String b, String c){
			id = a;
			name = b;
			address = c;
		}
		public void Display() {
			System.out.println(id + "" + name + "" + address);
		}
		
		public static void main(String[] args) {
			//calling Default Constructor
			ParameterizedConstructor obj = new ParameterizedConstructor();
			
			//Calling Parameterized Constructor
			ParameterizedConstructor abc = new ParameterizedConstructor(101, " Simon ", "Nagpur");
			ParameterizedConstructor xyz = new ParameterizedConstructor(102, " Peter ", "Pune");
			
			abc.Display();
			xyz.Display();
		}
		

	}

