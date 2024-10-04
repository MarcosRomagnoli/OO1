package ar.edu.unlp.info.oo1.Ejercicio9;

public class Test {

	public static void main(String[] args) {
		CajaDeAhorro caja1= new CajaDeAhorro();
		CuentaCorriente caja2 = new CuentaCorriente();
		caja2.setLimite(200);
		
		System.out.println("Saldo: " + caja1.getSaldo());
		caja1.depositar(100);
		System.out.println("Saldo: " + caja1.getSaldo());
		caja1.extraer(200000);
		System.out.println("Saldo: " + caja1.getSaldo());
		caja1.extraer(50);
		System.out.println("Saldo: " + caja1.getSaldo());
		
		System.out.println("------------");
		
		System.out.println("Saldo: " + caja2.getSaldo());
		caja2.depositar(300);
		System.out.println("Saldo: " + caja2.getSaldo());
		caja2.extraer(400);
		System.out.println("Saldo: " + caja2.getSaldo());
		caja2.depositar(100);
		System.out.println("Saldo: " + caja2.getSaldo());
		caja2.extraer(20000);
		System.out.println("Saldo: " + caja2.getSaldo());
	}
}
