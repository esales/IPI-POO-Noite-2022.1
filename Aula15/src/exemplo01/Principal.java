package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("Vazia? " + lista.isEmpty() );
		
		String texto = "Novo texto 1";

		System.out.println("Adicionando elementos.");
		lista.add(texto);
		lista.add("Novo texto 2");
		lista.add("Novo texto 3");
		lista.add("Novo texto 3");
		System.out.println("Vazia? " + lista.isEmpty() );
		
		System.out.println(lista);
		
		System.out.println( lista.get(1) );
		
		System.out.println("\nRemovendo elemento da posição 1.");
		lista.remove(1);
		System.out.println( lista.get(1) );
		System.out.println(lista);
		
		System.out.println("\nRemovendo o primeiro elemento 'Novo texto 3'");
		lista.remove("Novo texto 3");
		System.out.println(lista);
		
		
		System.out.println("\nInserindo novo elemento na posição 0");
		lista.add(0, "Novo texto 4");
		System.out.println(lista);

		System.out.println("\nOrdenando texto.");
		lista.sort(null);
		System.out.println(lista);
	}
}