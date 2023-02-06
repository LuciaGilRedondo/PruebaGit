package banco;

/**
 * Nos permite hacer ingresos y reintegros en una cuenta bancaria
 * y consultar el saldo de la cuenta.
 * @author Lucía Gil
 * @version 1.0		24/10/2022
 */
public class CuentaBancaria {

	// Declaración de atributos
	/**
	 * cuenta: es el número de la cuenta.
	 * saldo: nos dice el saldo actual de la cuenta.
	 */
	private String titular;
	private String cuenta;
	private double saldo;
	
	//Lo añadido
	int[] [] numeros = new int[5][2];
	
	for (int i=0; i<numeros.length; i++) {
		System.out.println("Hola");
	}
	
	// Constructores
	public CuentaBancaria() { }
	
	public CuentaBancaria(String titular, String cuenta, double saldo) {
		this.titular=titular;
		this.cuenta=cuenta;
		this.saldo=saldo;
	}
	
	// Getter y Setter
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Método ingreso
	/**
	 * Ingresa una cantidad de dinero en la cuenta
	 * @param cantidad: dinero a ingresar 
	 * @return valor boolean: true si se ha efectuado correctamente la operación
	 * y false si la operación no se ha realizado.
	 */
	public boolean ingreso(double cantidad) {
		
		if (cantidad < 0) {
			return false;
			
		} else {
				saldo+=cantidad;
				return true;
				}
	}

	// Método reintegro
	/**
	 * Retirar dinero de la cuenta bancaria
	 * @param cantidad: el dinero a retirar
	 * @return un valor boolean: true si se ha realizado la operación correctamente
	 * y false en caso contrario.
	 */
	public boolean reintegro(double cantidad) {
		
		if ((cantidad < 0) || (saldo < cantidad)) {
			return false;
		} else {
				saldo-=cantidad;
				return true;
				}
	}
}

	
