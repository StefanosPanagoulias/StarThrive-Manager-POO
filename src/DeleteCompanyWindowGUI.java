

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Classe utilizada para representar a janela de eliminar uma ou mais empresas
 */
public class DeleteCompanyWindowGUI extends JFrame{

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
     * painel geral, ao qual vão ser adicionados outros paineis
     */
    private JPanel painelGeral;

    /**
     * painel do botão
     */
    private JPanel painelBotão;


    /**
     * Objeto do tipo do modelo criado para a tabela de seleção
     */
    private TableModel myData;

    /**
     * Botão utilizado para submeter informação
     */
    private JButton botão;

    /**
     * Botão utilizado para cancelar a operação
     */
    private JButton botão2;


    /**
     * ArrayList auxiliar para manter em conta quais empresas devem ser eliminadas
     */
    private ArrayList<Company> eliminadas;

    /**
     * ArrayList auxiliar para guardar a  ArrayList principal com todas as empresas
     */
    private ArrayList<Company> temp;



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
         * No caso de ter sido o botão utilizado para submeter informação, todas as empresas adicionadas à ArrayList das empresas eliminadas vão ser eliminadas, atualizando assim as ArrayLists necessárias e o ficheiro de objetos
         * No caso de ter sido o botão utilizado para cancelar a operação, a janela atual é fechada e voltamos à janela anterior
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == botão){


            for(int i=0;i<eliminadas.size();i++){

                eliminadas.get(i).eliminarListaEspecifica(manager);
                manager.eliminarEmpresa(eliminadas.get(i));

            }

                manager.listarFastFood();


                manager.escreverFicheiroObjeto(f,manager.getLista());

                frame.dispose();
                MenuWindowGUI janelaMenu = new MenuWindowGUI(manager,f);
            }

            if(e.getSource() == botão2){
                frame.dispose();
                MenuWindowGUI janelaMenu = new MenuWindowGUI(manager,f);

            }

        }
    }




    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public DeleteCompanyWindowGUI(StarThriveManager manager, File f) {

        this.manager = manager;
        this.f = f;


        frame =  new JFrame();
        painelGeral = new JPanel();
        painelBotão = new JPanel();
        eliminadas = new ArrayList();
        temp = manager.getLista();




        botão = new JButton();
        botão.setText("Submit");
        botão.setFocusable(false);
        botão.addActionListener(new ButtonListener());

        botão2 = new JButton();
        botão2.setText("Cancel operation");
        botão2.setFocusable(false);
        botão2.addActionListener(new ButtonListener());


        frame.setTitle("Delete a company");
        frame.setSize(500,500);

        frame.setVisible(true);

        String[] colunas = {"Company name","Type of business","District","Annual expense","Annual revenue","Profit (yes/no)","Delete?"};

        ArrayList<Company> emp = manager.getLista();
        Object[][] dados = new Object[emp.size()][7];


        for(int i=0;i<emp.size();i++){
            dados[i][0] = emp.get(i).getNome();

            dados[i][1] = emp.get(i).getTipo();
            dados[i][2] = emp.get(i).getDistrito();
            double despesa = emp.get(i).calculaDespesas();
            double receita = emp.get(i).calculaReceitas();
            double lucro = emp.get(i).calculaLucro();

            dados[i][3] = String.valueOf(despesa);
            dados[i][4] = String.valueOf(receita);
            if(lucro>0){
                dados[i][5] = "YES";
            }
            else{
                dados[i][5] = "NO";
            }

            //checkBox = new JCheckBox("Eliminar");

            dados[i][6] = false;

        }

        myData = new MyTableModel(colunas,dados);


        //JTable table = new JTable(dados, colunas);

        JTable table = new JTable(myData);


        table.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent e) {
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();

                if(table.getValueAt(row,column).equals(true)){
                    eliminadas.add(temp.get(row));

                }

                else{


                    eliminadas.remove(row);


                }


            }
        });



        painelGeral.setLayout(new BorderLayout());


        painelGeral.add(new JScrollPane(table));


        painelBotão.add(botão);
        painelBotão.add(botão2);
        painelGeral.add(painelBotão, BorderLayout.SOUTH);


        frame.add(painelGeral);
        frame.setVisible(true);







    }




    /**
     * Classe utilizada para representar o modelo da nossa tabela, alguns métodos foram override para ajustar o comportamento
     * da tebela às nossas necessidades
     */
    private class MyTableModel extends AbstractTableModel {

        /**
         * Títulos de cada coluna
         */
        private String[] colunas;

        /**
         * ArrayList auxiliar, apenas utilizada para conseguir calcular o número de empresas
         */
        ArrayList<Company> emp = manager.getLista();

        /**
         * Dados utilizados para preencher as células
         */
        private Object[][] dados = new String[emp.size()][6];

        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        public MyTableModel(){

        }

        /**
         * Construtor do modelo da tabela, recebe dados necessários para inicializar atributos
         * @param colunas array de strings com os títulos de cada coluna
         * @param dados array de arrays do tipo Object com todos os dados necessários para preencher todas as células da tabela, foi necessário utilizar este tipo de array para este poder suportar um elemento do tipo Boolean, necessário para o medelo da tabela o renderizar numa check box
         */
        public MyTableModel(String[] colunas,Object[][] dados){
            this.colunas = colunas;
            this.dados = dados;

        }


        /**
         * Método getter que retorna o número de colunas da tabela
         * @return número de colunas da tabela
         */
        public int getColumnCount() {
            return colunas.length;
        }

        /**
         * Método getter que retorna o número de linhas da tabela
         * @return número de linhas da tabela
         */
        public int getRowCount() {
            return dados.length;
        }

        /**
         * Método getter que retorna o título de uma coluna
         * @param col  coluna cujo título queremos saber
         * @return título de uma coluna no índice col
         */
        public String getColumnName(int col) {
            return colunas[col];
        }

        /**
         * Método getter que retorna o valor de uma célula numa posição específica
         * @param row fila onde está o valor que queremos adquirir
         * @param col coluna onde está o valor que queremos adquirir
         * @return Valor de uma célula específica
         */
        public Object getValueAt(int row, int col) {
            return dados[row][col];
        }

        /**
         * Método getter que é necessário para a tabela gerar um renderizador e editor predefinido para a coluna selecionada
         * @param c  indice da coluna selecionada
         * @return  Super classe mais indicada para cada célula em cada coluna
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        /**
         * Método que define quais células podem ser editadas pelo utilizador
         * @param row  fila selecionada
         * @param col coluna selecionada
         * @return true se a célula selecionada estiver na 6a coluna, false caso contrário
         */
        public boolean isCellEditable(int row, int col) {

            if (col ==6){
                return true;
            }
            else{
                return false;
            }
        }

        /**
         * Método setter que permite atribuir um valor a uma célula
         * @param value   valor a atribuir à célula
         * @param row   linha da célula
         * @param col  coluna da célula
         */
        public void setValueAt(Object value, int row, int col) {
            dados[row][col] = value;
            fireTableCellUpdated(row, col);
        }




    }













}
