package demoAssertionJUnit5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class AppTest {
	
	public static int x;
	public static int y;
	public static int i = 1;

	@BeforeAll
	public static void beforeAll()
	{
	    x = 15;
	    y = 3;
	}
	
	@AfterEach
	public static void afterEach()
	{
	    System.out.println("Fin du test "+ i);
	    i++;
	}
	
	
	
	@AfterAll
	public static void afterAll()
	{
	    System.out.println("Fin des tests");
	}
	
	@Test
    public void monPremierTest() {
    	assertTrue(true);
    }
	
	@Test
    public void monDeuxiemeTest() {
    	assertEquals(true,!false);
    }
	
	@Test
    public void monTroisiemeTest() {
    	assertEquals("jaune","jau"+"ne");
    }
	
	@Test
    public void monQuatriemeTest() {
		 assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
    }
	
	@Test
    public void monCinqiemeTest() {
    	assertFalse(5>9);
    }
	
	@Test
    public void monSixiemeTest() {
    	assertNotNull(2%2);
    }
	
	@Test
    public void monSeptiemeTest() {
		assertThat(5, is(4 + 1));
    }
	
	@Test
    public void monHuitiemeTest() {
		assertEquals(x,y * 5);
    }
	
	@Test
    public void monNeufiemeTest() {
    	assertNotSame("1",1);
    }
	
	@Test
    public void monDixiemeTest() {
	        assertEquals(10, Math.max(2, 10));
	    }    
	
	
}
