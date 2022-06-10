package com.chainsys.springproject.beans;

public class ScoreBoard {
	public int targetScore;

	private ScoreBoard() {
		System.out.println("ScoreBoard object is created");

	}

	private ScoreBoard(int runs) {
		targetScore = runs;
		System.out.println("ScoreBoard object is created");

	}

//factory method - The methods are static here
	public static ScoreBoard createObject() {
		return new ScoreBoard();

	}
	public static ScoreBoard createObject(int runs) {
		return new ScoreBoard(runs);
}
}
