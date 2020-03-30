
public class No {
	
	private String dado;
	private No prox;
	private String pos;
	
	public No(String dado, No prox) {
		super();
		this.dado = dado;
		this.prox = prox;
		this.pos = pos;
	}
	
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
}
