
public class ListaLSE {
	
	private No inicio;
	private int tamanho;
	
	public ListaLSE() {
		inicio = null;
		tamanho = 0;
	}
	
	public String getPrimeiro() {
		return inicio.getDado();
	}
	
	public String getSegundo() {
		return inicio.getProx().getDado();
	}
	
	public void imprimirLSE() {
		No aux = inicio;
		while (aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProx();
		}
	}
	
	//    (aux)
	//     1 -> 2 -> 3 -> 4 -> 5 -> null
	//    (incio)     
	public void getPos(){
		No aux = inicio;
		System.out.println(aux.getPos());

	}

	public void inserirPrimeiro(String valor) {
		No novoNo = new No(valor, inicio);
		//novoNo.setDado(valor);
		//novoNo.setProx(inicio);
		tamanho++;
		inicio = novoNo;	
	}

	public void inserirSegundo(String valor) {
		No novoNo = new No(valor, inicio.getProx());

		tamanho++;
		//inicio = novoNo;	
		inicio.setProx(novoNo);
		
	}
//	public void inserirMeio(){
//		int aux = getTamanho();
//		No meio =
//	}
	
	public void inserirPenultimo(String valor) {
		//Criando um novo nó para ser inserido na última posição da lista
		No novoNo = new No(valor, null);

		// Encontrando o último elemento
		No aux = inicio;
		
		//              (aux) 
		// PSL -> PT -> PMDB -> XXX -> PDT -> null
		// inicio
		while (aux.getProx().getProx() != null) {
			aux = aux.getProx();
		}
		// aux --> penultimo
		novoNo.setProx(aux.getProx()); // apontando para ultimo
		
		tamanho++;
		// Fazendo a ligação do último elemento com o novo Nó
		aux.setProx(novoNo);	 	
	}
	
	//remover segundo elemento
	
	public void removerSegundo() {
		 inicio.setProx(inicio.getProx().getProx()); 
		 tamanho--;
	}

	public void removerTerceiro() {
		No segundo = inicio.getProx(); 
		segundo.setProx(segundo.getProx().getProx()); 
		 tamanho--;
	}


	public int getTamanho() {
		return tamanho;
	}
}
