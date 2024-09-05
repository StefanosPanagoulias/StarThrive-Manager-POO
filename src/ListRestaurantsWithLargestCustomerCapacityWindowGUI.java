

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

/**
 * Classe utilizada para representar a janela que permite listar os dois restaurantes com a maior capacidade de clientes por dia
 */
public class ListRestaurantsWithLargestCustomerCapacityWindowGUI extends JFrame {

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
     * botão que permite terminar a operação
     */
    private JButton botão;

    /**
     * painel geral da janela ao qual vai ser adicionado o painel do botão
     */
    private JPanel painelGeral;

    /**
     * painel do botão
     */
    private JPanel painelBotão;

    /**
     * Objeto do tipo do modelo criado para a tabela
     */
    private TableModel myData;


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
         * Método actionPerformed, recebe o evento de um botão ser selecionado.
         * Neste caso, o botão apenas permite terminar a operação, portanto a janela atual é eliminada e voltamos à janela anterior
         * @param e evento de um click do rato num botão
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botão) {
                frame.dispose();
                MenuWindowGUI menu = new MenuWindowGUI(manager,f);
            }
        }
    }

    /**
     * Construtor da classe, recebe os dados necessários para inicializar atributos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos
     */
    public ListRestaurantsWithLargestCustomerCapacityWindowGUI(StarThriveManager manager, File f) {


        this.manager = manager;
        this.f = f;

        frame = new JFrame();
        painelGeral = new JPanel();
        painelBotão = new JPanel();




        botão = new JButton();
        botão.setText("OK");
        botão.setFocusable(false);
        botão.addActionListener(new ButtonListener());


        frame.setSize(500, 500);



        String[] colunas = {"Company name","Company type","District","Annual Expense","Annual Revenue","Profit (yes/no)","Customer Capacity"};

        ArrayList<Restaurant> maisLugares = manager.getMaiorCapacidadeClientes(manager.getRestaurantes());
        String[][] dados = new String[maisLugares.size()][7];


        for(int i=0;i<maisLugares.size();i++){
            dados[i][0] = maisLugares.get(i).getNome();

            dados[i][1] = maisLugares.get(i).getTipo();
            dados[i][2] = maisLugares.get(i).getDistrito();
            double despesa = maisLugares.get(i).calculaDespesas();
            double receita = maisLugares.get(i).calculaReceitas();
            double lucro = maisLugares.get(i).calculaLucro();

            dados[i][3] = String.valueOf(despesa);
            dados[i][4] = String.valueOf(receita);
            if(lucro>0){
                dados[i][5] = "YES";
            }
            else{
                dados[i][5] = "NO";
            }

            double lugares = maisLugares.get(i).getNumeroMedioClientesDia();
            dados[i][6] = String.valueOf(lugares);



        }

        myData = new MyTableModel(colunas,dados);


        //JTable table = new JTable(dados, colunas);

        JTable table = new JTable(myData);

        painelGeral.setLayout(new BorderLayout());


        painelGeral.add(new JScrollPane(table));


        painelBotão.add(botão);
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
        private String[][] dados = new String[emp.size()][6];

        /**
         * Construtor vazio, apenas serve para alocar espaço de memória
         */
        public MyTableModel() {

        }

        /**
         * Construtor do modelo da tabela, recebe dados necessários para inicializar atributos
         *
         * @param colunas array de strings com os títulos de cada coluna
         * @param dados   array de arrays do tipo Object com todos os dados necessários para preencher todas as células da tabela, foi necessário utilizar este tipo de array para este poder suportar um elemento do tipo Boolean, necessário para o medelo da tabela o renderizar numa check box
         */
        public MyTableModel(String[] colunas, String[][] dados) {
            this.colunas = colunas;
            this.dados = dados;

        }

        /**
         * Método getter que retorna o número de colunas da tabela
         *
         * @return número de colunas da tabela
         */
        public int getColumnCount() {
            return colunas.length;
        }

        /**
         * Método getter que retorna o número de linhas da tabela
         *
         * @return número de linhas da tabela
         */
        public int getRowCount() {
            return dados.length;
        }

        /**
         * Método getter que retorna o título de uma coluna
         *
         * @param col coluna cujo título queremos saber
         * @return título de uma coluna no índice col
         */
        public String getColumnName(int col) {
            return colunas[col];
        }

        /**
         * Método getter que retorna o valor de uma célula numa posição específica
         *
         * @param row fila onde está o valor que queremos adquirir
         * @param col coluna onde está o valor que queremos adquirir
         * @return Valor de uma célula específica
         */
        public Object getValueAt(int row, int col) {
            return dados[row][col];
        }

        /**
         * Método que avalia se uma célula é editável pelo utilizador, neste caso não é permitida que nenhuma célula seja editada
         *
         * @param row linha selecionada
         * @param col coluna selecionada
         * @return false
         */
        public boolean isCellEditable(int row, int col) {

            return false;
        }


    }
}
