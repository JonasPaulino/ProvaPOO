package Classes;


public class Programador extends Profissional implements HomeOffice{
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
	
	//PROGRAMADOR N�O USA OS M�TODOS DE PROFISSIONAL MAS SIM A OBRIGAT�RIEDADE DE FUNCIONARIO
	@Override
	public void registraPontoHomeOffice() {
		System.out.println("Registrando ponto externo home office....");
		
	}


}
