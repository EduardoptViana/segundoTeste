package composicao;

public class Tester {

	public static void main(String[] args) {

		ItemDeOrcamento itemPeca = new ItemDeOrcamento("Vela", 2);

		Peca peca1 = new Peca(4, itemPeca);

		System.out.println(peca1.getPreco());
		System.out.println(peca1.getDescricao());

	}

}
