package estoque.Item;

import estoque.ListaEstatica;

public class ItemServico implements IItemServico {
	
	public String criarItem(Item item) {
		
		Item _item = selecionarItem(item.getNome());
		
		if (_item == null) {
			int codigo = ListaEstatica.getItens().size() +1;
			item.setCodigo(codigo);
			ListaEstatica.getItens().add(item);
			
			return item.getNome();
		}
		else {
			return null;
		}
	}
	
	public String editarItem(Item item) {
		
		for (int i = 0; i <= ListaEstatica.getItens().size(); i++) {
			
			if (ListaEstatica.getItens().get(i).getCodigo() == item.getCodigo()) {
				ListaEstatica.getItens().set(i, item);
				return item.getNome();
			}
		}
		
		return null;
	}
		
	public Item selecionarItem(String nome) {
		
		for (Item item : ListaEstatica.getItens()) {
			
			if (item.getNome().equals(nome)) {
				
				return item;
			}
		}
		
		return null;
	}
	
	public String deletarItem(int codigo) {
		
		for (int i = 0; i <= ListaEstatica.getItens().size(); i++) {
	
			if (ListaEstatica.getItens().get(i).getCodigo() == codigo) {
				String item = ListaEstatica.getItens().get(i).getNome();
				ListaEstatica.getItens().remove(i);
				return item;
			}
		}
		
		return null;
	}
	
}
	
		
			
		
	
	