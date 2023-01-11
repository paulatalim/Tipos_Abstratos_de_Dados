#include <iostream>

using namespace std;

typedef struct Celula {
    int elemento;
    Celula *prox;
};

class Lista {
private:
    Celula *prim;
    Celula *ult;
    int tamanho;

    int calculo_soma_recursiva (Celula *endereco_elemento) {
        if (endereco_elemento->prox != NULL) {
            return endereco_elemento->elemento + calculo_soma_recursiva (endereco_elemento->prox);
        }
        return 0;
    }

public:
    //construtor
    Lista () {
        prim = (Celula*)malloc(sizeof(Celula));
        prim->elemento = 0;
        prim->prox = NULL;
        ult = prim;
        tamanho=0;
    }
    //destrutor
    ~Lista () {
        Celula *aux = prim;

        while (prim != NULL) {
            aux = prim;
            prim = prim->prox;
            free(aux);
            tamanho--;
        }
    }

    void inserirInicio (int num) {
        Celula *aux = (Celula*)malloc(sizeof(Celula));
        aux->elemento = num;
        aux->prox = prim->prox;
        prim->prox = aux;
        aux = NULL;

        if (ult == prim) {
            ult = prim->prox;
        }
    }

    void inserirFim (int num) {
        ult->prox = (Celula*)malloc(sizeof(Celula));
        ult = ult->prox;
        ult->elemento = num;
        ult->prox = NULL;
        tamanho++;
    }

    void inserir (int num, int pos) {
        if (pos <= 0 || pos > tamanho+1) {
            cout << "Erro: posicao invalida";
            exit(0);
        
        } else if (pos == 1) {
            inserirInicio(num);
        
        } else if (pos == tamanho+1) {
            inserirFim(num);
        
        } else {
            Celula *aux = (Celula*)malloc(sizeof(Celula));
            aux->elemento = num;
            Celula *tmp = prim->prox;
            int cont = 0;

            while (cont < pos-1) {
                tmp = tmp->prox;
                cont++;
            }

            aux->prox = tmp->prox;
            tmp->prox = aux->prox;
            tamanho++;

            tmp = NULL;
            aux = NULL;
        }
    }

    int removerInicio () {
        Celula *aux = prim->prox;
        int retorno = aux->elemento;

        prim->prox = aux->prox;
        aux->prox = NULL;
        aux = NULL;
        tamanho--;
        return retorno;
    }

    int removerFim () {
        int retorno = ult->elemento;
        Celula *aux = prim->prox;

        while (aux->prox != ult) {
            aux = aux->prox;
        }

        ult = aux;
        aux->prox = NULL;
        aux = NULL;
        tamanho --;

        return retorno;
    }

    int remover (int pos) {
        if (pos < 0 || pos > tamanho) {
            cout << "Posicao invalida";
            return -1;

        } else if (pos == 1) {
            return removerInicio();

        } else if (pos == tamanho) {
            return removerFim();
        }

        Celula *aux = prim->prox;
        int cont = 0;

        while (cont < pos) {
            aux = aux->prox;
            cont ++;
        }

        int retorno = aux->prox->elemento;

        aux->prox = aux->prox->prox;
        tamanho --;

        aux = NULL;

        return retorno;
    }
    
    void mostrar () {
        if (prim == ult) {
            cout << "Lista vazia" << endl;
            exit(0);
        }

        Celula *aux = prim->prox;
        while (aux->prox != NULL) {
            cout << aux->elemento << " ";
            aux = aux->prox;
        }

    }

    int getTamanho () {
        return tamanho;
    }

    bool lista_vazia () {
        if (prim == ult) {
            return true;
        }
        return false;
    }

    int soma_interativa () {
        Celula *aux = prim->prox;
        int soma = 0;

        while (aux->prox != NULL) {
            soma += aux->elemento;
            aux = aux->prox;
        }

        aux = NULL;
        return soma;
    }

    int soma_recursiva () {
        return calculo_soma_recursiva(prim->prox);
    }

};
