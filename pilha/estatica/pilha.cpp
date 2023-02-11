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
		if (tamanho >= 10) {
			exit(0);
		}
		
        array[tamanho] = num;
        tamanho++;
    }

    int desempilhar () {
		if (tamanho == 0) {
			exit(0);
		}

        tamanho--;
        return array[tamanho];
    }

    /*
    * Descricao: essa funcao exibe os numeros de um vetor de inteiros
    * Parametro: um vetor de inteiros (vetor a ser exibido)
    */
	void exibir () {
		cout << "[ ";

		if (tamanho != 0) {
			for (int i = 0; i < tamanho-1; i++) {
				cout << array[i] << ", ";
			}
			cout << array[tamanho-1];
		}

		cout << " ]" << endl;
	}

    void setElemento (int pos, int num) {
        if (pos < 0 || pos >= tamanho) {
            exit(0);
        }
		
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
