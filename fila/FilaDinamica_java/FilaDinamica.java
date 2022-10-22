package FilaDinamica_java;

public class FilaDinamica {    
    private Celula prim;
    private Celula ult;
    private int tamanho;
    
    //construtor
    public FilaDinamica () {
        prim = new Celula();
        prim.elemento=0;
        ult=prim;
        tamanho=0;
    }

    //destrutor
    // public ~FilaDinamica () {
    //     Celula aux;
    //     while (prim != null) {
    //         aux = prim;
    //         prim = prim.prox;
    //         aux = null;
    //     }
    // }

    public void inserir (int x) {
        ult.prox = new Celula();
        ult = ult.prox;
        ult.elemento = x;
        ult.prox = null;
        tamanho++;
    }

    public int remover () throws Exception{
        if (prim.prox == null) {
            throw new Exception("Erro");
        }
        Celula aux = prim;
        int retornar = aux.elemento;
        prim = prim.prox;
        aux.prox = null;
        aux = null;
        tamanho--;
        return retornar;
    }

    public void mostrarFila () {
        Celula aux;
        aux = prim;
        while (aux != null) {
            System.out.printf("%d", aux.elemento);
            aux = aux.prox;
        }
        aux = null;
    }

    int getTamanho () {
        return tamanho;
    }
    /*
    bool vazia
    s*/
}
