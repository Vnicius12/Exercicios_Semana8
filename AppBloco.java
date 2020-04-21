import javax.swing.JOptionPane;

public class AppBloco {

	public static void main(String[] args) {
		BlocoDeNotas valor = new BlocoDeNotas();
		
		int menu;
		String nota = null;
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("1 inserir nota\n2 remover nota \n3 buscar nota" + 
																"\n4 sair \n5 listar notas"));
			
			if (menu == 1) {
				nota = JOptionPane.showInputDialog("Nota: ");
				
				valor.inserirNota(nota);
			}
			else if(menu == 2) {
				nota = JOptionPane.showInputDialog("Nota para remover: ");
				
				if(valor.removeNotas(nota)) {
					JOptionPane.showMessageDialog(null, "Nota removida");
				}
				else {
					JOptionPane.showMessageDialog(null, "Nota não encontrada");
				}
			}
			else if (menu == 3) {
				nota = JOptionPane.showInputDialog("Nota para procurar");
				
				int posicao = valor.procurarNota(nota);
				if(posicao >= 0) {
					JOptionPane.showMessageDialog(null, "Nota encontrada em " + posicao);
				}
				else {
					JOptionPane.showMessageDialog(null, "Nota não encontada");
				}
			}
			else if (menu == 4) {
			}
			else if (menu == 5) {
				valor.listarNotas();
			}
			else {
				JOptionPane.showMessageDialog(null, "Opcao invalida");
			}	
		}
		while (menu != 4);
	}

}
