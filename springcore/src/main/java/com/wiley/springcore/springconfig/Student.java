package com.wiley.springcore.springconfig;

public class Student {
	private Game game;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Game game) {
		super();
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void speak() {
		System.out.println("abcd");
		game.display();
	}
}
