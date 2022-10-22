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
        Celula *aux;
        while (prim != NULL) {
            aux = prim;
            printf("%d", aux->elemento);
            aux = aux->prox;
        }
        aux = NULL;
    }
    /*
    int mostrarTamanho
    bool vazia
*/

};