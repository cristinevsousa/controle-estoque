package estoque;


import java.util.ArrayList;
import java.util.List;

import estoque.Item.Item;
import estoque.Usuario.Usuario;

public class ListaEstatica {
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	private static List<Item> itens = new ArrayList<Item>();
	
	public static List<Usuario> getUsuarios() {
		return usuarios;
	}
	public static void setUsuarios(List<Usuario> usuarios) {
		ListaEstatica.usuarios = usuarios;
	}
	public static List<Item> getItens() {
		return itens;
	}
	public static void setItens(List<Item> itens) {
		ListaEstatica.itens = itens;
	}
	
}
