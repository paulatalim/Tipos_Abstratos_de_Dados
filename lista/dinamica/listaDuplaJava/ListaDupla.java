
public class ListaDupla {
	private CelulaDupla prim;
	private CelulaDupla ult;
	private int tamanho;
	
	//Construtor
	ListaDupla () {
		prim = new CelulaDupla ();
		ult = prim;
		tamanho = 0;
	}
	
	//Insere um elemento no inicio da lista
	public void inserirInicio (int num) {
		CelulaDupla aux = new CelulaDupla(num);
		aux.prox = prim.prox;
		prim.prox = aux;
		aux.ant = prim;
		
		if (prim == ult) {
			ult = aux;
		} else {
			aux.prox.ant = aux;
		}
		
		aux = null;
		tamanho++;
	}

	//Insere um elemento no fim da lista
	public void inserirFim (int num) {
		CelulaDupla aux = new CelulaDupla(num);
		ult.prox = aux;
		aux.prox = null;
		aux.ant = ult;
		ult = aux;
		aux = null;
		tamanho++;
	}

	//Remove um elemento do inicio da lista
	public int removerInicio () {
		CelulaDupla aux = prim.prox;
		int elemento = aux.elemento;
		
		prim.prox = aux.prox;
		aux.prox = null;
		
		if (aux == ult) {
			ult = prim;
		} else {
			prim.prox.ant = aux.ant;
		}
		
		aux.ant = null;
		tamanho--;
		
		return elemento;
	}
	
	//Remove um elemento do final da lista
	public int removerFim () {
		int retorno = ult.elemento;		

		ult = ult.ant;
		ult.prox.ant = null;
		ult.prox = null;
		tamanho--;

		return retorno;
	}

	//Exibe os elementos do primeiro ao ultimo
	public void mostrar_prim_ult () {
		CelulaDupla aux = prim.prox;

		while (aux != null) {
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}

		System.out.println();
	}

	//Exibe os elementos do ultimo ao primeiro
	public void mostrar_ult_prim () {
		CelulaDupla aux = ult;

		while (aux != prim) {
			System.out.print(aux.elemento + " ");
			aux = aux.ant;
		}

		System.out.println();
	}

	//Exibe o tamanho da lista
	public void tamanho () {
		System.out.println("Tamanho da lista: " + tamanho);
	}

	//Verifica se a lista esta vazia
	public boolean listaDVazia () {
		if (prim == ult) {
			return true;
		}
		return false;
	}
}
