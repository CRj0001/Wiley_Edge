package MethodReferenceConcept;


interface GetInfo{
	 Info display(String str); 
		
	
}
	
class Info{
	public Info(String str) {
		System.out.println(str);
	}
}
public class ConstructorMR {
	public static void main(String[] args) {
		GetInfo inf = Info::new;
		inf.display("Learning JAVA");
		
	}
}
