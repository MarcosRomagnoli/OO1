package ar.edu.unlp.info.oo1.Ejercicio8;

public class Test {

	public static void main(String[] args) {
		
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();

		Gerente alan2 = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan2.sueldoBasico();

		System.out.println("Aportes de Alan: " + aportesDeAlan); // 2850
		System.out.println("Sueldo básico de Alan: " + sueldoBasicoDeAlan); // 67850
		
		/* 
		 
		 Alan 1:
		 -Llamada a aportes() en Gerente
		 -Ejecución de montoBasico() en Gerente
		 -57000×0.05=2,850

		Alan 2: Busca metodo y busca valores de igual manera
		-Llamada a sueldoBasico() en Gerente
		-Ejecución de sueldoBasico() en EmpleadoJerarquico
		-Ejecución de sueldoBasico() en Empleado}
		-Ejecución de montoBasico() en Gerente
		-Ejecución de aportes() en Gerente
		-Resultado de sueldoBasico() en Empleado
		-Suma de bonoPorCategoria() en EmpleadoJerarquico
		-59,850+8,000=67,850
		
		*/
	}

}
