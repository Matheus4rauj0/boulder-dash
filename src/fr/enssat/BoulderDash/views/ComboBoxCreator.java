package fr.enssat.BoulderDash.views;

import javax.swing.*;
import java.io.File;

public class ComboBoxCreator {
    
    /**
     * Cria um JComboBox com os nomes das pastas de um diretório.
     *
     * @param caminhoDiretorio O caminho do diretório a ser listado.
     * @return JComboBox<String> contendo os nomes das pastas.
     * 
     */

     
    public static JComboBox<String> criarComboBoxDePastas() {
        File diretorio = new File("C:\\Users\\Usuario\\Documents\\boulder-dash-Alteraçoes\\boulder-dash\\res\\drawable\\field");

        // Verifica se o diretório é válido
        String[] pastas;
        if (diretorio.exists() && diretorio.isDirectory()) {
            pastas = diretorio.list((current, name) -> new File(current, name).isDirectory());
        } else {
            pastas = new String[]{"Nenhuma pasta encontrada"};
        }

        // Retorna o JComboBox com as opções
        
        return new JComboBox<>(pastas);
    }
    
}



