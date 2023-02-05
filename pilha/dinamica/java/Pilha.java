
public class Pilha {
	private Celula topo;
	private int tamanho;
	
	Pilha () {
		topo = null;
		tamanho = 0;
	}
	
	public void empilhar (int num) {
		Celula aux = new Celula (num);
		
		aux.prox = topo;
		topo = aux;
		aux = null;
		tamanho++;
	}
	
	public int desempilhar () {
		Celula aux = topo;
		int elemento = topo.elemento;
		
		topo = topo.prox;
		aux = aux.prox;
		
		aux = null;
		tamanho--;
		return elemento;
	}
	
	public void exibir () {
		Celula aux = topo;

		while (aux != null) {
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}

		System.out.println();
	}

	public void setElemento (int pos, int num) throws Exception {
		if (pos < 0 || pos >= tamanho) {
			throw new Exception("Erro: posicao invalida");
		} else {
			Celula aux = topo.prox;
			int cont = 0;

			while (cont < pos) {
				aux = aux.prox;
				cont ++;
			}

			aux.elemento = num;
			aux = null;
		}
	}

	public int getElemento (int pos) throws Exception {
		if (pos < 0 || pos >= tamanho) {
			throw new Exception("Erro: posicao invalida");
		} else {
			Celula aux = topo.prox;
			int cont = 0;

			while (cont < pos) {
				aux = aux.prox;
				cont++;
			}

			return aux.elemento;
		}
	}

	public int getTamanho () {
		return tamanho;
	}

	public boolean pilha_vazia () {
		if (topo == null) {
			return true;
		}
		return false;
	}
}
