#include <stdlib.h>
#include <stdio.h>

struct Pilha {
    int n;
    int array[10]
};

void Pilha (struct Pilha pilha) {
    pilha.n = 0;
}

//Metodos setting
    void setN (int n) {
        // if (n >= array.length) {
        //     throw new Exception ("Erro");
        // }
        
        this->n = n;
    }

    void setArray (int pos, int num) {
        // if (pos < 0 || pos >= n) {
        //     throw new Exception ("Erro");
        // }
		
		this->array[pos] = num;
	}
	
	//Metodo getting
	int getN () {
		return this->n;
	}

	int getArrayElemento (int pos) {
        // if (pos < 0 || pos >= n) {
        //     throw new Exception ("Erro");
        // }

		return this->array[pos];		
	}
    
    void inserir (int num) {
		// if (n >= array.length) {
		// 	throw new Exception ("Erro");
		// }
		
        this->array[this->n] = num;
        this->n++;
    }

    int remover () {
		// if (this.n == 0) {
		// 	throw new Exception ("Erro");
		// }

        n--;
        return array[n];
    }

    /*
    * Descricao: essa funcao exibe os numeros de um vetor de inteiros
    * Parametro: um vetor de inteiros (vetor a ser exibido)
    */
	void exibir () {
		cout << "[ ";

		if (n != 0) {
			for (int i = 0; i < n-1; i++) {
				cout << array[i] << ", ";
			}
			cout << array[n-1];
		}

		cout << " ]" << endl;
	}
