package Classes;

public class Operador extends Profissional{
	String cargaHoraria;
	String salario;
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	//OPERADOR TEM OS DOIS MÉTODOS DE PROFISSIONAL
	public void registraPontoEntrada() {
		System.out.println("Registrado entrada interna....");
	};
	public void registraPontoSaida() {
		System.out.println("Registrado saída interna....");
	};
	
}
