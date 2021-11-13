/**
 * Funcionamiento de una cafetera
 * @author (David Briones) 
 * @version (1.0)
 */
public class Cafetera implements Comparable <Cafetera>
{
	/**
	 * Capacidades de la cafetera
	 */
	private int capacidadMáxima;
	private int capacidadActual;
	
	/**
	 * Establece la cantidad máxima de la cafetera a 1000 y la actual a 0
	 * 
	 * @param valor  La cantidad maxima de la cafetera
	 * @param cantidad	La cantidad actual de la cafetera
	 */
	Cafetera( int valor, int cantidad)
	{
		capacidadMáxima = valor;
		capacidadActual = (cantidad > valor)? cantidad: valor;
	}
	
	/**
	 * Se establece la cantidad máxima a 1000
	 */
	Cafetera ()
	{
		this(1000,0);
	}
	/**
	 * Se establece la cantidad máxima a 0
	 */
	
	Cafetera( int valor)
	{
		this(valor,0);
	}
	
	/**
	 * Muestra la capacidad máxima y la actual en la cafetera
	 * 
	 * @return	Devuelve los valores actuales de la cafetera 
	 */
	public int getCapacidadMáxima() 
	{
		return capacidadMáxima;
	}

	public int getCapacidadActual() 
	{
		return capacidadActual;
	}
	
	/**
	 * Establece la capacidad actual (0) a la máxima (1000)
	 */
	public void llenarCafetera()
	{
		capacidadActual = capacidadMáxima;
	}
	
	/**
	 * Establece la capacidad máxima (1000) a la mínima (0)
	 */
	public void vaciarCafetera()
	{
		capacidadActual = 0;
	}
	
	/**
	 * Sirve una taza con una cantidad determinada, restandolo así de la capacidad actual de la cafetera
	 * 
	 * @param vtaza	La cantidad de la taza que queremos echarnos de la cafetera
	 */
	public void servirTaza ( int vtaza)
	{
		capacidadActual -= vtaza;
		if ( capacidadActual <0) capacidadActual = 0;
	}
	
	/**
	 * Agrega una cantidad determinada a la capacidad actual de la cafetera
	 * 
	 * @param vcafe La cantidad que queremos agregar a la cafetera 
	 */
	public void agregarCafe ( int vcafe)
	{
		capacidadActual += vcafe;
		if ( capacidadActual > capacidadMáxima) capacidadActual = capacidadMáxima;
	}

	/**
	 * Ordena según la capacidad actual de las cafeteras
	 */
	public int compareTo(Cafetera o) 
	{	
		return this.capacidadActual - o.capacidadActual;
	}
	
	
}
