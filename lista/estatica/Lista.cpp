#include <iostream>

using namespace std;

class Lista {
private:
    int n;
	int array[10];
	
public:
	//Construtor
	Lista () {
		n = 0;
	}
	
	//Metodo setting
	void setN (int n) {
		this->n = n;
	}

	void setArray (int pos, int num) {
		if (pos < n - 1) {
			this->array[pos] = num;
		}
	}
	
	//Metodo getting
	int getN () {
		return this->n;
	}

	int getArrayElemento (int pos) {
		return this->array[pos];
	}
	
	void inserirInicio (int num) {
		for (int i = n; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		this->n++;
		
		//Insercao do novo num
		this->array[0] = num;
	}
	
	void inserirFinal (int num) {
		array[n++] = num;
	}
	
	void inserir (int pos, int num) {
		for (int i = n; i > pos; i--) {
			array[i] = array[i-1];
		}
		
		//Atualizacao do limite do vetor
		n++;
		
		//Insercao do novo num
		array[pos] = num;
	}
	
	int removerInicio () {
		int num_removido = array[0];

		n--;

		for (int i = 0; i < n; i++) {
			array[i] = array [i+1];
		}
		
		return num_removido;
	}
	
	int removerFinal ()  {
		n--;
		return array[n];
	}

	int remover (int pos)  {
		int num_removido = array[pos];

		n--;

		for (int i = pos; i < n; i++) {
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
		if (n != 0) {
			for (int i = 0; i < n-1; i++) {
				cout << array[i] << ", ";
			}
			cout << array[n-1] << " ]" << endl;
		}
	}
};
