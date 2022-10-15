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
    n = n;
}

void setArray (int pos, int num) {
    array[pos] = num;
}

//Metodo getting
int getN () {
    return n;
}

int getArrayElemento (int pos) {
    return array[pos];		
}

void inserir (int num) {
    array[n] = num;
    n++;
}

int remover () {
    n--;
    return array[n];
}

/*
* Descricao: essa funcao exibe os numeros de um vetor de inteiros
* Parametro: um vetor de inteiros (vetor a ser exibido)
*/
void exibir () {
    printf ( "[ ");

    if (n != 0) {
        for (int i = 0; i < n-1; i++) {
            printf( "%d, ", array[i]);
        }
        printf ("%d", array[n-1]);
    }

    printf ( " ]\n");
}
