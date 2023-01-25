
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
	
	public void mostrar () {
		Celula aux = topo;

		while (aux != null) {
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}

		System.out.println();
	}

	public void tamanho () {
		System.out.println("Tamanho da pilha: " + tamanho);
	}

	public boolean pilhaVazia () {
		if (topo == null) {
			return true;
		}
		return false;
	}

	public int soma () {
		int soma = 0;

		while (pilhaVazia() == false) {
			soma += desempilhar();
		}

		return soma;
	}
}
