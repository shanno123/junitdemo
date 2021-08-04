package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void test() {
		//Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;		
		
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };	
			
        	Integer string6 =10;	

        //Assert statements		
        	assertEquals(string1,string2);//both string are equal or not					
        	assertSame(string3, string3);	//both objects belong to same class or not				
        	assertNotSame(string1, string3);					
        	assertNotNull(string1);			
        	assertNull(string5);			
        	assertTrue(variable1 < variable2);					
        	assertArrayEquals(airethematicArrary1, airethematicArrary2);//compare two array's				

	}

}
