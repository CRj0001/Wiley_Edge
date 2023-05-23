package Wiley_proj;

public class PracInstanceBlock {
	
	String hobby;
	int date;
	{
		hobby = "abc";
		date = 21;
		System.out.println("Instance block");
	}
	
	PracInstanceBlock(){
		System.out.println("Hobby: "+hobby+ ", date: "+date);
		System.out.println("Constructor with 0 args");
	}

	PracInstanceBlock(String str){
		System.out.println("Constructor with 1 arg name : " + str);
	}
	
	public static void main(String[] args) {
		
		PracInstanceBlock pib = new PracInstanceBlock();
		
		new PracInstanceBlock("Raj");
	}

}
