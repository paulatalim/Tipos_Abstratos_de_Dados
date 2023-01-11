public class FilaDinamica {    
    private Celula prim;
    private Celula ult;
    private int tamanho;
    
    //construtor
    FilaDinamica () {
        prim = new Celula();
        prim.elemento = 0;
        prim.prox = null;
        ult = prim;
        tamanho = 0;
    }

    //destrutor
    // ~FilaDinamica () {
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

    public int remover () throws Exception {
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
    }

    public void setElemento (int pos, int num) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception("Erro");
        }

        Celula aux = prim;
        int index = 0;

        while (index != pos) {
            aux = aux.prox;
            index++;
        }

        aux.elemento = num;
        aux = null;
    }

    public int getElemento (int pos) throws Exception {
        if (pos < 0 || pos >= tamanho) {
            throw new Exception("Erro");
        }

        Celula aux = prim;
        int index = 0;

        while (index != pos) {
            aux = aux.prox;
            index ++;
        }

        return aux.elemento;
    }

    public int getTamanho () {
        return tamanho;
    }

    public boolean vazia () {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }
}
