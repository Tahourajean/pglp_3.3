package uvsq.fr;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void avanceTest() {
		
       
        String expResult = "j'avance";
		robot.avancerTous("j'avance");
        assertEquals(expResult, expResult, "j'avance");
        
    }
}
