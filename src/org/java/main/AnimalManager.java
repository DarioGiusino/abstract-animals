package org.java.main;

import org.java.inter.FlyingAnimal;
import org.java.inter.SwimmingAnimal;

public class AnimalManager{

	public String letFly(Object obj) {
		return ((FlyingAnimal) obj).fly();
	}
	
	public String letSwim(Object obj) {
		return ((SwimmingAnimal) obj).swim();
	}
}
