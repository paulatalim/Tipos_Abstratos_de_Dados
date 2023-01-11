
public class Lista {
	private int n;
	private int[] array;
	
	//Construtor
	public Lista (int tam) {
		this.n = 0;
		array = new int[tam];
	}
	
	//Metodo setting
	public void setN (int n) {
		this.n = n;
	}

	public void setArray (int pos, int num) {
		if (pos < n - 1) {
			this.array[pos] = num;
		}
	}
	
	//Metodo getting
	public int getN () {
		return this.n;
	}

	public int getArrayElemento (int pos) throws Exception {
		if (pos >= n) {
			throw new Exception("Erro");
		}
		
		return this.array[pos];
	}
	
	public void inserirInicio (int num) throws Exception {
		if (n >= array.length) {
			throw new Exception ("Erro");
		}

		for (int i = this.n; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		this.n++;
		
		//Insercao do novo num
		this.array[0] = num;
	}
	
	public void inserirFinal (int num) throws Exception {
		if (n >= array.length) {
			throw new Exception ("Erro");
		}

		this.array[this.n++] = num;
	}
	
	public void inserir (int pos, int num) throws Exception {
		if (n >= array.length || pos < 0 || pos > this.n) {
			throw new Exception ("Erro");
		}

		for (int i = this.n; i > pos; i--) {
			this.array[i] = this.array[i-1];
		}
		
		//Atualizacao do limite do vetor
		this.n++;
		
		//Insercao do novo num
		this.array[pos] = num;
	}
	
	public int removerInicio () throws Exception {
		int num_removido = this.array[0];

		if (n == 0) {
			throw new Exception ("Erro");
		}

		this.n--;

		for (int i = 0; i < this.n; i++) {
			this.array[i] = this.array [i+1];
		}
		
		return num_removido;
	}
	
	public int removerFinal () throws Exception {
		if (this.n == 0) {
			throw new Exception ("Erro");
		}

		this.n--;
		return this.array[this.n];
	}

	public int remover (int pos) throws Exception {
		int num_removido = this.array[pos];

		if (this.n == 0 || pos < 0 || pos > this.n) {
			throw new Exception ("Erro");
		}
		
		this.n--;

		for (int i = pos; i < this.n; i++) {
			this.array[i] = this.array [i+1];
		}

		return num_removido;
	}

	/*
     * Descricao: essa funcao exibe os numeros de um vetor de inteiros
     * Parametro: um vetor de inteiros (vetor a ser exibido)
     */
	public void exibir () throws Exception {
		System.out.print ("[ ");
		if (this.n != 0) {
			for (int i = 0; i < this.n-1; i++) {
				System.out.print (this.array[i] + ", ");
			}
			System.out.println (this.array[this.n-1] + " ]");
		}
	}
}
