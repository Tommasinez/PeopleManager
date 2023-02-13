package it.betacom.controller;

import java.util.ArrayList;

import it.betacom.model.Person;

public class Controller {
	public static void main(String[] args) {
		Person person0 = new Person("Luigi", "Bianchi");
		Person person1 = new Person("Luigi", "Rossi");
		Person person2 = new Person("Luigi", "Rossi");
		Person person3 = new Person("Luigi", "Verdi");
		Person person4 = new Person("Luigi", "Verdi");
		Person person5 = new Person("Marco", "Bianchi");
		Person person6 = new Person("Marco", "Rossi");
		Person person7 = new Person("Marco", "Verdi");
		Person person8 = new Person("Maria", "Bianchi");
		Person person9 = new Person("Maria", "Rossi");

		person0.setHomeTown("Bari");
		person1.setHomeTown("Padova");
		person2.setHomeTown("Padova");
		person3.setHomeTown("Roma");
		person4.setHomeTown("Torino");
		person5.setHomeTown("Padova");
		person6.setHomeTown("Roma");
		person7.setHomeTown("Torino");
		person8.setHomeTown("Padova");
		person9.setHomeTown("Roma");

		ArrayList<Person> peopleList = new ArrayList<Person>();
		peopleList.add(person0);
		peopleList.add(person1);
		peopleList.add(person2);
		peopleList.add(person3);
		peopleList.add(person4);
		peopleList.add(person5);
		peopleList.add(person6);
		peopleList.add(person7);
		peopleList.add(person8);
		peopleList.add(person9);

		for (Person p : peopleList) {
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getHomeTown());
		}
	}
}
