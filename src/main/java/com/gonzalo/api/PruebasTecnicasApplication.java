package com.gonzalo.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebasTecnicasApplication {

	/*
	PROBLEMA
	Dado un diccionario/mapa de palabras,
	que pueden ser de cualquier largo,
	y tomando una palabra de entrada 
	buscar todas las secciones (sub strings) que esten contenidas en el diccionario.
	Ejemplo, Diccionario : a, aa, aaa , 
	Palabra de entrada : aaabaa,
	la salida deberia ser: a, a, a, aa, aa, aaa, a, a, aa.
	*/
	public static void main(String[] args) {
		SpringApplication.run(PruebasTecnicasApplication.class, args);
		
		List<String> array = Arrays.asList("a", "aa", "aaa");
		
		findDictionary("aaabaa", array);

	}
	
	public static void findDictionary(String wordEntry, List<String> dictionary) {

		final int lenAux = wordEntry.length();
		
		dictionary.stream().forEach(word -> {
			int len = word.length();
			
			for (int i = 0; i < lenAux; i++) {
				
				if(i + len > lenAux) break;
				
				String substring = wordEntry.substring(i, i + len);
				if( word.equals(substring) ) {
					System.out.println(substring);
				}
			}
		});
	}
}

