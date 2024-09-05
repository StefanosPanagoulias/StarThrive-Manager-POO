

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Classe main
 */
public class Main {
    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    Main(){

    }

    /**
     * Método main
     * @param args argumentos
     */
    public static void main(String[] args) {
        //String nome,String distrito,GPS localização,double despesa,double salarioAnualMedio, int numeroEmpregadosMesa,double numeroMedioClientesDia,int numeroDiasFuncional,int numeroMesasInteriores,double faturacaoDiariaMesa,int numeroClientesDriveThru,double faturacaoDiariaDriveThru


        File ficheiroObjetos  = new File("starthrive.dat");
        File ficheiroTexto = new File("starthrive.txt");



        StarThriveManager manager = new StarThriveManager();

        if(ficheiroObjetos.isFile() && ficheiroObjetos.exists()){
            System.out.println("O FICHEIRO DE OBJETOS EXISTE");

            ArrayList<Company> companies = new ArrayList();
            companies = manager.lerFicheiroObjetos(ficheiroObjetos,manager);
            manager.setLista(companies);

        }
        else if(!(ficheiroObjetos.isFile() && ficheiroObjetos.exists()) && ficheiroTexto.isFile() && ficheiroTexto.exists()){
            System.out.println("O FICHEIRO DE OBJETOS NÃO EXISTE, VAMOS LER O FICHEIRO DE TEXTO");
            manager.lerFicheiroTexto(ficheiroTexto);
            manager.escreverFicheiroObjeto(ficheiroObjetos,manager.getLista());
        }

        else{
            JOptionPane.showMessageDialog(null, "Nenhum ficheiro existe, terminando...", "Erro", JOptionPane.ERROR_MESSAGE);

            System.exit(1);
        }



        MenuWindowGUI menu = new MenuWindowGUI(manager,ficheiroObjetos);


    }
}