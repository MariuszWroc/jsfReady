/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.myproject.mysite.main;

import java.util.Collection;

/**
 *
 * @author Mariusz Czarny
 */
public class Main {

	

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		
    }

    @SuppressWarnings("unused")
	private static void printCollection(Collection<?> collection) {
        collection.forEach(p -> System.out.println(p.toString()));
    }
}
