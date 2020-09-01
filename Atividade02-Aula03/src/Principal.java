public class Principal {
	Produto p1;
	Fornecedor f1;
	
	public void entraDados() {
		p1 = new Produto();
		p1.setNome("Arroz");
		p1.setPreco(15.49);
		p1.setEstoque(14);
		
		f1 = new Fornecedor();
		f1.setCidade("Taquaritinga");
		f1.setNome("Arroz Brasil");
	}
	
	public void mostraDados() {
		System.out.println("-------Produtos------");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Preço: " + p1.getPreco());
		System.out.println("Estoque: " + p1.getEstoque());
		
		System.out.println("-----Fornecedores-----");
		System.out.println("Cidade: " + f1.getCidade());
		System.out.println("Nome: " + f1.getNome());
	}
	
	public static void main (String args[]) {
        Principal programa = new Principal();

        programa.entraDados();

        programa.mostraDados();

	}
}
