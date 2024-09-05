

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;


/**
 * Classe utilizada para representar a janela que permite listar empresas com características específicas
 */
public class ListCompaniesSpecificInfoWindowGUI extends JFrame {

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
     * painel geral ao qual vão ser adicionados outros paineis
     */
    private JPanel painelGeral;

    /**
     * painel ao qual vão ser adicionados as tabelas
     */
    private JPanel painelTabelas;

    /**
     * painel do botão
     */
    private JPanel painelBotão;

    /**
     * painel da tabela com as empresas com o maior lucro
     */
    private JPanel tabelaMaiorLucro;

    /**
     * painel da tabela com as empresas com a maior receita
     */
    private JPanel tabelaMaiorReceita;

    /**
     * painel da tabela com as empresas com a maior despesa
     */
    private JPanel tabelaMenorDespesa;

    /**
     * Objeto do tipo do modelo criado para a tabela
     */
    private TableModel myData1;

    /**
     * Objeto do tipo do modelo criado para a tabela
     */
    private TableModel myData2;

    /**
     * Objeto do tipo do modelo criado para a tabela
     */
    private TableModel myData3;

    /**
     * label das empresas com maior lucro
     */
    private JLabel maisLucro;

    /**
     * label das empresas com menor despesa
     */
    private JLabel menorDespesa;

    /**
     * label das empresas com maior receita
     */
    private JLabel maiorReceita;


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
    public ListCompaniesSpecificInfoWindowGUI(StarThriveManager manager, File f) {


        this.manager = manager;
        this.f = f;

        frame = new JFrame();
        painelGeral = new JPanel();
        painelBotão = new JPanel();
        painelTabelas = new JPanel();
        tabelaMaiorLucro = new JPanel();
        tabelaMaiorReceita = new JPanel();
        tabelaMenorDespesa = new JPanel();


        menorDespesa = new JLabel("Companies with the lowest expense");
        maiorReceita = new JLabel("Companies with the highest revenue");
        maisLucro = new JLabel("Companies with the highest profit");




        botão = new JButton();
        botão.setText("OK");
        botão.setFocusable(false);
        botão.addActionListener(new ButtonListener());


        frame.setSize(500, 500);
        frame.setTitle("Specific information about companies");





        String[] colunas1 = {"Company Type","Company Name","Annual Profit"};
        String[] colunas2 = {"Company Type","Company Name","Annual Revenue"};
        String[] colunas3 = {"Company Type","Company Name","Annual Expense"};



        ArrayList<Company> empMaiorLucro = manager.getEmpresasMaiorLucro();
        ArrayList<Company> empMaiorReceita = manager.getEmpresasMaiorReceita();
        ArrayList<Company> empMaiorDespesa = manager.getEmpresasMenorDespesa();


        String[][] dados1 = new String[empMaiorLucro.size()][3];
        String[][] dados2 = new String[empMaiorReceita.size()][3];
        String[][] dados3 = new String[empMaiorDespesa.size()][3];


        for(int i=0;i<empMaiorLucro.size();i++){

            dados1[i][0] = empMaiorLucro.get(i).getTipo();
            dados1[i][1] = empMaiorLucro.get(i).getNome();
            double lucro = empMaiorLucro.get(i).calculaLucro();
            dados1[i][2] = String.valueOf(lucro);


        }

        for(int j = 0;j<empMaiorReceita.size();j++){

            dados2[j][0] = empMaiorReceita.get(j).getTipo();
            dados2[j][1] = empMaiorReceita.get(j).getNome();
            double receita = empMaiorReceita.get(j).calculaReceitas();

            dados2[j][2] = String.valueOf(receita);

        }

        for(int k = 0;k<empMaiorDespesa.size();k++){
            dados3[k][0] = empMaiorDespesa.get(k).getTipo();
            dados3[k][1] = empMaiorDespesa.get(k).getNome();
            double despesa = empMaiorDespesa.get(k).calculaDespesas();

            dados3[k][2] = String.valueOf(despesa);

        }

        myData1 = new MyTableModel(colunas1,dados1);
        myData2 = new MyTableModel(colunas2,dados2);
        myData3 = new MyTableModel(colunas3,dados3);



        JTable table1 = new JTable(myData1);
        JTable table2 = new JTable(myData2);
        JTable table3 = new JTable(myData3);

        tabelaMaiorLucro.setLayout(new BorderLayout());
        tabelaMaiorReceita.setLayout(new BorderLayout());
        tabelaMenorDespesa.setLayout(new BorderLayout());

        tabelaMaiorLucro.add(new JScrollPane(table1));
        tabelaMaiorLucro.add(maisLucro,BorderLayout.SOUTH);
        tabelaMaiorReceita.add(new JScrollPane(table2));
        tabelaMaiorReceita.add(maiorReceita,BorderLayout.SOUTH);
        tabelaMenorDespesa.add(new JScrollPane(table3));
        tabelaMenorDespesa.add(menorDespesa,BorderLayout.SOUTH);


        painelGeral.setLayout(new BorderLayout());

        painelTabelas.add(tabelaMaiorLucro);
        painelTabelas.add(tabelaMaiorReceita);
        painelTabelas.add(tabelaMenorDespesa);


        painelGeral.add(painelTabelas);
        //painelGeral.add(new JScrollPane(table2));
        //painelGeral.add(new JScrollPane(table3));


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

