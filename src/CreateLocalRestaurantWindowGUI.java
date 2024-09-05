

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Classe utilizada para representar a janela de criar um restaurante local
 */
public class CreateLocalRestaurantWindowGUI extends JFrame{

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
     * Painel a que vão ser associados a label com o nome da empresa e a caixa de texto correspondente
     */
    private JPanel panel1;

    /**
     * Painel a que vão ser associados a label com o distrito da empresa e a caixa de texto correspondente
     */
    private  JPanel panel2;

    /**
     * Painel a que vão ser associados a label da localização da empresa e as  suas caixas de texto correspondentes
     */
    private  JPanel panel3;


    /**
     * Painel a que vão ser associados a label do saário médio dos empregados e a caixa de texto correspondente
     */
    private JPanel panel5;

    /**
     * Painel a que vão ser associados a label com o número de empregados e a caixa de texto correspondente
     */
    private JPanel panel6;

    /**
     * Painel a que vão ser associados a label com o número médio de clientes por dia e a caixa de texto correspondente
     */
    private JPanel panel7;

    /**
     * Painel a que vão ser associados a label com o número de dias por ano em que o restaurante está funcional e a caixa de texto correspondente
     */
    private JPanel panel8;

    /**
     * Painel a que vão ser associados a label com o número de mesas interiores e a caixa de texto correspondente
     */
    private JPanel panel9;

    /**
     * Painel a que vão ser associados a label com o valor médio faturado por cada mesa por dia e a caixa de texto correspondente
     */
    private JPanel panel10;

    /**
     * Painel a que vão ser associados a label com o número de mesas na esplanada e a caixa de texto correspondente
     */
    private JPanel panel11;

    /**
     * Painel a que vão ser associados a label com o valor anual da licença por cada mesa na esplanada e a caixa de texto correspondente
     */
    private JPanel panel12;


    /**
     * Caixa de texto do nome da empresa
     */
    private JTextField caixaTextoNome;

    /**
     * Caixa de texto do distrito
     */
    private JTextField caixaTextoDistrito;

    /**
     * Caixa de texto da latitude
     */
    private JTextField caixaTextoLocalização1; //latitude

    /**
     * Caixa de texto da longitude
     */
    private JTextField caixaTextoLocalização2; //longitude

    /**
     * Caixa de texto do salário
     */
    private JTextField caixaTextoSalario;

    /**
     * Caixa de texto do número de empregados
     */
    private JTextField caixaTextoNumeroEmpregados;

    /**
     * Caixa de texto do número de clientes
     */
    private JTextField caixaTextoNumeroClientes;

    /**
     * Caixa de texto do número de dias por ano em que o restaurante está funcional
     */
    private JTextField caixaTextoDiasFuncional;

    /**
     * Caixa de texto do número de mesas interiores
     */
    private JTextField caixaTextoNumeroMesasInteriores;

    /**
     * Caixa de texto do valor médio faturado por cada mesa por dia
     */
    private  JTextField caixaTextoFaturacaoMesa;

    /**
     * Caixa de texto do número de mesas da esplanada
     */
    private  JTextField caixaTextoNumeroMesasEsplanada;

    /**
     * Caixa de texto do valor anual pago pela licença de cada mesa na esplanada
     */
    private  JTextField caixaTextoLicencaMesa;


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
     * label do salário médio anual dos empregados
     */
    private JLabel labelSalárioMédio;

    /**
     * label do número de empregados
     */
    private JLabel labelNumeroEmpregados;

    /**
     * label do número médio de clientes por dia
     */
    private JLabel labelNumeroClientes;

    /**
     * label do número de dias por ano em que o restaurante está funcional
     */
    private JLabel labelDiasFuncionamento;

    /**
     * label do número de mesas interiores
     */
    private JLabel labelNumeroMesasInteriores;

    /**
     * label do valor médio faturado por mesa por dia
     */
    private JLabel labelFaturacaoMesa;

    /**
     * label do número de mesas na esplanada
     */
    private JLabel labelNumeroMesasEsplanada;

    /**
     * label do valor anual pago pela licença de cada mesa na esplanada
     */
    private JLabel labelLicencaMesa;

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

            if(e.getSource() == botão1){
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
                    double salarioMedio = Double.parseDouble(caixaTextoSalario.getText());
                    if(salarioMedio<0) throw new IllegalArgumentException("");

                }
                catch(NumberFormatException ex){
                    caixaTextoSalario.setBackground(Color.red);
                    caixaTextoSalario.setText("");

                    JOptionPane.showMessageDialog(null, "The average salary must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoSalario.setBackground(Color.red);
                    caixaTextoSalario.setText("");

                    JOptionPane.showMessageDialog(null, "The average salary must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    int numeroEmpregados = Integer.parseInt(caixaTextoNumeroEmpregados.getText());
                    if(numeroEmpregados<0) throw new IllegalArgumentException("");


                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroEmpregados.setBackground(Color.red);
                    caixaTextoNumeroEmpregados.setText("");

                    JOptionPane.showMessageDialog(null, "The number of employees must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }
                catch(IllegalArgumentException ex){
                    caixaTextoNumeroEmpregados.setBackground(Color.red);
                    caixaTextoNumeroEmpregados.setText("");

                    JOptionPane.showMessageDialog(null, "The number of employees must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double numeroClientesDia = Double.parseDouble(caixaTextoNumeroClientes.getText());
                    if(numeroClientesDia<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroClientes.setBackground(Color.red);
                    caixaTextoNumeroClientes.setText("");

                    JOptionPane.showMessageDialog(null, "The number of clients must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroClientes.setBackground(Color.red);
                    caixaTextoNumeroClientes.setText("");

                    JOptionPane.showMessageDialog(null, "The number of clients must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                try{
                    int numeroDiasFuncional = Integer.parseInt(caixaTextoDiasFuncional.getText());
                    if(numeroDiasFuncional<0||numeroDiasFuncional>365) throw new IllegalArgumentException("");

                }
                catch(NumberFormatException ex){
                    caixaTextoDiasFuncional.setBackground(Color.red);
                    caixaTextoDiasFuncional.setText("");


                    JOptionPane.showMessageDialog(null, "The number of functional days must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                catch(IllegalArgumentException ex){
                    caixaTextoDiasFuncional.setBackground(Color.red);
                    caixaTextoDiasFuncional.setText("");

                    JOptionPane.showMessageDialog(null, "Select a valid number between 0 and 365", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                try{
                    int numeroMesasInteriores = Integer.parseInt(caixaTextoNumeroMesasInteriores.getText());
                    if(numeroMesasInteriores<0) throw new IllegalArgumentException("");



                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroMesasInteriores.setBackground(Color.red);
                    caixaTextoNumeroMesasInteriores.setText("");

                    JOptionPane.showMessageDialog(null, "The number of tables must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroMesasInteriores.setBackground(Color.red);
                    caixaTextoNumeroMesasInteriores.setText("");

                    JOptionPane.showMessageDialog(null, "The number of tables must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                try{
                    double faturacaoDiariaMesa = Double.parseDouble(caixaTextoFaturacaoMesa.getText());
                    if (faturacaoDiariaMesa<0) throw new IllegalArgumentException("");

                }
                catch(NumberFormatException ex){
                    caixaTextoFaturacaoMesa.setBackground(Color.red);
                    caixaTextoFaturacaoMesa.setText("");

                    JOptionPane.showMessageDialog(null, "Daily revenue per table must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoFaturacaoMesa.setBackground(Color.red);
                    caixaTextoFaturacaoMesa.setText("");

                    JOptionPane.showMessageDialog(null, "Daily revenue per table must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    int numeroMesasEsplanada = Integer.parseInt(caixaTextoNumeroMesasEsplanada.getText());
                    if(numeroMesasEsplanada<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroMesasEsplanada.setBackground(Color.red);
                    caixaTextoNumeroMesasEsplanada.setText("");

                    JOptionPane.showMessageDialog(null, "The number of tables on the terrace must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroMesasEsplanada.setBackground(Color.red);
                    caixaTextoNumeroMesasEsplanada.setText("");

                    JOptionPane.showMessageDialog(null, "The number of tables on the terrace must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double licencaMesa = Double.parseDouble(caixaTextoLicencaMesa.getText());

                    if(licencaMesa<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoLicencaMesa.setBackground(Color.red);
                    caixaTextoLicencaMesa.setText("");

                    JOptionPane.showMessageDialog(null, "The annual license must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoLicencaMesa.setBackground(Color.red);
                    caixaTextoLicencaMesa.setText("");

                    JOptionPane.showMessageDialog(null, "The annual license must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }
                if(ok){
                    GPS local = new GPS(Double.parseDouble(caixaTextoLocalização1.getText()),Double.parseDouble(caixaTextoLocalização2.getText()));
                    Company aux = new LocalRestaurant(caixaTextoNome.getText(),caixaTextoDistrito.getText(),local,Double.parseDouble(caixaTextoSalario.getText()),Integer.parseInt(caixaTextoNumeroEmpregados.getText()),Double.parseDouble(caixaTextoNumeroClientes.getText()),Integer.parseInt(caixaTextoDiasFuncional.getText()),Integer.parseInt(caixaTextoNumeroMesasInteriores.getText()),Double.parseDouble(caixaTextoFaturacaoMesa.getText()),Integer.parseInt(caixaTextoNumeroMesasEsplanada.getText()),Double.parseDouble(caixaTextoLicencaMesa.getText()));
                    //System.out.println(aux.toString());
                    manager.addEmpresa(aux);
                    manager.addListaLocal(aux);

                    manager.escreverFicheiroObjeto(f,manager.getLista());

                    frame.dispose();
                    MenuWindowGUI menu = new MenuWindowGUI(manager,f);

                }

            }

            if(e.getSource() == botão2){
                ChooseRestaurantWindowGUI escolhaRestaurante = new ChooseRestaurantWindowGUI(manager,f);
                frame.dispose();
            }


        }
    }


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

            if(e.getSource() == caixaTextoSalario){
                if(caixaTextoSalario.getBackground() == Color.red){
                    caixaTextoSalario.setBackground(Color.white);

                }

            }
            if(e.getSource() == caixaTextoNumeroEmpregados){
                if(caixaTextoNumeroEmpregados.getBackground() == Color.red){
                    caixaTextoNumeroEmpregados.setBackground(Color.white);

                }
            }



            if(e.getSource() == caixaTextoNumeroClientes){
                if(caixaTextoNumeroClientes.getBackground() == Color.red){
                    caixaTextoNumeroClientes.setBackground(Color.white);

                }

            }

            if(e.getSource()== caixaTextoDiasFuncional){
                if(caixaTextoDiasFuncional.getBackground() == Color.red){
                    caixaTextoDiasFuncional.setBackground(Color.white);

                }

            }
            if(e.getSource() == caixaTextoNumeroMesasInteriores){
                if(caixaTextoNumeroMesasInteriores.getBackground() == Color.red){
                    caixaTextoNumeroMesasInteriores.setBackground(Color.white);

                }



            }

            if(e.getSource() == caixaTextoFaturacaoMesa){
                if(caixaTextoFaturacaoMesa.getBackground() == Color.red){
                    caixaTextoFaturacaoMesa.setBackground(Color.white);

                }

            }


            if(e.getSource() == caixaTextoNumeroMesasEsplanada){
                if(caixaTextoNumeroMesasEsplanada.getBackground() == Color.red){
                    caixaTextoNumeroMesasEsplanada.setBackground(Color.white);

                }


            }
            if(e.getSource() == caixaTextoLicencaMesa){
                if(caixaTextoLicencaMesa.getBackground() == Color.red){
                    caixaTextoLicencaMesa.setBackground(Color.white);

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
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public CreateLocalRestaurantWindowGUI(StarThriveManager manager, File f){
        this.manager = manager;
        this.f = f;

        frame = new JFrame();


        labelNome = new JLabel("Restaurant name");
        labelDistrito = new JLabel("District");
        labelLocalização = new JLabel("Location");

        labelSalárioMédio = new JLabel("Average annual salary paid to employees");
        labelNumeroEmpregados = new JLabel("Number of table staff");
        labelNumeroClientes = new JLabel("Average number of clients per day");
        labelDiasFuncionamento = new JLabel("Number of days per year the restaurant is open");
        labelNumeroMesasInteriores = new JLabel("Number of indoor tables");
        labelFaturacaoMesa = new JLabel("Daily revenue per table");
        labelNumeroMesasEsplanada = new JLabel("Number of tables on the terrace");
        labelLicencaMesa = new JLabel("Annual license fee per table on the terrace");

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


        caixaTextoSalario = new JTextField();
        caixaTextoSalario.setPreferredSize(new Dimension(250,40));

        caixaTextoSalario.addMouseListener(textfieldListener);


        caixaTextoNumeroEmpregados = new JTextField();
        caixaTextoNumeroEmpregados.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroEmpregados.addMouseListener(textfieldListener);


        caixaTextoNumeroClientes = new JTextField();
        caixaTextoNumeroClientes.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroClientes.addMouseListener(textfieldListener);


        caixaTextoDiasFuncional = new JTextField();
        caixaTextoDiasFuncional.setPreferredSize(new Dimension(250,40));

        caixaTextoDiasFuncional.addMouseListener(textfieldListener);


        caixaTextoNumeroMesasInteriores = new JTextField();
        caixaTextoNumeroMesasInteriores.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroMesasInteriores.addMouseListener(textfieldListener);


        caixaTextoFaturacaoMesa = new JTextField();
        caixaTextoFaturacaoMesa.setPreferredSize(new Dimension(250,40));

        caixaTextoFaturacaoMesa.addMouseListener(textfieldListener);


        caixaTextoNumeroMesasEsplanada = new JTextField();
        caixaTextoNumeroMesasEsplanada.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroMesasEsplanada.addMouseListener(textfieldListener);


        caixaTextoLicencaMesa = new JTextField();
        caixaTextoLicencaMesa.setPreferredSize(new Dimension(250,40));

        caixaTextoLicencaMesa.addMouseListener(textfieldListener);




        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();







        botão1 = new JButton();
        botão1.setText("Submit");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2 = new JButton();
        botão2.setText("Cancel operation");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());



        frame.setTitle("Create local restaurant");
        frame.setLayout(new GridLayout(12,1));
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        //this.getContentPane().setBackground(new Color(105,105,105));//Mudar a cor de fundo

        panel1.add(labelNome);
        panel1.add(caixaTextoNome);

        panel2.add(labelDistrito);
        panel2.add(caixaTextoDistrito);


        panel3.add(labelLocalização);
        panel3.add(caixaTextoLocalização1);
        panel3.add(caixaTextoLocalização2);

        panel5.add(labelSalárioMédio);
        panel5.add(caixaTextoSalario);

        panel6.add(labelNumeroEmpregados);
        panel6.add(caixaTextoNumeroEmpregados);

        panel7.add(labelNumeroClientes);
        panel7.add(caixaTextoNumeroClientes);

        panel8.add(labelDiasFuncionamento);
        panel8.add(caixaTextoDiasFuncional);

        panel9.add(labelNumeroMesasInteriores);
        panel9.add(caixaTextoNumeroMesasInteriores);

        panel10.add(labelFaturacaoMesa);
        panel10.add(caixaTextoFaturacaoMesa);

        panel11.add(labelNumeroMesasEsplanada);
        panel11.add(caixaTextoNumeroMesasEsplanada);

        panel12.add(labelLicencaMesa);
        panel12.add(caixaTextoLicencaMesa);




        //this.pack();

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);
        frame.add(panel11);
        frame.add(panel12);
        frame.add(botão1);
        frame.add(botão2);

    }



}
