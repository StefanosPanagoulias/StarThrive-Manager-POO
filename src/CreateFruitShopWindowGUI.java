

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Classe utilizada para representar a janela de criar uma frutaria
 */
public class CreateFruitShopWindowGUI extends JFrame{


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
     * Painel a que vão ser associados a label com o nome da empresa e a caixa de texto correspondente
     */
    private JPanel panel1;

    /**
     * Painel a que vão ser associados a label com o distrito da empresa e a caixa de texto correspondente
     */
    private JPanel panel2;

    /**
     * Painel a que vão ser associados a label da localização da empresa e as  suas caixas de texto correspondentes
     */
    private  JPanel panel3;

    /**
     * Painel a que vão ser associados a label do número de produtos e a sua caixa de texto correspondente
     */
    private  JPanel panel4;

    /**
     * Painel a que vão estar associados a label do valor anual médio por cada produto e a sua caixa de texto correspondente
     */
    private  JPanel panel5;

    /**
     * Painel a que vão estar associados a label do custo anual da limpeza e a sua caixa de texto correspondente
     */
    private  JPanel panel6;

    /**
     * Caixa de texto do nome da empresa
     */
    private JTextField caixaTextoNome;

    /**
     * Caixa de texto do distrito da empresa
     */
    private JTextField caixaTextoDistrito;

    /**
     * Caixa de texto da latitude da empresa
     */
    private  JTextField caixaTextoLocalização1; //latitude

    /**
     * Caixa de texto da longitude da empresa
     */
    private  JTextField caixaTextoLocalização2; //longitude

    /**
     * Caixa de texto do número de produtos da empresa
     */
    private JTextField caixaTextoNumeroProdutos;

    /**
     * Caixa de texto do valor da faturação anual por produto
     */
    private JTextField caixaTextoFaturacaoAnualProduto;

    /**
     * Caixa de texto do valor do custo anual da limpeza
     */
    private JTextField caixaTextoCustoAnualLimpeza;


    /**
     * Botão utilizado para submeter informação
     */
    private JButton botão1;

    /**
     * Botão utilizado para cancelar a operação
     */
    private JButton botão2;


    /**
     * label do nome da empresa
     */
    private JLabel labelNome;

    /**
     * label do distrito da empresa
     */
    private JLabel labelDistrito;

    /**
     * label da localização da empresa
     */
    private JLabel labelLocalização;

    /**
     * label do número de produtos
     */
    private JLabel labelNumeroProdutos;

    /**
     * label da faturação anual por produto
     */
    private  JLabel labelFaturacaoAnualProduto;


    /**
     * label do custo anual da limpeza
     */
    private  JLabel labelCustoAnualLimpeza;


    /**
     * Classe TextFieldListener, que vai registar o evento de um click do rato numa caixa de texto
     */
    private class TextfieldListener implements MouseListener {
        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        TextfieldListener(){

        }

        /**
         * Método mouseClicked, que regista o evento de um click do rato numa caixa de texto, verifica se o fundo da
         * caixa de texto é vermelho, e, se sim, redifine o fundo para branco
         * @param e o evento de um click do rato numa caixa de texto
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource() == caixaTextoNome){
                if(caixaTextoNome.getBackground()==Color.red){
                    caixaTextoNome.setBackground(Color.white);
                }

            }
            if(e.getSource() == caixaTextoDistrito){
                if(caixaTextoDistrito.getBackground() == Color.red){
                    caixaTextoDistrito.setBackground(Color.white);

                }

            }
            if(e.getSource() == caixaTextoLocalização1){
                if(caixaTextoLocalização1.getBackground()==Color.red){
                    caixaTextoLocalização1.setBackground(Color.white);
                }

            }
            if(e.getSource() == caixaTextoLocalização2){
                if(caixaTextoLocalização2.getBackground() == Color.red){
                    caixaTextoLocalização2.setBackground(Color.white);

                }


            }

            if(e.getSource() == caixaTextoNumeroProdutos){
                if(caixaTextoNumeroProdutos.getBackground() == Color.red){
                    caixaTextoNumeroProdutos.setBackground(Color.white);

                }

            }
            if(e.getSource() == caixaTextoFaturacaoAnualProduto){
                if(caixaTextoFaturacaoAnualProduto.getBackground() == Color.red){
                    caixaTextoFaturacaoAnualProduto.setBackground(Color.white);

                }
            }


            if(e.getSource() == caixaTextoCustoAnualLimpeza){
                if(caixaTextoCustoAnualLimpeza.getBackground() == Color.red){
                    caixaTextoCustoAnualLimpeza.setBackground(Color.white);

                }

            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


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
         * Método actionPerformed, recebe o evento de um click do rato num botão, averigua qual dos dois botões foi pressionado
         * No caso de ter sido o botão utilizado para submeter informação, todos os parâmetros são validados e é criado um novo objeto, atualizando assim as ArrayLists necessárias e o ficheiro de objetos
         * No caso de ter sido o botão utilizado para cancelar a operação, a janela atual é fechada e voltamos à janela anterior
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==botão1){

                Boolean ok = true;

                try{
                    String nome = caixaTextoNome.getText();
                    if(nome.equals("")) throw new IllegalArgumentException("");
                }
                catch(IllegalArgumentException ex1){
                    caixaTextoNome.setBackground(Color.red);
                    caixaTextoNome.setText("");

                    JOptionPane.showMessageDialog(null, "The company name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;


                }

                try{
                    String distrito = caixaTextoDistrito.getText();
                    if(distrito.equals("")){
                        throw new IllegalArgumentException("");
                    }
                }
                catch(IllegalArgumentException ex){
                    caixaTextoDistrito.setBackground(Color.red);
                    caixaTextoDistrito.setText("");

                    JOptionPane.showMessageDialog(null, "The district cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }


                try {
                    String distrito = caixaTextoDistrito.getText();
                    int valor = 0;
                    for (int i = 0; i < distrito.length(); i++) {
                        if(!Character.isLetter(distrito.charAt(i))) throw new IllegalArgumentException("");

                    }

                }

                catch(IllegalArgumentException ex){
                    caixaTextoDistrito.setBackground(Color.red);
                    caixaTextoDistrito.setText("");

                    JOptionPane.showMessageDialog(null, "The district can only contain letters!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }



                try{
                    double latitude = Double.parseDouble(caixaTextoLocalização1.getText());
                }
                catch(NumberFormatException ex){

                    caixaTextoLocalização1.setBackground(Color.red);
                    caixaTextoLocalização1.setText("");

                    JOptionPane.showMessageDialog(null, "Latitude must be a number!", "Error", JOptionPane.ERROR_MESSAGE);


                    ok = false;
                }


                try{
                    double longitude = Double.parseDouble(caixaTextoLocalização2.getText());

                }

                catch(NumberFormatException ex){
                    caixaTextoLocalização2.setBackground(Color.red);
                    caixaTextoLocalização2.setText("");
                    JOptionPane.showMessageDialog(null, "Longitude must be a number!", "Error", JOptionPane.ERROR_MESSAGE);


                    ok = false;
                }

                try{
                    int numeroProdutos = Integer.parseInt(caixaTextoNumeroProdutos.getText());
                    if(numeroProdutos<0) throw new IllegalArgumentException("");

                }
                catch(NumberFormatException ex){
                    caixaTextoNumeroProdutos.setBackground(Color.red);
                    caixaTextoNumeroProdutos.setText("");

                    JOptionPane.showMessageDialog(null, "The number of products must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroProdutos.setBackground(Color.red);
                    caixaTextoNumeroProdutos.setText("");

                    JOptionPane.showMessageDialog(null, "The number of products must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double faturacaoProduto = Double.parseDouble(caixaTextoFaturacaoAnualProduto.getText());
                    if(faturacaoProduto<0) throw new IllegalArgumentException("");


                }

                catch(NumberFormatException ex){
                    caixaTextoFaturacaoAnualProduto.setBackground(Color.red);
                    caixaTextoFaturacaoAnualProduto.setText("");

                    JOptionPane.showMessageDialog(null, "Annual revenue per product must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }
                catch(IllegalArgumentException ex){
                    caixaTextoFaturacaoAnualProduto.setBackground(Color.red);
                    caixaTextoFaturacaoAnualProduto.setText("");

                    JOptionPane.showMessageDialog(null, "Annual revenue per product must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double custoAnualLimpeza = Double.parseDouble(caixaTextoCustoAnualLimpeza.getText());
                    if(custoAnualLimpeza<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoCustoAnualLimpeza.setBackground(Color.red);
                    caixaTextoCustoAnualLimpeza.setText("");

                    JOptionPane.showMessageDialog(null, "The annual cleaning cost must be a number!", "Error", JOptionPane.ERROR_MESSAGE);


                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoCustoAnualLimpeza.setBackground(Color.red);
                    caixaTextoCustoAnualLimpeza.setText("");

                    JOptionPane.showMessageDialog(null, "The annual cleaning cost must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }




                if(ok){
                    GPS local = new GPS(Double.parseDouble(caixaTextoLocalização1.getText()),Double.parseDouble(caixaTextoLocalização2.getText()));
                    Company aux = new FruitShop(caixaTextoNome.getText(),caixaTextoDistrito.getText(),local,Integer.parseInt(caixaTextoNumeroProdutos.getText()),Double.parseDouble(caixaTextoFaturacaoAnualProduto.getText()),Double.parseDouble(caixaTextoCustoAnualLimpeza.getText()));
                    manager.addEmpresa(aux);
                    manager.addListaFrutaria(aux);

                    manager.escreverFicheiroObjeto(f,manager.getLista());

                    frame.dispose();
                    MenuWindowGUI menuGUI = new MenuWindowGUI(manager,f);

                }

            }

            if(e.getSource() == botão2){
                ChooseGroceryStoreWindowGUI escolhaMercearia = new ChooseGroceryStoreWindowGUI(manager,f);
                frame.dispose();
            }


        }
    }

    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public CreateFruitShopWindowGUI(StarThriveManager manager, File f){
        this.manager = manager;
        this.f = f;

        frame = new JFrame();

        labelNome = new JLabel("Fruitshop name");
        labelDistrito = new JLabel("District");
        labelLocalização = new JLabel("Location");
        labelNumeroProdutos = new JLabel("Number of products");
        labelFaturacaoAnualProduto = new JLabel("Average annual revenue per product");
        labelCustoAnualLimpeza = new JLabel("Annual cleaning cost");

        TextfieldListener textfieldListener = new TextfieldListener();




        caixaTextoNome = new JTextField();
        caixaTextoNome.setPreferredSize(new Dimension(250,40));

        caixaTextoNome.addMouseListener(textfieldListener);


        caixaTextoDistrito = new JTextField();
        caixaTextoDistrito.setPreferredSize(new Dimension(250,40));

        caixaTextoDistrito.addMouseListener(textfieldListener);

        caixaTextoLocalização1 = new JTextField(); //latitude
        caixaTextoLocalização1.setPreferredSize(new Dimension(250,40));

        caixaTextoLocalização1.addMouseListener(textfieldListener);


        caixaTextoLocalização2 = new JTextField(); //longitude
        caixaTextoLocalização2.setPreferredSize(new Dimension(250,40));

        caixaTextoLocalização2.addMouseListener(textfieldListener);






        caixaTextoNumeroProdutos = new JTextField();
        caixaTextoNumeroProdutos.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroProdutos.addMouseListener(textfieldListener);

        caixaTextoFaturacaoAnualProduto = new JTextField();
        caixaTextoFaturacaoAnualProduto.setPreferredSize(new Dimension(250,40));

        caixaTextoFaturacaoAnualProduto.addMouseListener(textfieldListener);

        caixaTextoCustoAnualLimpeza = new JTextField();
        caixaTextoCustoAnualLimpeza.setPreferredSize(new Dimension(250,40));

        caixaTextoCustoAnualLimpeza.addMouseListener(textfieldListener);



        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();


        botão1 = new JButton();
        botão1.setText("Submit");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2 = new JButton();
        botão2.setText("Cancel operation");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());


        frame.setTitle("Create a fruitshop");
        //this.setLayout(new GridLayout(9,1));
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);


        panel1.add(labelNome);
        panel1.add(caixaTextoNome);

        panel2.add(labelDistrito);
        panel2.add(caixaTextoDistrito);


        panel3.add(labelLocalização);
        panel3.add(caixaTextoLocalização1);
        panel3.add(caixaTextoLocalização2);

        panel4.add(labelNumeroProdutos);
        panel4.add(caixaTextoNumeroProdutos);

        panel5.add(labelFaturacaoAnualProduto);
        panel5.add(caixaTextoFaturacaoAnualProduto);

        panel6.add(labelCustoAnualLimpeza);
        panel6.add(caixaTextoCustoAnualLimpeza);


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(botão1);
        frame.add(botão2);


    }

}
