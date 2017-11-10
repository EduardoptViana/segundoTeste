package composicao;

public class ItemDeOrcamento implements Item {

	private String descricao;

	private double preco;

	public ItemDeOrcamento(String descricao, double preco) {

		this.descricao = descricao;
		this.preco = preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return preco;
	}

}
