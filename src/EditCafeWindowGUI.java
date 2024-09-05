

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Classe utilizada para representar a janela de editar um café
 */
public class EditCafeWindowGUI extends JFrame {
    /**
     * Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    private  StarThriveManager manager;

    /**
     * Ficheiro de objetos
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
    private  JPanel panel1;
    /**
     * Painel a que vão ser associados a label com o distrito da empresa e a caixa de texto correspondente
     */
    private  JPanel panel2;
    /**
     * Painel a que vão ser associados a label da localização da empresa e as  suas caixas de texto correspondentes
     */
    private   JPanel panel3;

    /**
     * Painel a que vão ser associados a label do salário médio anual dos empregados da empresa e a caixa de texto correspondente
     */
    private  JPanel panel5;

    /**
     * Painel a que vão ser associados a label do número de empregados da empresa e a caixa de texto correspondente
     */
    private JPanel panel6;

    /**
     * Painel a que vão estar associados a label do número de clientes médio por dia e a caixa de texto correspondente
     */
    private  JPanel panel7;

    /**
     * Painel a que vão estar associados a label do número médio de cafés vendido por dia e a caixa de texto correspondente
     */
    private  JPanel panel8;

    /**
     * Painel a que vão estar associados a label do Valor médio faturado num ano por café vendido por dia e a caixa de texto correspondente
     */
    private  JPanel panel9;


    /**
     * Caixa de texto do nome da empresa
     */
    private JTextField caixaTextoNome;
    /**
     * Caixa de texto do distrito da empresa
     */
    private  JTextField caixaTextoDistrito;
    /**
     * Caixa de texto da latitude da empresa
     */
    private JTextField caixaTextoLocalização1; //latitude
    /**
     * Caixa de texto da longitude da empresa
     */
    private JTextField caixaTextoLocalização2; //longitude

    /**
     * Caixa de texto do salário médio anual dos empregados da empresa
     */
    private JTextField caixaTextoSalario;
    /**
     * Caixa de texto do número de empregados da empresa
     */
    private JTextField caixaTextoNumeroEmpregados;
    /**
     * Caixa de texto do número médio de clientes por dia
     */
    private JTextField caixaTextoNumeroClientes;

    /**
     * Caixa de texto do número médio de cafés vendido por dia
     */
    private JTextField caixaTextoNumeroMedioCafesDia;

    /**
     * Caixa de texto do Valor médio faturado num ano por café vendido por dia
     */
    private JTextField caixaTextoFaturacaoAnual;

    /**
     * Botão para submeter a informação pretendida
     */
    private JButton botão1;

    /**
     * Botão para cancelar a operação
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
     * label do salário anual médio dos empregados da empresa
     */
    private JLabel labelSalárioMédio;

    /**
     * label do número de empregados da empresa
     */
    private JLabel labelNumeroEmpregados;

    /**
     * label do número médio de clientes por dia
     */
    private JLabel labelNumeroClientes;

    /**
     * label do número médio de cafés vendidos por dia
     */
    private JLabel labelNumeroMedioCafesDia;

    /**
     * label do Valor médio faturado num ano por café vendido por dia
     */
    private JLabel labelFaturacaoAnual;


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

            if(e.getSource() == caixaTextoNumeroClientes){
                if(caixaTextoNumeroClientes.getBackground() == Color.red){
                    caixaTextoNumeroClientes.setBackground(Color.white);

                }

            }
            if(e.getSource() == caixaTextoNumeroMedioCafesDia){
                if(caixaTextoNumeroMedioCafesDia.getBackground() == Color.red){
                    caixaTextoNumeroMedioCafesDia.setBackground(Color.white);

                }
            }



            if(e.getSource() == caixaTextoFaturacaoAnual){
                if(caixaTextoFaturacaoAnual.getBackground() == Color.red){
                    caixaTextoFaturacaoAnual.setBackground(Color.white);

                }

            }


            if(e.getSource() == caixaTextoNumeroEmpregados){
                if(caixaTextoNumeroEmpregados.getBackground() == Color.red){
                    caixaTextoNumeroEmpregados.setBackground(Color.white);
                }
            }

            if(e.getSource() == caixaTextoSalario){
                if(caixaTextoSalario.getBackground() == Color.red){
                    caixaTextoSalario.setBackground(Color.white);
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

            //String nome,String distrito,GPS localização,double despesa,double salarioAnualMedio, int numeroEmpregadosMesa,double numeroMedioClientesDia,double numeroMedioCafesDia,double faturacaoAnual

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
                    double salario = Double.parseDouble(caixaTextoSalario.getText());
                    if(salario<0) throw new IllegalArgumentException("");
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
                    double numeroClientes =Double.parseDouble(caixaTextoNumeroClientes.getText());
                    if(numeroClientes<0) throw new IllegalArgumentException("");

                }
                catch(NumberFormatException ex){
                    caixaTextoNumeroClientes.setBackground(Color.red);
                    caixaTextoNumeroClientes.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of clients must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }

                catch(IllegalArgumentException ex){
                    caixaTextoNumeroClientes.setBackground(Color.red);
                    caixaTextoNumeroClientes.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of clients must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double numeroCafes = Double.parseDouble(caixaTextoNumeroMedioCafesDia.getText());
                    if(numeroCafes<0) throw new IllegalArgumentException("");


                }

                catch(NumberFormatException ex){
                    caixaTextoNumeroMedioCafesDia.setBackground(Color.red);
                    caixaTextoNumeroMedioCafesDia.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of coffees per day must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }
                catch(IllegalArgumentException ex){
                    caixaTextoNumeroMedioCafesDia.setBackground(Color.red);
                    caixaTextoNumeroMedioCafesDia.setText("");

                    JOptionPane.showMessageDialog(null, "The average number of coffees per day must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;
                }


                try{
                    double faturacaoAnual = Double.parseDouble(caixaTextoFaturacaoAnual.getText());
                    if(faturacaoAnual<0) throw new IllegalArgumentException("");
                }

                catch(NumberFormatException ex){
                    caixaTextoFaturacaoAnual.setBackground(Color.red);
                    caixaTextoFaturacaoAnual.setText("");

                    JOptionPane.showMessageDialog(null, "Annual revenue per coffee must be a number!", "Error", JOptionPane.ERROR_MESSAGE);


                    ok = false;

                }

                catch(IllegalArgumentException ex){
                    caixaTextoFaturacaoAnual.setBackground(Color.red);
                    caixaTextoFaturacaoAnual.setText("");

                    JOptionPane.showMessageDialog(null, "Annual revenue per coffee must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);

                    ok = false;

                }

                if(ok){
                    GPS local = new GPS(Double.parseDouble(caixaTextoLocalização1.getText()),Double.parseDouble(caixaTextoLocalização2.getText()));
                    Company aux = new Cafe(caixaTextoNome.getText(),caixaTextoDistrito.getText(),local,Double.parseDouble(caixaTextoSalario.getText()),Integer.parseInt(caixaTextoNumeroEmpregados.getText()),Double.parseDouble(caixaTextoNumeroClientes.getText()),Double.parseDouble(caixaTextoNumeroMedioCafesDia.getText()),Double.parseDouble(caixaTextoFaturacaoAnual.getText()));
                    //System.out.println(aux.toString());


                    manager.eliminarEmpresa(company);
                    manager.addEmpresa(aux);

                    manager.eliminarListaCafe(company);
                    manager.addListaCafe(aux);


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
    public EditCafeWindowGUI(StarThriveManager manager, Cafe e, File f){
        this.manager = manager;
        this.company = e;
        this.f = f;

        frame = new JFrame();



        labelNome = new JLabel("Cafe name");
        labelDistrito = new JLabel("District");
        labelLocalização = new JLabel("Location");
        labelSalárioMédio = new JLabel("Average annual salary paid to employees");
        labelNumeroEmpregados = new JLabel("Number of table staff");
        labelNumeroClientes = new JLabel("Average number of clients per day");
        labelNumeroMedioCafesDia = new JLabel("Número médio de cafés vendidos por dia");
        labelFaturacaoAnual = new JLabel("Average number of coffees sold per day");

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

        caixaTextoNumeroMedioCafesDia = new JTextField(String.valueOf(e.getNumeroMedioCafesDia()));
        caixaTextoNumeroMedioCafesDia.setPreferredSize(new Dimension(250,40));

        caixaTextoNumeroMedioCafesDia.addMouseListener(textFieldListener);

        caixaTextoFaturacaoAnual = new JTextField(String.valueOf(e.getFaturacaoAnual()));
        caixaTextoFaturacaoAnual.setPreferredSize(new Dimension(250,40));

        caixaTextoFaturacaoAnual.addMouseListener(textFieldListener);


        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();




        botão1 = new JButton();
        botão1.setText("Submit");
        botão1.setFocusable(false);
        botão1.addActionListener(new ButtonListener());

        botão2 = new JButton();
        botão2.setText("Cancel operation");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());



        frame.setTitle("Edit a cafe");
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


        panel5.add(labelSalárioMédio);
        panel5.add(caixaTextoSalario);

        panel6.add(labelNumeroEmpregados);
        panel6.add(caixaTextoNumeroEmpregados);

        panel7.add(labelNumeroClientes);
        panel7.add(caixaTextoNumeroClientes);

        panel8.add(labelNumeroMedioCafesDia);
        panel8.add(caixaTextoNumeroMedioCafesDia);

        panel9.add(labelFaturacaoAnual);
        panel9.add(caixaTextoFaturacaoAnual);


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(botão1);
        frame.add(botão2);



    }

}

