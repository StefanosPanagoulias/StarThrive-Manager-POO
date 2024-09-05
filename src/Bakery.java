

import java.io.File;

/**
 * Classe utilizada para representar uma pastelaria
 */
public class Bakery extends RestaurantBusiness {
    /**
     * Número médio de bolos vendidos por dia
     */
    private double numeroMedioBolosDia;

    /**
     * valor médio de faturação anual por bolo vendido por dia
     */
    private double faturacaoAnualMediaBolo;

    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public Bakery(){
        super();
    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome da pastelaria
     * @param distrito distrito da pastelaria
     * @param localização localização da pastelaria
     * @param salarioAnualMedio salário anual médio dos empregados
     * @param numeroEmpregadosMesa número de empregados de mesa
     * @param numeroMedioClientesDia número médio de clientes por dia
     * @param numeroMedioBolosDia número médio de bolos vendidos por dia
     * @param faturacaoAnualMediaBolo faturação anual média por bolo vendido por dia
     */
    public Bakery(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, double numeroMedioBolosDia, double faturacaoAnualMediaBolo){
        super(nome, distrito, localização, salarioAnualMedio, numeroEmpregadosMesa,numeroMedioClientesDia);
        this.numeroMedioBolosDia = numeroMedioBolosDia;
        this.faturacaoAnualMediaBolo = faturacaoAnualMediaBolo;
    }


    /**
     * Método setter que permite atribuir o valor do número médio de clientes por dia
     * @param n número médio de clientes por dia
     */
    public void setNumeroMedioClientesDia(double n){
        this.numeroMedioClientesDia = n;
    }

    /**
     * Método setter que permite atribuir o valor do número médio de bolos vendidos por dia
     * @param n número médio de bolos vendidos por dia
     */
    public void setNumeroMedioBolosDia(double n){
        this.numeroMedioBolosDia = n;

    }

    /**
     * Método setter que permite atribuir o valor da faturação anual média por bolo vendido por dia
     * @param n faturação anual média por bolo vendido por dia
     */
    public void setFaturacaoAnualMediaBolo(double n){
        this.faturacaoAnualMediaBolo = n;
    }

    /**
     * Método setter que retorna o número médio de bolos vendido por dia
     * @return número médio de bolos vendido por dia
     */
    public double getNumeroMedioBolosDia(){
        return this.numeroMedioBolosDia;
    }

    /**
     * Método getter que retorna a faturação anual média por bolo vendido por dia
     * @return faturação anual média por bolo vendido por dia
     */
    public double getFaturacaoAnualMediaBolo() {
        return faturacaoAnualMediaBolo;
    }


    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a pastelaria
     * @return String formatada
     */
    public String toString() {
        System.out.println("Informação pastelaria: ");
        return "Nome: " + this.nome + "\n" + "Distrito: " + this.distrito + "\n" + "Localização: " + localização.toString()+ "\n" + "Salário anual médio: " + this.salarioAnualMedio + "€" + "\n" + "Número de empregados de mesa: " + this.numeroEmpregadosMesa + "\n" + "Número médio de clientes por dia: " + this.numeroMedioClientesDia + "\n" + "Número médio de bolos vendidos por dia: " + this.numeroMedioBolosDia + "\n" + "valor médio de faturação anual por bolo vendido por dia: " + this.faturacaoAnualMediaBolo+"\n";


    }

    /**
     * Método que permite calcular as receitas da pastelaria
     * @return receitas da pastelaria
     */
    @Override
    public double calculaReceitas(){
        return this.numeroMedioBolosDia*this.faturacaoAnualMediaBolo;

    }

    /**
     * Método que permite calcular as despesas da pastelaria
     * @return despesas da pastelaria
     */
    @Override
    public  double calculaDespesas(){
        return this.numeroEmpregadosMesa*this.salarioAnualMedio;

    }

    /**
     * Método que permite calcular o lucro da pastelaria
     * @return lucro da pastelaria
     */
    @Override
    public double calculaLucro(){
        double receita = this.calculaReceitas();
        double despesa = this.calculaDespesas();

        return receita-despesa;


    }

    /**
     *  Método que identifica de que tipo de empresa se trata a pastelaria, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Bakery";
    }

    /**
     * Método que permite adicionar um objeto do tipo "Pastelaria" à ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){
        manager.addListaPastelaria(this);


    }

    /**
     * Método que permite eliminar um objeto do tipo "Pastelaria" da ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaPastelaria(this);

    }

    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditBakeryWindowGUI editarPastelaria = new EditBakeryWindowGUI(manager,this,f);
    }


}
