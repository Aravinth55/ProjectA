package com.chainsys.springproject.beans;

public class Desert {
	public String name;
}

class Icecream extends Desert {
	public Icecream() {
		name = "Chocolate";
	}

}

class Sweets extends Desert {
	public Sweets() {
		name = "Laddu";
	}

}

class Cakes extends Desert {
	public Cakes() {
		name = "Russianvelvat";
	}

	public Cakes(String name) {
		this.name = name;
	}

}
