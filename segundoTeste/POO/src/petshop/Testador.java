package petshop;

public class Testador {

	public static void main(String[] args) {

		Cachorro c = new Cachorro("Ada", Raca.BYEBYE, 12);
		c.doenca = "Virose";
		c.diagnostico = "Morte em 30 dias";

		Dono d = new Dono("Juca", "endereco", c);

		System.out.println(d);

	}

}
