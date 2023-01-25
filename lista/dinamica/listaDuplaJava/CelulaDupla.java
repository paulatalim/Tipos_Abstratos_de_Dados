
public class CelulaDupla {
	public int elemento;
	public CelulaDupla ant;
	public CelulaDupla prox;
	
	CelulaDupla () {
		//Sentinela
		this(-1);
	}
	
	CelulaDupla (int num) {
		elemento = num;
		ant = null;
		prox = null;
	}
}
