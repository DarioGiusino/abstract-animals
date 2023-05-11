package org.java.obj;

import org.java.obj.abs.Animal;

public class Eagle extends Animal {
	@Override
	public String verse() {
		return "Verso dell'aquila";
	}
	
	@Override
	public String eat() {
		return "Cibo dell'aquila";
	}
	
	@Override
	public String toString() {
		return "[Aquila]" + verse()
				+ "\nmangia: " + eat()
				+ "\ndorme: " + sleep();
	}
}
