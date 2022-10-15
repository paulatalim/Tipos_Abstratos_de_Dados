#include <iostream>


public class Pilha {
    private int n;
    private int[] array;

    //Construtor
    public Pilha (int tam) {
        this.n = 0;
        this.array = new int[tam];
    }

    //Metodos setting
    public void setN (int n) throws Exception {
        if (n >= array.length) {
            throw new Exception ("Erro");
        }
        
        this.n = n;
    }

    public void setArray (int pos, int num) throws Exception {
        if (pos < 0 || pos >= n) {
            throw new Exception ("Erro");
        }
		
		this.array[pos] = num;
	}
	
	//Metodo getting
	public int getN () {
		return this.n;
	}

	public int getArrayElemento (int pos) throws Exception {
        if (pos < 0 || pos >= n) {
            throw new Exception ("Erro");
        }

		return this.array[pos];		
	}
    
    public void inserir (int num) throws Exception {
		if (n >= array.length) {
			throw new Exception ("Erro");
		}
		
        this.array[this.n] = num;
        this.n++;
    }

    public int remover () throws Exception {
		if (this.n == 0) {
			throw new Exception ("Erro");
		}

        this.n--;
        return this.array[n];
    }

    /*
    * Descricao: essa funcao exibe os numeros de um vetor de inteiros
    * Parametro: um vetor de inteiros (vetor a ser exibido)
    */
	public void exibir () {
		System.out.print("[ ");
		if (n != 0) {
			for (int i = 0; i < this.n-1; i++) {
				System.out.print(this.array[i] + ", ");
			}
			System.out.print(this.array[this.n-1]);
		}
		System.out.println(" ]");
	}
}
