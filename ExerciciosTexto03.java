import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExerciciosTexto03 {
     
    
	public ExerciciosTexto03(){
    }

	public String e3_1() {
		Date dataAtual = new Date();
		return ""+dataAtual;
	}
	
	public String e3_2() {
		Date dataAtual = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("EEEE, dd/MMMM/yyyy");
		String dataFormatada = formatar.format(dataAtual);
		return dataFormatada;
	}
	
	public String[] e3_3(String dir) {
		File file = new File(dir);
		String[] retorno = file.list();
		return retorno;
	}
	
	public String[] e3_4(String dir) {
		File file = new File(dir);
		File[] vetFile = file.listFiles();
		String[] retorno = file.list();
		if(file.isDirectory() == false) {
			return null;
		}
		for (int i=0; i<vetFile.length; i++) {
			if(vetFile[i].isFile() == true) {
				retorno[i] = "[A] " + retorno[i];
			}else if(vetFile[i].isDirectory() == true) {
				retorno[i] = "d " + retorno[i];
			}
		}
		return retorno;
	}
	
	public String e3_5(String dir) {
		File file = new File(dir);
		file.delete();
		return "Deletado";
	}
	
	public void e3_6() {
		JFrame telaPrincipal = new JFrame("Tela principal");
		
		JMenuBar menuBar1 = new JMenuBar();
		telaPrincipal.setJMenuBar(menuBar1);
		
		JMenu arquivo = new JMenu("Arquivo");
		menuBar1.add(arquivo);
		JMenu editar = new JMenu("Editar");
		menuBar1.add(editar);
		
		JMenuItem extra1 = new JMenuItem("Extra");
		JMenuItem extra2 = new JMenuItem("Para");
		JMenuItem extra3 = new JMenuItem("Brincar");
		JMenuItem extra4 = new JMenuItem(":)");
		
		arquivo.add(extra1);
		arquivo.add(extra2);
		arquivo.add(extra3);
		arquivo.add(extra4);
		
		telaPrincipal.setSize(250, 250);
		telaPrincipal.setVisible(true);
	}
	
	public void e3_7(String dir) {
		try {
			Runtime.getRuntime().exec(dir);
		}catch(IOException erro) {
			erro.printStackTrace();
		}
		
	}
	
	public void e3_8(String dir) {
		String[] commandLine = {"notepad", dir};
		try {
			Runtime.getRuntime().exec(commandLine);
		}catch(IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public void e3_9() {
		JFrame tela = new JFrame();
		tela.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		tela.setVisible(true);
	}
	
	public String e3_10(String data1, String data2){
        if (data1.compareTo(data2) > 0) {
            return data1;
        }
        return data2;
    }
}
