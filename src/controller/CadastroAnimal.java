package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		Reptil a1 = new Reptil("r�ptil", 4, "escamas", "ov�paro", "carn�voro", false);
//		System.out.println(a1);
		
		Reptil a2 = new Reptil("r�ptil", 4, "escamas", "ov�paro", "carn�voro", true); 
//		System.out.println(a2);
		
		Mamifero a3 = new Mamifero("mam�fero", 4, "pelos", "viv�paro", "carn�voro", "terrestre"); 
//		System.out.println(a3);
		
		Mamifero a4 = new Mamifero("mam�fero", 0, "pele", "viv�paro", "carn�voro", "aqu�tico"); 
//		System.out.println(a4);
		
		a1.exibir();
		a2.exibir();
		a3.exibir();
		a4.exibir();

	}

}
