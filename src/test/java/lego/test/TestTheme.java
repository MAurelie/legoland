package lego.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import lego.Theme;

public class TestTheme {

	
	@Test
	public void testName() {
		String ow = "Overwatch";
		Theme owt = new Theme(ow);
		assertTrue(ow == owt.getName());
	}
	
	@Test
	public void testEquals() {
		String owName = "Overwatch";
		Theme ow = new Theme(owName);
		Theme ow2 = new Theme(owName);
		assertTrue(ow.equals(ow2));
	}
	
	@Test
	public void testString() {
		Theme ow = new Theme("La médecine gériatrique chez Mickey Mouse");
		assertEquals(ow.toString(),"Le thème est : La médecine gériatrique chez Mickey Mouse");
	}
	
	
	

}
