#include <iostream>

using namespace std;

struct Celula {
    int elemento;
    Celula *prox;
};

class Fila {
private:
    Celula *prim;
    Celula *ult;
    int tamanho;

public:
    //construtor
    Fila () {
        prim = new Celula;
        prim->elemento=0;
        prim->prox=NULL;
        ult=prim;
        tamanho=0;
    }
    //destrutor
    ~Fila () {
        Celula *aux;
        while (prim != NULL) {
            aux = prim;
            prim = prim->prox;
            delete(aux);
        }
        tamanho = 0;
    }

    void enfileirar (int x) {
        ult->prox = new Celula;
        ult = ult->prox;
        ult->elemento = x;
        ult->prox = NULL;
        tamanho++;
    }

    int desenfileirar () {
        Celula *aux = prim->prox;
        int retornar = aux->elemento;
        prim->prox = prim->prox->prox;
        delete(aux);
        if (prim->prox == NULL) {
            ult = prim;
        }
        tamanho--;
        return retornar;
    }

    void mostrarFila () {
        Celula *aux = prim;
        while (aux != NULL) {
            printf("%d", aux->elemento);
            aux = aux->prox;
        }
        aux = NULL;
    }

    void setElemento (int pos, int num) {
        if (pos < 0 || pos >= tamanho) {
            exit(0);
        }

        Celula *aux = prim;
        int index = 0;

        while (index!= pos) {
            aux = aux->prox;
            index++;
        }

        aux->elemento = num;
    }

    int getElemento (int pos) {
        if (pos < 0 || pos >= tamanho) {
            exit(0);
        }

        Celula *aux = prim;
        int index = 0;

        while (index!= pos) {
            aux = aux->prox;
            index++;
        }
        
        return aux->elemento;
    }

    int getTamanho () {
        return tamanho;
    }

    bool fila_vazia () {
        if (prim == ult) {
            return true;
        }
        return false;
    }
};