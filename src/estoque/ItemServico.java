package estoque;


public class ItemServico {
	
	//private Visualizar visualizar = new Visualizar();
	
	public String criarItem(Item item) {
		
		int codigo = ListaEstatica.itens.size() +1;
		item.setCodigo(codigo);
		ListaEstatica.itens.add(item);
		return item.getNome();
	}
	
	public String editarItem(Item item) {
		
		for (int i = 0; i <= ListaEstatica.itens.size(); i++) {
			
			if (ListaEstatica.itens.get(i).getCodigo() == item.getCodigo()) {
				ListaEstatica.itens.set(i, item);
				return item.getNome();
			}
		}
		
		return null;
	}
		
	public Item selecionarItem(String nome) {
		
		for (Item item : ListaEstatica.itens) {
			
			if (item.getNome().equals(nome)) {
				
				return item;
			}
		}
		
		return null;
	}
	
	public String deletarItem(int codigo) {
		
		for (int i = 0; i <= ListaEstatica.itens.size(); i++) {
	
			if (ListaEstatica.itens.get(i).getCodigo() == codigo) {
				String item = ListaEstatica.itens.get(i).getNome();
				ListaEstatica.itens.remove(i);
				return item;
			}
		}
		
		return null;
	}
	
	
	//desenvolver	
	public void estoqueAtual(){
		
	}
	
	public void ordemCompra() {
		
	} 
	
		//reutilizar gerador de codigo para outros metodos e realocar em outra classe
		/*public int gerarCodigo() {
			
		}
	
	//codigo anterior	
	//public String nome;
	//public int qtd;
	//public float valorUnidade;
	//public String desc;
	
	/*public void Adicionar() {
		
		System.out.println("============================================");
		System.out.println(" ADICIONAR UM NOVO ITEM AO ESTOQUE");
		System.out.println("============================================");
		
		System.out.print("Informe o nome do produto: ");
		nome = input.nextLine();
		System.out.print("Informe a quantidade do produto no estoque: ");
		qtd = input.nextInt();
		System.out.print("Informe o valor do produto: ");
		valorUnidade = input.nextFloat();
		input.nextLine();
		System.out.print("Informe a descrição do produto: ");
		desc = input.nextLine();
		System.out.println("============================================");
		
	}
	
	public void Visualizar() {
		
		
		System.out.println("-----");
		System.out.println("Produto: "+nome);
		System.out.println("Descrição: "+desc);
		System.out.println("Quantidade em estoque: "+qtd);
		System.out.println("Valor por Unidade: R$"+valorUnidade);
		System.out.println("-----");
		
	}
	
	public void Remover(ArrayList<Item> Matriz, int remover) {
		int qtdRemove;
		String escolha;
		while(true) {
			System.out.print("Quantidade a remover: ");
			qtdRemove = input.nextInt();
			
			qtd = qtd-qtdRemove;
			
			if(qtdRemove <= 0) {
				
				System.out.println("-----");
				System.out.print("Deseja cancelar o procedimento? (S/N): ");
				escolha = input.next();
				if(escolha.equals("S") || escolha.equals("s")) {
					
					qtd = qtd+qtdRemove;
					break;
				}
				else if(escolha.equals("N") || escolha.equals("n")) {
					
				}
				else {
					
					System.out.println("Comando inválido, operação cancelada.");
					
				}
			}
			
			else if(qtd <= 0) {
				
				System.out.println("-----");
				System.out.print("Deseja remover completamente o item do estoque? (S/N): ");
				escolha = input.next();
				if(escolha.equals("S") || escolha.equals("s")) {
					remover = remover-1;
					Matriz.remove(remover);
					System.out.println("Operação concluida com sucesso!");
					break;
				}
				else if(escolha.equals("N") || escolha.equals("n")) {
					
					qtd = qtd+qtdRemove;
					System.out.println("Operação cancelada.");
					break;
				}
				else {
					qtd = qtd+qtdRemove;
					System.out.println("Comando inválido, tente novamente.");
				}
			}
			
			else {
				
				System.out.println("-----");
				System.out.print("Deseja remover "+qtdRemove+" item(s) do estoque? (S/N): ");
				escolha = input.next();
				if(escolha.equals("S") || escolha.equals("s")) {
					System.out.println("Operação concluida com sucesso!");
					break;
				}
				else if(escolha.equals("N") || escolha.equals("n")) {
					
					System.out.println("Operação cancelada.");
					break;
				}
				else {
					
					System.out.println("Comando inválido, operação cancelada.");
					
				}
			}
		}
		
	}*/
}
