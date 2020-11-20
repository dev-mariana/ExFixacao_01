package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		Reptil a1 = new Reptil("réptil", 4, "escamas", "ovíparo", "carnívoro", false);
//		System.out.println(a1);
		
		Reptil a2 = new Reptil("réptil", 4, "escamas", "ovíparo", "carnívoro", true); 
//		System.out.println(a2);
		
		Mamifero a3 = new Mamifero("mamífero", 4, "pelos", "vivíparo", "carnívoro", "terrestre"); 
//		System.out.println(a3);
		
		Mamifero a4 = new Mamifero("mamífero", 0, "pele", "vivíparo", "carnívoro", "aquático"); 
//		System.out.println(a4);
		
		a1.exibir();
		a2.exibir();
		a3.exibir();
		a4.exibir();

	}

}
