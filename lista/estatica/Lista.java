public class Lista {
	private int tamanho;
	private int[] array;
	
	//Construtor
	public Lista (int tam) {
		tamanho = 0;
		array = new int[tam];
	}
	
	//Metodo setting
	public void setArray (int pos, int num) {
		if (pos < tamanho && pos >= 0) {
			array[pos] = num;
		}
	}
	
	//Metodo getting
	public int getTamanho () {
		return tamanho;
	}

	public int getElemento (int pos) throws Exception {
		if (pos >= tamanho) {
			throw new Exception("Erro");
		}
		
		return array[pos];
	}
	
	public void inserirInicio (int num) throws Exception {
		if (tamanho >= array.length) {
			throw new Exception ("Erro");
		}

		for (int i = tamanho; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		tamanho++;
		
		//Insercao do novo num
		array[0] = num;
	}
	
	public void inserirFinal (int num) throws Exception {
		if (tamanho >= array.length) {
			throw new Exception ("Erro");
		}

		array[tamanho++] = num;
	}
	
	public void inserir (int pos, int num) throws Exception {
		if (tamanho >= array.length || pos < 0 || pos > tamanho) {
			throw new Exception ("Erro");
		}

		for (int i = tamanho; i > pos; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		tamanho++;
		
		//Insercao do novo num
		array[pos] = num;
	}
	
	public int removerInicio () throws Exception {
		int num_removido = array[0];

		if (tamanho == 0) {
			throw new Exception ("Erro");
		}

		tamanho--;

		for (int i = 0; i < tamanho; i++) {
			array[i] = array [i+1];
		}
		
		return num_removido;
	}
	
	public int removerFinal () throws Exception {
		if (tamanho == 0) {
			throw new Exception ("Erro");
		}

		tamanho--;
		return array[tamanho];
	}

	public int remover (int pos) throws Exception {
		int num_removido = array[pos];

		if (tamanho == 0 || pos < 0 || pos > tamanho) {
			throw new Exception ("Erro");
		}
		
		tamanho--;

		for (int i = pos; i < tamanho; i++) {
			array[i] = array [i+1];
		}

		return num_removido;
	}

	/*
     * Descricao: essa funcao exibe os numeros de um vetor de inteiros
     * Parametro: um vetor de inteiros (vetor a ser exibido)
     */
	public void exibir () throws Exception {
		System.out.print ("[ ");
		if (tamanho != 0) {
			for (int i = 0; i < tamanho-1; i++) {
				System.out.print (array[i] + ", ");
			}
			System.out.println (array[tamanho-1] + " ]");
		}
	}
}
