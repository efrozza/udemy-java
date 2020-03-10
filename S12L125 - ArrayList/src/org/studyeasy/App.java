package org.studyeasy;

import java.util.ArrayList;

public class App {

	// arraylist pode conter qualquer tipo de objeto

	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
		listNames.add("Everton");
		listNames.add("João");
		listNames.add("Maria");
		listNames.add("Steve");
		listNames.add("Salim");
		listNames.add("Neymar");

		// obtem indice zero do ArrayList
		// System.out.println(listNames.get(0));

		// mostrando lista completa
		// System.out.println(listNames);

		App app = new App();
		app.displayList(listNames);

		// remover

		app.removerNameByPosition(0);
		System.out.println("************* apos remover");
		app.displayList(listNames);

		app.removerNameByName("Neymar");
		System.out.println("************* apos remover");
		app.displayList(listNames);

		System.out.println("************* os dois primeiros");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));

		// alterar item do arrayList
		app.modiyName(2, "Novo Nome");
		System.out.println(listNames);

		// obter index do array
		int position = app.search("Novo Nome");

		if (position != -1) {
			app.modiyName(position, "NomeAlterado");
			System.out.println(listNames);
		} else {
			System.out.println("entrada invalida");
		}

		System.out.println("Posição no array " + position);

	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	void removerNameByPosition(int position) {
		listNames.remove(position);
	}

	void removerNameByName(String name) {
		listNames.remove(name);

	}

	void modiyName(int position, String newName) {
		listNames.set(position, newName);
	}

	int search(String name) {
		return listNames.indexOf(name);
	}
}
