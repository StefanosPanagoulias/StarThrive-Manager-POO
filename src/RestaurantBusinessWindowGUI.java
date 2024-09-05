

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Classe utilizada para representar a janela que permite ao utilizador escolher que tipo de empresa quer criar na área da restauração
 */
public class RestaurantBusinessWindowGUI extends JFrame{

    /**
     * Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    private StarThriveManager manager;

    /**
     * ficheiro de objetos
     */
    private File f;

    /**
     * frame principal da janela
     */
    private JFrame frame;
    /**
     *botão que permite escolher um restaurante
     */
    private JButton botão1;

    /**
     * botão que permite escolher um café
     */
    private JButton botão2;

    /**
     * botão que permite escolher uma pastelaria
     */
    private JButton botão3;

    /**
     * botão que permite cancelar a operação
     */
    private JButton botão4;




    /**
     * Classe ButtonListener, que regista o evento de um click do rato num botão
     */
    private class ButtonListener implements ActionListener {
        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        ButtonListener(){

        }


        /**
         * Método actionPerformed, recebe o evento de um botão ser selecionado, averigua qual botão foi selecionado
         * No caso de ter sido o botão que permite escolher um restaurante, a janela atual é eliminada e é aberta a janela que permite ao utilizador escolher que tipo de restaurante quer criar
         * No caso de ter sido o botão que permite escolher um café a janela atual é eliminada e é aberta a janela que permite ao utilizador criar um café
         * No caso de ter sido o botão que permite escolher uma pastelaria, a janela atual é eliminada e é aberta a janela que permite ao utilizador criar a pastelaria
         * No caso de ter sido o botão que permite cancelar a operação, a janela atual é eliminada e voltamos à janela anterior

         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==botão1){
                frame.dispose();
                ChooseRestaurantWindowGUI escolhaRestaurante = new ChooseRestaurantWindowGUI(manager,f);
            }

            else if(e.getSource()==botão2){
                frame.dispose();

                CreateCafeWindowGUI criarCafe = new CreateCafeWindowGUI(manager,f);
            }

            else if(e.getSource() == botão3){
                frame.dispose();
                CreateBakeryWindowGUI criarPastelaria = new CreateBakeryWindowGUI(manager,f);
            }


            else if(e.getSource() == botão4){
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
    public RestaurantBusinessWindowGUI(StarThriveManager manager, File f){
        this.manager = manager;
        this.f = f;

        frame = new JFrame();

        botão1 = new JButton();
        botão2 = new JButton();
        botão3 = new JButton();
        botão4 = new JButton();


        botão1.setText("Restaurant");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2.setText("Cafe");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());


        botão3.setText("Bakery");
        botão3.setFocusable(false);
        botão3.addActionListener(new ButtonListener());

        botão4.setText("Cancel option");
        botão4.setFocusable(false);
        botão4.addActionListener(new ButtonListener());




        frame.setTitle("Restaurant Manager");
        frame.setLayout(new GridLayout(4,1));
        frame.setSize(500,500);

        frame.add(botão1);
        frame.add(botão2);
        frame.add(botão3);
        frame.add(botão4);

        frame.setVisible(true);

    }



}
