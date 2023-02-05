#include <iostream>

using namespace std;

class Pilha {
private:
    int tamanho;
    int array[10];

public:

    //Construtor
    Pilha () {
        tamanho = 0;
    }

    ~Pilha () {
        tamanho = 0;
    }

void empilhar (int num) {
		// if (n >= array.length) {
		// 	throw new Exception ("Erro");
		// }
		
        array[tamanho] = num;
        tamanho++;
    }

    int desempilhar () {
		// if (this.n == 0) {
		// 	throw new Exception ("Erro");
		// }

        tamanho--;
        return array[tamanho];
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

    void setElemento (int pos, int num) {
        // if (pos < 0 || pos >= n) {
        //     throw new Exception ("Erro");
        // }
		
		array[pos] = num;
	}
	
    int getElemento (int pos) {
        if (pos < 0 || pos >= tamanho) {
            exit(0);
        }

		return array[pos];		
	}

	int getTamanho () {
		return tamanho;
	}

    bool pilha_vazia () {
        if (tamanho == 0) {
            return true;
        }

        return false;
    }
};
