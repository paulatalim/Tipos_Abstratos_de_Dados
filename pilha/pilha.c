#include <stdlib.h>
#include <stdio.h>

struct Pilha {
    int n;
    int array[10];
};

void inserir (struct Pilha pilha, int num) {
    pilha.array[pilha.n] = num;
    pilha.n++;
}

int remover (struct Pilha pilha) {
    pilha.n--;
    return pilha.array[pilha.n];
}

/*
* Descricao: essa funcao exibe os numeros de um vetor de inteiros
* Parametro: um vetor de inteiros (vetor a ser exibido)
*/
void exibir (struct Pilha pilha) {
    printf ( "[ ");

    if (pilha.n != 0) {
        for (int i = 0; i < pilha.n-1; i++) {
            printf( "%d, ", pilha.array[i]);
        }
        printf ("%d", pilha.array[pilha.n-1]);
    }

    printf ( " ]\n");
}
