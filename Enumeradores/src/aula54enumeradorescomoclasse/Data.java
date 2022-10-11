package aula54enumeradorescomoclasse;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private DiaSemana DiaSemana;

	public Data(int dia, int mes, int ano, aula54enumeradorescomoclasse.DiaSemana diaSemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		DiaSemana = diaSemana;

	}
//
//		public Data() {
//			super();
//			// TODO Auto-generated constructor stub
//		}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaSemana getDiaSemana() {
		return DiaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		DiaSemana = diaSemana;
	}

}
