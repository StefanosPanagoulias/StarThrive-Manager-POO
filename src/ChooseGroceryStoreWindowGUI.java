

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Classe utilizada para representar a janela que permite escolher que empresa do tipo mercearia vamos criar
 */
public class ChooseGroceryStoreWindowGUI extends JFrame{

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
     * botão que permite criar uma frutaria
     */
    private JButton botão1;

    /**
     * botão que permite criar um mercado
     */
    private JButton botão2;

    /**
     * botão que permite cancelar a operação
     */
    private JButton botão3;



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
         * No caso de ter sido o botão que permite criar uma frutaria, a janela atual é eliminada e é aberta a janela que permite criar uma frutaria
         * No caso de ter sido o botão que permite criar um mercado, a janela atual é eliminada e é aberta a janela que permite escolher que tipo de mercado queremos criar
         * No caso de ter sido o botão que permite cancelar a operação, a janela atual é eliminada e voltamos à janela anterior
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == botão1){
                frame.dispose();
                CreateFruitShopWindowGUI criarFrutaria = new CreateFruitShopWindowGUI(manager,f);
            }

            else if(e.getSource() == botão2){
                frame.dispose();
                ChooseMarketWindowGUI escolhaMercado = new ChooseMarketWindowGUI(manager,f);

            }

            else if(e.getSource() == botão3){
                frame.dispose();
                ChooseCompanyWindowGUI escolhaEmpresa = new ChooseCompanyWindowGUI(manager,f);
            }

        }
    }


    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public ChooseGroceryStoreWindowGUI(StarThriveManager manager, File f){


        this.manager = manager;
        this.f = f;

        frame = new JFrame();

        botão1 = new JButton();
        botão2 = new JButton();
        botão3 = new JButton();


        botão1.setText("Fruit shop");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2.setText("Market");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());


        botão3.setText("Cancel operation");
        botão3.setFocusable(false);
        botão3.addActionListener(new ButtonListener());



        frame.setTitle("StarThrive Manager");
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(500,500);
        //this.getContentPane().setBackground(new Color(105,105,105));//Mudar a cor de fundo
        frame.add(botão1);
        frame.add(botão2);
        frame.add(botão3);
        frame.setVisible(true);



    }


}
