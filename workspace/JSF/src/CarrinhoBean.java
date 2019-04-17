import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	private List<String> listaSelect;
	private int qtd;
	private String formaPagamento;
	
	public List<Produto> getProdutos(){
		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto(1, "Ferrari", 500.000));
		lista.add(new Produto(2, "Porshe", 200.000));
		lista.add(new Produto(3, "Bugatti", 900.000));
		return lista;
	}
	
	public void view() {
		String produto = "";
		for(String st : listaSelect) {
			produto = st + " " +produto;
		}
		System.out.println("Produtos: " + produto + "\n" + "Quantidade: "+ qtd +"\n"+"Forma pagamento: "+formaPagamento);
	}
	
	public CarrinhoBean() {
		super();
	}
	public CarrinhoBean(List<String> listaSelect, int qtd, String formaPagamento) {
		super();
		this.listaSelect = listaSelect;
		this.qtd = qtd;
		this.formaPagamento = formaPagamento;
	}
	public List<String> getListaSelect() {
		return listaSelect;
	}
	public void setListaSelect(List<String> listaSelect) {
		this.listaSelect = listaSelect;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
