

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Classe utilizada para representar a janela de editar um restaurante de fast food
 */
public class EditFastFoodRestaurantWindowGUI extends JFrame {
    /**
     * Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    private StarThriveManager manager;

    /**
     * ficheiro de objetos
     */
    private File f;

    /**
     * Empresa a ser editada
     */
    private Company company;

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
     * Painel a que vão ser associados a label com o número médio de clientes por dia do drive-thru e a caixa de texto correspondente
     */
    private JPanel panel11;

    /**
     * Painel a que vão ser associados a label com o valor médio faturado por cliente no drive-thru e a caixa de texto correspondente
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
    private JTextField caixaTextoNumeroMesas;

    /**
     * Caixa de texto do valor médio faturado por cada mesa por dia
     */
    private  JTextField caixaTextoFaturacaoMesa;

    /**
     * Caixa de texto do número médio de clientes por dia do drive-thru
     */
    private JTextField caixaTextoNumeroClientesDriveThru;

    /**
     * Caixa de texto do valor médio faturado por cliente no drive-thru
     */
    private JTextField caixaTextoFaturacaoDriveThru;


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
     * label do número médio de clientes do drive-thru por dia
     */
    private JLabel labelNumeroClientesDriveThru;

    /**
     * label do valor médio faturado por cliente do drive-thru
     */
    private JLabel labelFaturacaoDriveThru;


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
            if(e.getSource() == caixaTextoNumeroMesas){
                if(caixaTextoNumeroMesas.getBackground() == Color.red){
                    caixaTextoNumeroMesas.setBackground(Color.white);

                }



            }

            if(e.getSource() == caixaTextoFaturacaoMesa){
                if(caixaTextoFaturacaoMesa.getBackground() == Color.red){
                    caixaTextoFaturacaoMesa.setBackground(Color.white);

                }

            }


            if(e.getSource() == caixaTextoNumeroClientesDriveThru){
                if(caixaTextoNumeroClientesDriveThru.getBackground() == Color.red){
                    caixaTextoNumeroClientesDriveThru.setBackground(Color.white);

                }


            }
            if(e.getSource() == caixaTextoFaturacaoDriveThru){
                if(caixaTextoFaturacaoDriveThru.getBackground() == Color.red){
                    caixaTextoFaturacaoDriveThru.setBackground(Color.white);

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
    private class ButtonListener implements ActionListener {
        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        ButtonListener(){

        }

        /**
         * Método actionPerformed, recebe o evento de um click do rato num botão, averigua qual dos dois botões foi pressionado
         * No caso de ter sido o botão utilizado para submeter informação, todos os parâmetros são validados, o objeto anterior é eliminado, e é criado um novo objeto com os novos dados pretendidos, atualizando assim as ArrayLists necessárias e o ficheiro de objetos
         * No caso de ter sido o botão utilizado para cancelar a operação, a janela atual é fechada e voltamos à janela anterior
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            //String nome,String distrito,GPS localização,double despesa,double salarioAnualMedio, int numeroEmpregadosMesa,double numeroMedioClientesDia,int numeroDiasFuncional,int numeroMesasInteriores,double faturacaoDiariaMesa,int numeroClientesDriveThru,double faturacaoDiariaDriveThru

            //String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa, int numeroClientesDriveThru, double faturacaoDiariaDriveThru


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
                    for (int i = 0; i < distrito.length(); i++) {
                        if(!Character.isLetter(distrito.charAt(i))){

                            throw new IllegalArgumentException("");

                        }

                    }

                }

                catch(IllegalArgumentException ex1){
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
                    int numeroMesas = Integer.parseInt(caixaTextoNumeroMesas.getText());
                    if(numeroMesas<0) throw new IllegalArgumentException("");



                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroMesas.setBackground(Color.red);
                    caixaTextoNumeroMesas.setText("");

                    JOptionPane.showMessageDialog(null, "The number of tables must be an integer!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroMesas.setBackground(Color.red);
                    caixaTextoNumeroMesas.setText("");

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
                    double numeroClientesDT = Double.parseDouble(caixaTextoNumeroClientesDriveThru.getText());
                    if(numeroClientesDT<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroClientesDriveThru.setBackground(Color.red);
                    caixaTextoNumeroClientesDriveThru.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of drive-thru clients must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroClientesDriveThru.setBackground(Color.red);
                    caixaTextoNumeroClientesDriveThru.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of drive-thru clients must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);


                    ok = false;
                }


                try{
                    double faturacaoDriveThru = Double.parseDouble(caixaTextoFaturacaoDriveThru.getText());

                    if(faturacaoDriveThru<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoFaturacaoDriveThru.setBackground(Color.red);
                    caixaTextoFaturacaoDriveThru.setText("");

                    JOptionPane.showMessageDialog(null, "Average daily revenue per drive-thru client must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoFaturacaoDriveThru.setBackground(Color.red);
                    caixaTextoFaturacaoDriveThru.setText("");

                    JOptionPane.showMessageDialog(null, "Average daily revenue per drive-thru client must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                if(ok){
                    GPS local = new GPS(Double.parseDouble(caixaTextoLocalização1.getText()),Double.parseDouble(caixaTextoLocalização2.getText()));
                    Company aux = new FastFoodRestaurant(caixaTextoNome.getText(),caixaTextoDistrito.getText(),local,Double.parseDouble(caixaTextoSalario.getText()),Integer.parseInt(caixaTextoNumeroEmpregados.getText()),Double.parseDouble(caixaTextoNumeroClientes.getText()),Integer.parseInt(caixaTextoDiasFuncional.getText()),Integer.parseInt(caixaTextoNumeroMesas.getText()),Double.parseDouble(caixaTextoFaturacaoMesa.getText()),Double.parseDouble(caixaTextoNumeroClientesDriveThru.getText()),Double.parseDouble(caixaTextoFaturacaoDriveThru.getText()));
                    //System.out.println(aux.toString());

                    manager.eliminarEmpresa(company);
                    manager.addEmpresa(aux);

                    manager.eliminarListaFastFood(company);
                    manager.addListaFastFood(aux);


                    manager.escreverFicheiroObjeto(f,manager.getLista());

                    frame.dispose();
                    MenuWindowGUI menu = new MenuWindowGUI(manager,f);

                }




            }

            if(e.getSource() == botão2){
                EditCompanyWindowGUI edit = new EditCompanyWindowGUI(manager,f);
                frame.dispose();
            }

        }
    }


    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     * @param e empresa a ser editada
     */
    public EditFastFoodRestaurantWindowGUI(StarThriveManager manager, FastFoodRestaurant e, File f) {
        this.manager = manager;
        this.company = e;
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
        labelNumeroClientesDriveThru = new JLabel("Average number of clients using the drive-thru");
        labelFaturacaoDriveThru = new JLabel("Average revenue per drive-thru client");

        TextfieldListener textFieldListener = new TextfieldListener();


        caixaTextoNome = new JTextField(e.getNome());
        caixaTextoNome.setPreferredSize(new Dimension(250,40));

        caixaTextoNome.addMouseListener(textFieldListener);


        caixaTextoDistrito = new JTextField(e.getDistrito());
        caixaTextoDistrito.setPreferredSize(new Dimension(250,40));

        caixaTextoDistrito.addMouseListener(textFieldListener);

        GPS aux = e.getLocalização();

        caixaTextoLocalização1 = new JTextField(String.valueOf(aux.getLatitude())); //latitude
        caixaTextoLocalização1.setPreferredSize(new Dimension(250,40));

        caixaTextoLocalização1.addMouseListener(textFieldListener);


        caixaTextoLocalização2 = new JTextField(String.valueOf(aux.getLongitude())); //longitude
        caixaTextoLocalização2.setPreferredSize(new Dimension(250,40));

        caixaTextoLocalização2.addMouseListener(textFieldListener);

        caixaTextoSalario = new JTextField(String.valueOf(e.getSalarioAnualMedio()));
        caixaTextoSalario.setPreferredSize(new Dimension(250,40));

        caixaTextoSalario.addMouseListener(textFieldListener);


        caixaTextoNumeroEmpregados = new JTextField(String.valueOf(e.getNumeroEmpregadosMesa()));
        caixaTextoNumeroEmpregados.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroEmpregados.addMouseListener(textFieldListener);


        caixaTextoNumeroClientes = new JTextField(String.valueOf(e.getNumeroMedioClientesDia()));
        caixaTextoNumeroClientes.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroClientes.addMouseListener(textFieldListener);


        caixaTextoDiasFuncional = new JTextField(String.valueOf(e.getNumeroDiasFuncional()));
        caixaTextoDiasFuncional.setPreferredSize(new Dimension(250,40));

        caixaTextoDiasFuncional.addMouseListener(textFieldListener);


        caixaTextoNumeroMesas = new JTextField(String.valueOf(e.getNumeroMesasInteriores()));
        caixaTextoNumeroMesas.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroMesas.addMouseListener(textFieldListener);


        caixaTextoFaturacaoMesa = new JTextField(String.valueOf(e.getFaturacaoDiariaMesa()));
        caixaTextoFaturacaoMesa.setPreferredSize(new Dimension(250,40));

        caixaTextoFaturacaoMesa.addMouseListener(textFieldListener);


        caixaTextoNumeroClientesDriveThru = new JTextField(String.valueOf(e.getNumeroClientesDriveThru()));
        caixaTextoNumeroClientesDriveThru.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroClientesDriveThru.addMouseListener(textFieldListener);


        caixaTextoFaturacaoDriveThru = new JTextField(String.valueOf(e.getFaturacaoClienteDriveThru()));
        caixaTextoFaturacaoDriveThru.setPreferredSize(new Dimension(250,40));

        caixaTextoFaturacaoDriveThru.addMouseListener(textFieldListener);




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



        frame.setTitle("Edit fast food restaurant");
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
        panel9.add(caixaTextoNumeroMesas);

        panel10.add(labelFaturacaoMesa);
        panel10.add(caixaTextoFaturacaoMesa);

        panel11.add(labelNumeroClientesDriveThru);
        panel11.add(caixaTextoNumeroClientesDriveThru);

        panel12.add(labelFaturacaoDriveThru);
        panel12.add(caixaTextoFaturacaoDriveThru);




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
