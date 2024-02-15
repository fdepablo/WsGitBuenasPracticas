package git;

public class MainGitBuenasPracticas {

	public static void main(String[] args) {
		System.out.println("Bienvenidos al proyecto");

		
		Direccion d1 = new Direccion();
		d1.setCiudad("Madrid");

		Persona p1 = new Persona();
		CuentaBancaria[] arrayCb1  = new CuentaBancaria[2];
		p1.setCuentasBancarias(arrayCb1);


	}

}
