#include <iostream>

using namespace std;

class Lista {
private:
    int tamanho;
	int array[10];
	
public:
	//Construtor
	Lista () {
		tamanho = 0;
	}
	
	//Destrutor
	~Lista () {
		tamanho = 0;
	}

	//Metodo setting
	void setArray (int pos, int num) {
		if (pos < tamanho - 1 && pos >= 0) {
			this->array[pos] = num;
		}
	}
	
	void inserirInicio (int num) {
		for (int i = tamanho; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		tamanho++;
		
		//Insercao do novo num
		array[0] = num;
	}
	
	void inserirFim (int num) {
		array[tamanho++] = num;
	}
	
	void inserir (int pos, int num) {
		for (int i = tamanho; i > pos; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		tamanho++;
		
		//Insercao do novo num
		array[pos] = num;
	}
	
	int removerInicio () {
		int num_removido = array[0];

		tamanho--;

		for (int i = 0; i < tamanho; i++) {
			array[i] = array [i+1];
		}
		
		return num_removido;
	}
	
	int removerFim ()  {
		tamanho--;
		return array[tamanho];
	}

	int remover (int pos)  {
		int num_removido = array[pos];

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
	void exibir () {
		cout << "[ ";
		if (tamanho != 0) {
			for (int i = 0; i < tamanho-1; i++) {
				cout << array[i] << ", ";
			}
			cout << array[tamanho-1] << " ]" << endl;
		}
	}

	//Metodo getting
	int getTamanho () {
		return this->tamanho;
	}

	int getArrayElemento (int pos) {
		if(pos < 0 && pos >= tamanho) {
			exit(0);
		}
		return this->array[pos];
	}

	bool lista_vazia () {
		if (tamanho == 0) {
			return true;
		}

		return false;
	}
};
