import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test para Cafetera.java
 *
 * @author  (David Briones)
 * @version (1.0)
 */

public class CafeteraJunit 
{
	/**
	 * Constructor para la clase CafeteraJunit
	 */
	public CafeteraJunit() 
	{
	}
	
	@Test
	public void getCapacidadMáxima() 
	{
		Cafetera c1 = new Cafetera(1000,0);
		c1.getCapacidadMáxima();
		assertTrue(c1.getCapacidadMáxima()==1000);
	}
	
	@Test
	public void getCapacidadActual() 
	{
		Cafetera c1 = new Cafetera(1000,0);
		c1.getCapacidadActual();
		assertTrue(c1.getCapacidadActual()==0);
	}
	
	@Test
	public void llenarCafetera() 
	{
		Cafetera c1 = new Cafetera(1000,0);
		c1.llenarCafetera();
		assertTrue(c1.getCapacidadActual() == 1000);
	}
	
	@Test
	public void vaciarCafetera() 
	{
		Cafetera c1 = new Cafetera(1000,500);
		c1.vaciarCafetera();
		assertTrue(c1.getCapacidadActual()==0);
	}
	
	@Test
	public void servirTaza() 
	{
		Cafetera c1 = new Cafetera(1000,750);
		c1.servirTaza(250);
		assertTrue(c1.getCapacidadActual()==500);
	}
	
	@Test
	public void agregarCafe() 
	{
		Cafetera c1 = new Cafetera(1000,200);
		c1.agregarCafe(400);
		assertTrue(c1.getCapacidadActual()==600);
	}
	
	@Test
	public void compareTo() 
	{
		Cafetera c1 = new Cafetera(1000,0);
		Cafetera c2 = new Cafetera(1000,600);
		c1.compareTo(c2);
		assertTrue(c1.compareTo(c2)==400);
	}
}


