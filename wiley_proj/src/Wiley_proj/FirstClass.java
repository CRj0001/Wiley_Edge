package Wiley_proj;

public class FirstClass implements Cloneable {

	int b = 5;

	void add() {
		System.out.println("calling method");
	}

	public static void main(String[] args) throws CloneNotSupportedException  {

		// CREATE OBJ. WITH NEW KEYWORD
		FirstClass obj = new FirstClass();
		
		
		System.out.println(obj.b);
		obj.add();
		System.out.println(obj);
		// -----------------------
		
		System.out.println("****************");
		
		// CREATE OBJ. WITH newInstance()
		try {
		Class c = Class.forName("Wiley_proj.FirstClass");
		@SuppressWarnings("deprecation")
		FirstClass fc = (FirstClass) c.newInstance();
		
		
		System.out.println(fc.b);
		fc.add();
		System.out.println(fc);
		}
		catch(ClassNotFoundException ce) {
			System.out.println(ce);
		}
		catch(InstantiationException ie) {
			System.out.println(ie);
		}catch( IllegalAccessException iae) {
			System.out.println(iae);
		}
		
		System.out.println("************************");
		
		//CREATE OBJ. WITH Object.clone();
		FirstClass objClone = (FirstClass)obj.clone();
		
		
		System.out.println(objClone.b);
		objClone.add();
		System.out.println(objClone);
	}

}
