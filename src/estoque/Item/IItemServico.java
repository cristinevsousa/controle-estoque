package estoque.Item;

public abstract interface IItemServico {
	
	String criarItem(Item item);
	String editarItem(Item item); 		
	Item selecionarItem(String nome);	
	String deletarItem(int codigo);
}
