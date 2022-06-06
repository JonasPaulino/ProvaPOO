package Classes;

public class Profissional extends Pessoa {
	int matricula;
	String Cargo;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	
	public void registraPontoEntrada() {
		System.out.println("Registrado entrada....");
	};
	public void registraPontoSaida() {
		System.out.println("Registrado saída....");
	};
}
