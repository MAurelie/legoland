package lego.test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lego.Boite;

public class TestBoiteLego {

	@Test
	public void testConstructor() {
		//given
		var number = 21318;
		var name = "La cabane dans l'arbre";
		var pieces = 3036;
		var figurines = 4;
		var price = 199.99;
		//when
		var boite = new Boite(number, name, pieces, figurines, price);
		//then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name"),
				() -> assertEquals(pieces, boite.getPieces(), "piece"),
				() -> assertEquals(figurines, boite.getFigurines(), "figurines"),
				() -> assertEquals(price, boite.getPrice(), "price")
			);
	}

	@Test
	public void testCompareTo() {
		//given
		var numberA = 21318;
		var nameA = "La cabane dans l'arbre";
		var piecesA = 3036;
		var figurinesA = 4;
		var priceA = 199.99;
				
		var numberB = 21317;
		var nameB = "Steamboat Willie";
		var piecesB = 751;
		var figurinesB = 2;
		var priceB = 89.99;
		
		var numberC = 75192;
		var nameC = "Millennium Falcon";
		var piecesC = 7541;
		var figurinesC = 11;
		var priceC = 799.99;
		
		//when
		var boiteA = new Boite(numberA, nameA, piecesA, figurinesA, priceA);
		var boiteB = new Boite(numberB, nameB, piecesB, figurinesB, priceB);
		var boiteC = new Boite(numberC, nameC, piecesC, figurinesC, priceC);
		//then
		assertTrue(boiteA.compareTo(boiteB)==-1);
		assertTrue(boiteA.compareTo(boiteC)==1);
		assertTrue(boiteA.compareTo(boiteA)==0);
	}
}
