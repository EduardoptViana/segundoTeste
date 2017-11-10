package polimorfismo.exemplo1;

public class Testador {

	public static void main(String[] args) {

		CalculadoraDeSalario cds = new CalculadoraDeSalario();

		FuncionarioHorista fh = new FuncionarioHorista(1, "Juquinha", 160, 20);
		cds.calcularSalario(fh);
		System.out.println(fh.toString());

		FuncionarioComissionado fc = new FuncionarioComissionado(2, "Anne",
				2000, 145);
		cds.calcularSalario(fc);
		System.out.println(fc);

		FuncionarioNormal fn = new FuncionarioNormal(3, "Juliana", 4500);
		cds.calcularSalario(fn);
		System.out.println(fn);

	}

}
