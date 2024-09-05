

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Classe utilizada para representar a janela do menu principal
 */
public class MenuWindowGUI extends JFrame{

    /**
     * frame principal da janela
     */
    private JFrame frame;

    /**
     * Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    private StarThriveManager manager;

    /**
     * ficheiro de objetos
     */
    private File f;

    /**
     * botão que permite criar uma nova empresa
     */
    private JButton botão1;

    /**
     * botão que permite listar todas as empresas
     */
    private JButton botão2;

    /**
     * botão que permite editar uma empresa
     */
    private JButton botão3;

    /**
     * botão que permite eliminar uma empresa
     */
    private JButton botão4;

    /**
     * botão que permite listar as empresas com maior lucro, menor despesa e maior receita
     */
    private JButton botão5;

    /**
     * botão que permite listar os dois restaurantes com maior capacidade de clientes por dia
     */
    private JButton botão6;




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
         * No caso de ter sido o botão que permite criar uma nova empresa, a janela atual é eliminada e é aberta a janela que permite ao utilizador escolher que tipo de empresa quer criar
         * No caso de ter sido o botão que permite listar todas as empresas a janela atual é eliminada e é aberta a janela que permite ao utilizador visualizar todas as empresas
         * No caso de ter sido o botão que permite editar uma empresa, a janela atual é eliminada e é aberta a janela que permite ao utilizador escolher que empresa quer editar
         * No caso de ter sido o botão que permite eliminar uma empresa, a janela atual é eliminada e é aberta a janela que permite ao utilizador escolher quais empresas quer eliminar
         * No caso de ter sido o botão que permite listar as empresas com maior lucro, menor despesa e maior receita, a janela atual é eliminada e é aberta a janela que permite ao utilizador visualizar as empresas com essas características
         * No caso de ter sido o botão que permite listar os restaurantes com maior capacidade de clientes por dia, a janela atual é eliminada e é aberta a janela que permite ao utilizador visualizar os restaurantes com essas características
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == botão1 ){
                frame.dispose();
                ChooseCompanyWindowGUI menuSelecao = new ChooseCompanyWindowGUI(manager,f);
            }
            else if(e.getSource() == botão2){
                //manager.listarEmpresas();
                frame.dispose();
                ListCompaniesWindowGUI listarEmpresas = new ListCompaniesWindowGUI(manager,f);
            }

            else if(e.getSource() == botão3){
                frame.dispose();
                EditCompanyWindowGUI editarEmpresa = new EditCompanyWindowGUI(manager,f);

            }

            else if(e.getSource() == botão4){
                frame.dispose();
                DeleteCompanyWindowGUI eliminarEmpresa = new DeleteCompanyWindowGUI(manager,f);
            }

            else if(e.getSource() == botão5){
                frame.dispose();
                ListCompaniesSpecificInfoWindowGUI empresasLucrativas = new ListCompaniesSpecificInfoWindowGUI(manager,f);
            }

            else if(e.getSource() == botão6){
                frame.dispose();
                ListRestaurantsWithLargestCustomerCapacityWindowGUI maisLugares = new ListRestaurantsWithLargestCustomerCapacityWindowGUI(manager,f);
            }



        }
    }

    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public MenuWindowGUI(StarThriveManager manager, File f){

        this.manager = manager;
        this.f = f;
        frame = new JFrame();


        /*
        Botões
         */
        botão1 = new JButton();
        //botão1.setBounds(0,0,250,100);
        botão1.setText("Create new company");
        botão1.setFocusable(false);
        //botão1.setBackground(new Color(0, 128, 128));
        //botão1.setFont(new Font("Comic Sans",Font.BOLD,25));
        //botão1.setBorder(BorderFactory.createEtchedBorder());


        botão1.addActionListener(new ButtonListener());

        botão2 = new JButton();
        botão2.setText("List companies");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());

        botão3 = new JButton();
        botão3.setText("Edit company");
        botão3.setFocusable(false);
        botão3.addActionListener(new ButtonListener());


        botão4 = new JButton();
        botão4.setText("Delete company");
        botão4.setFocusable(false);
        botão4.addActionListener(new ButtonListener());

        botão5 = new JButton();
        botão5.setText("List most proffitable companies");
        botão5.setFocusable(false);
        botão5.addActionListener(new ButtonListener());


        botão6 = new JButton();
        botão6.setText("List the two companies with the highest daily customer capacity");
        botão6.setFocusable(false);
        botão6.addActionListener(new ButtonListener());





        //Janela em si
        frame.setTitle("StarThrive Manager");
        frame.setLayout(new GridLayout(3,2));
        frame.setSize(500,500);
        //this.getContentPane().setBackground(new Color(105,105,105));//Mudar a cor de fundo
        frame.add(botão1);
        frame.add(botão2);
        frame.add(botão3);
        frame.add(botão4);
        frame.add(botão5);
        frame.add(botão6);
        frame.setVisible(true);



    }



}
