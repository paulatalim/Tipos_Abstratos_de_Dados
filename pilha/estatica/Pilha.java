public class Pilha {
    private int tamanho;
    private int[] array;

    //Construtor
    public Pilha (int tam) {
        tamanho = 0;
        array = new int[tam];
    }

    public void setElemento (int pos, int num) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception ("Erro");
        }
		
		array[pos] = num;
	}
	
	//Metodo getting
	public int getTamanho () {
		return tamanho;
	}

	public int getElemento (int pos) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception ("Erro");
        }

		return array[pos];		
	}
    
    public void empilhar (int num) throws Exception {
		if (tamanho >= array.length) {
			throw new Exception ("Erro");
		}
		
        array[tamanho] = num;
        tamanho++;
    }

    public int desempilhar () throws Exception {
		if (tamanho == 0) {
			throw new Exception ("Erro");
		}

        tamanho--;
        return array[tamanho];
    }

    /*
    * Descricao: essa funcao exibe os numeros de um vetor de inteiros
    * Parametro: um vetor de inteiros (vetor a ser exibido)
    */
	public void exibir () {
		System.out.print("[ ");
		if (tamanho != 0) {
			for (int i = 0; i < tamanho-1; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.print(array[tamanho-1]);
		}
		System.out.println(" ]");
	}
}
