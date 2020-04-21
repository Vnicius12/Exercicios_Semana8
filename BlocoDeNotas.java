
import java.util.ArrayList;

public class BlocoDeNotas {
	private ArrayList <String> notas;
	
	
	public BlocoDeNotas() {
		notas = new ArrayList<String>();
	}
	
	public void inserirNota(String nota) {
		notas.add(nota);
	}
	
	public boolean removeNotas(String nota) {
		int posicao = buscar(nota);
		
		if(posicao >= 0) {
			notas.remove(posicao);
			return true;
		}else {
			return false;
		}
	}
	
	public int procurarNota(String nota) {
		return buscar(nota);
	}
	
	private int buscar (String nota) {
		for (int i = 0; i < notas.size(); i++){
			String Nota = notas.get(i);
			String valorNota = notas.get(i);
			if(notas.equals(valorNota)) {
				return i;
			}
		}
		return -1;
	}

	public void listarNotas() {
		for(String nota:notas) {
			System.out.println(nota);
		}
	}
}
