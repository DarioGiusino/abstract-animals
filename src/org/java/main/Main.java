package org.java.main;

import org.java.obj.Dog;
import org.java.obj.Dolphin;
import org.java.obj.Eagle;
import org.java.obj.Sparrow;
import org.java.obj.abs.Animal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dolphin dolphin = new Dolphin();
		Eagle eagle = new Eagle();
		Sparrow sparrow = new Sparrow();
		
		Animal[] animalArr = {dog, dolphin, eagle, sparrow};
		
		for(int i = 0; i < animalArr.length; i++) {
			
			Animal a = animalArr[i];
			
			System.out.println(a);
		}
	}
}
