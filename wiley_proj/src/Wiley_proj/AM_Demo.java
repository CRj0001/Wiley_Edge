package Wiley_proj;

import wiley_learn_oops.AM_House;

public class AM_Demo extends AM_House{
	public static void main(String[] args) {
		AM_House h = new AM_House();
		
		h.see();
		
		AM_Demo d = new AM_Demo();
		
		d.see();
		d.unkownPpl();
	}
}
