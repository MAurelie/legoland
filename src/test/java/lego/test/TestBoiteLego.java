package lego.test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
				() -> assertEquals(pieces, boite.getPiece(), "piece"),
				() -> assertEquals(figurines, boite.getFigurines(), "figurines"),
				() -> assertEquals(price, boite.getPrice(), "price")
			);
	}

}
