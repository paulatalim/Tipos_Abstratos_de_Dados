
public class Lista {
	private CelulaDupla prim;
	private CelulaDupla ult;
	private int tamanho;
	
	//Construtor
	Lista () {
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

	public void inserir (int num, int pos) throws Exception {
		if (pos < 0 || pos >= getTamanho()) {
			throw new Exception("Erro, posicao incorreta");
		} else if (pos == 0) {
			inserirInicio(num);
		} else if (pos == getTamanho()-1) {
			inserirFim(num);
		} else {
			CelulaDupla novo = new CelulaDupla(num);
			CelulaDupla aux = prim.prox;

			int index = 0;

			while (index != pos) {
				aux = aux.prox;
				index++;
			}

			novo.prox = aux;
			novo.ant = aux.ant;
			aux.ant.prox = novo;
			aux.ant = novo;
			tamanho++;
		}
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

	public int remover (int pos) throws Exception {
		if (pos < 0 || pos >= getTamanho()) {
			throw new Exception("Erro, posicao incorreta");
		} else if (pos == 0) {
			return removerInicio();
		} else if (pos == getTamanho()-1) {
			return removerFim();
		}
		
		CelulaDupla aux = prim.prox;
		int index = 0;

		while (index != pos) {
			aux = aux.prox;
			index++;
		}

		int elemento = aux.elemento;

		aux.ant.prox = aux.prox;
		aux.prox.ant = aux.ant;
		aux.prox = null;
		aux.ant = null;
		
		tamanho --;

		return elemento;
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

	//Retorna o tamanho da lista
	public int getTamanho () {
		return tamanho;
	}

	//Verifica se a lista esta vazia
	public boolean lista_vazia () {
		if (prim == ult) {
			return true;
		}
		return false;
	}
}
