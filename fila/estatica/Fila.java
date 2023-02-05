public class Fila {
    private int tamanho;
    private int[] array;

    //Construtor
    public Fila (int tam) {
        tamanho = 0;
        array = new int[tam]; 
    }

	public void enfileirar (int num) throws Exception {
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

    public int denfileirar () throws Exception {
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

    public void setElemento (int pos, int num) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception ("Erro");
        }
		
		array[pos] = num;
	}
	
	public int getElemento (int pos) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception ("Erro");
        }

		return array[pos];		
	}

	public int getTamanho () {
		return tamanho;
	}

	public boolean fila_vazia () {
		if (tamanho == 0) {
			return true;
		}

		return false;
	}
}
