package com.test.git.github.main;

import java.util.ArrayList;
import java.util.List;

import com.test.git.github.model.OtroModel;

public class Principal {
	/**
	 * Comentario para el método
	 * @param sum
	 */
	public void display(int sum){
		
		List<OtroModel> otros = new ArrayList<OtroModel>();
		int i=0;
		for (OtroModel otroModel : otros) {
			System.out.println("Imprimir algo");
			i++;
			System.out.println("Nuevo comment");
			sum+=i;
		}
	}
		
}
