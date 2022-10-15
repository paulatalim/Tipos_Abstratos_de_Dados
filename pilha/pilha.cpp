#include <iostream>

using namespace std;

class Pilha {
private:
    int n;
    int array[10];

public:
    //Construtor
    void Pilha () {
        this.n = 0;
    }

    //Metodos setting
     void setN (int n) throws Exception {
        if (n >= array.length) {
            throw new Exception ("Erro");
        }
        
        this.n = n;
    }

   void setArray (int pos, int num) throws Exception {
        if (pos < 0 || pos >= n) {
            throw new Exception ("Erro");
        }
		
		this.array[pos] = num;
	}
	
	//Metodo getting
	int getN () {
		return this.n;
	}

	int getArrayElemento (int pos) throws Exception {
        if (pos < 0 || pos >= n) {
            throw new Exception ("Erro");
        }

		return this.array[pos];		
	}
    
    void inserir (int num) throws Exception {
		if (n >= array.length) {
			throw new Exception ("Erro");
		}
		
        this.array[this.n] = num;
        this.n++;
    }

    int remover () throws Exception {
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
	void exibir () {
		printf("[ ");
		if (n != 0) {
			for (int i = 0; i < this.n-1; i++) {
				printf(this.array[i] + ", ");
			}
			printf(this.array[this.n-1]);
		}
		printf(" ]\n");
	}
}
