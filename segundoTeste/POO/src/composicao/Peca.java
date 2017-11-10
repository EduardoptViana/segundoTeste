package composicao;

public class Peca {

	private int quantidade;
	private Item itemDeOrcamento;

	public Peca(int quantidade, Item itemDeOrcamento) {
		this.quantidade = quantidade;
		this.itemDeOrcamento = itemDeOrcamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {

		return itemDeOrcamento.getDescricao();
	}

	public double getPreco() {
		return itemDeOrcamento.getPreco() * quantidade;
	}
}
