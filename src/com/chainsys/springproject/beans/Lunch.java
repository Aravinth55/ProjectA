package com.chainsys.springproject.beans;

public class Lunch {
	public Starters entree;
	public MainCourse mainfood;
	public Desert sweet;

//Constructor based dependency injection
	public Lunch(Starters s, MainCourse m, Desert d) {
		System.out.println("Lunch is ready");
		entree = s;
		mainfood = m;
		sweet = d;
	}
	public void serve() {
		System.out.println(entree.name);
		System.out.println(mainfood.name);
		System.out.println(sweet.name);
	}
}
/*
 * Lunch
 * Starters,Chicken,Soup,Vegroll
 * Maincourse, SouthIndian,NorthIndian,Chinese
 * Desert,Icecream,Sweets,Cakes
 */
