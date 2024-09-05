

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Classe utilizada para representar a janela de escolha de que tipo de mercado criar
 */
public class ChooseMarketWindowGUI extends JFrame{

    /**
     * Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    private StarThriveManager manager;

    /**
     * Ficheiro de objetos
     */
    private File f;

    /**
     * frame principal da janela
     */
    private JFrame frame;

    /**
     * botão utilizado para selecionar um mini mercado
     */
    private JButton botão1;

    /**
     * botão utilizado para selecionar um super mercado
     */
    private JButton botão2;

    /**
     * botão utilizado para selecionar um hiper mercado
     */
    private JButton botão3;

    /**
     * botão utilizado para cancelar a operação
     */
    private JButton botão4;


    /**
     * Classe ButtonListener, que regista o evento de um click do rato num botão
     */
    private class ButtonListener implements ActionListener{

        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        ButtonListener(){

        }


        /**
         * Método actionPerformed, recebe o evento de um click do rato num botão, averigua qual botão foi selecionado.
         * No caso de qualquer tipo de mercado ter sido selecionado, a janela atual é eliminada e é aberta a janela que permite criar um mercado, uma vez que não existiam diferenças entre estes no enúnciado
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == botão1){
                frame.dispose();
                CreateMarketWindowGUI criarMercado = new CreateMarketWindowGUI(manager,f);
            }

            else if(e.getSource() == botão2){
                frame.dispose();
                CreateMarketWindowGUI criarMercado = new CreateMarketWindowGUI(manager,f);
            }

            else if(e.getSource() == botão3){
                frame.dispose();
                CreateMarketWindowGUI criarMercado = new CreateMarketWindowGUI(manager,f);
            }

            else if(e.getSource() == botão4){
                frame.dispose();
                ChooseGroceryStoreWindowGUI escolhaMercearia = new ChooseGroceryStoreWindowGUI(manager,f);
            }

        }
    }

    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public ChooseMarketWindowGUI(StarThriveManager manager, File f){

        this.manager = manager;
        this.f = f;

        frame = new JFrame();

        botão1 = new JButton();
        botão2 = new JButton();
        botão3 = new JButton();
        botão4 = new JButton();


        botão1.setText("Mini market");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2.setText("Super market");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());


        botão3.setText("Hiper market");
        botão3.setFocusable(false);
        botão3.addActionListener(new ButtonListener());

        botão4.setText("Cancel operation");
        botão4.setFocusable(false);
        botão4.addActionListener(new ButtonListener());



        frame.setTitle("StarThrive Manager");
        frame.setLayout(new GridLayout(4,1));
        frame.setSize(500,500);
        //this.getContentPane().setBackground(new Color(105,105,105));//Mudar a cor de fundo
        frame.add(botão1);
        frame.add(botão2);
        frame.add(botão3);
        frame.add(botão4);
        frame.setVisible(true);



    }


}
