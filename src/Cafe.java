



import java.io.File;

/**
 * Classe utilizada para representar um café
 */
public class Cafe extends RestaurantBusiness {
    /**
     * Número médio de cafés vendidos por dia
     */
    private double numeroMedioCafesDia;
    /**
     * Valor médio faturado num ano por café vendido por dia
     */
    private double faturacaoAnual;

    /**
     * Construtor vazio, apenas serve para alocar espaço
     */
    public Cafe() {
        super();


    }


    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome do café
     * @param distrito distrito do café
     * @param localização coordenadas do café
     * @param salarioAnualMedio salário anual médio dos empregados do café
     * @param numeroEmpregadosMesa número de empregados de mesa do café
     * @param numeroMedioClientesDia número médio de clientes por dia
     * @param numeroMedioCafesDia número médio de cafés vendido por dia
     * @param faturacaoAnual Valor médio faturado num ano por café vendido por dia
     */
    public Cafe(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, double numeroMedioCafesDia, double faturacaoAnual) {
        super(nome, distrito, localização,salarioAnualMedio, numeroEmpregadosMesa,numeroMedioClientesDia);
        this.numeroMedioCafesDia = numeroMedioCafesDia;
        this.faturacaoAnual = faturacaoAnual;
    }


    /**
     * Método setter para atribuir o número médio de cafés vendido por dia ao café
     * @param n número médio de cafés vendidos por dia
     */

    public void setNumeroMedioCafesDia(double n) {
        this.numeroMedioCafesDia = n;
    }

    /**
     * Método setter para atribuir o valor médio faturado num ano por café vendido por dia
     * @param n valor médio faturado num ano por café vendido por dia
     */
    public void setFaturacaoAnual(double n) {
        this.faturacaoAnual = n;
    }


    /**
     * Método getter que retorna o número médio de cafés vendidos por dia
     * @return número médio de cafés vendidos por dia
     */
    public double getNumeroMedioCafesDia() {
        return numeroMedioCafesDia;
    }

    /**
     * Método getter que retorna o Valor médio faturado num ano por café vendido por dia
     * @return Valor médio faturado num ano por café vendido por dia
     */
    public double getFaturacaoAnual() {
        return faturacaoAnual;
    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre o café
     * @return String formatada
     */
    public String toString() {
        System.out.println("Informação café: ");
        return "Nome: " + this.nome + "\n" + "Distrito: " + this.distrito + "\n" + "Localização: " + localização.toString() + "\n" + "Despesa: "+ "\n" + "Salário anual médio: " + this.salarioAnualMedio + "€" + "\n" + "Número de empregados de mesa: " + this.numeroEmpregadosMesa + "\n" + "Número médio de clientes por dia: " + this.numeroMedioClientesDia + "\n" + "Número médio de cafés vendidos por dia: " + this.numeroMedioCafesDia + "\n" + "Faturação anual: " + this.faturacaoAnual+"\n";


    }

    /**
     * Método para calcular a receita do café
     * @return receitas do café
     */
    @Override
    public double calculaReceitas(){
        return this.numeroMedioCafesDia*this.faturacaoAnual;

    }

    /**
     * Método para calcular as despesas do café
     * @return despesas do café
     */
    @Override
    public  double calculaDespesas(){
        return this.numeroEmpregadosMesa*this.salarioAnualMedio;

    }

    /**
     * Método para calcular o lucro do café
     * @return lucro do café
     */
    @Override
    public double calculaLucro(){
        double receitas = this.calculaReceitas();
        double despesas = this.calculaDespesas();

        return receitas-despesas;

    }

    /**
     * Método que identifica de que tipo de empresa se trata o café, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Cafe";
    }

    /**
     * Método que permite adicionar um objeto do tipo "Café" à ArrayList auxiliar correta
     * @param manager Objeto manager com todas as informações sobre as ArrayLists e métodos associados a estas

     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){

        manager.addListaCafe(this);


    }

    /**
     * Método que permite eliminar um objeto do tipo "Café" da ArrayList auxiliar correta
     * @param manager Objeto manager com todas as informações sobre as ArrayLists e métodos associados a estas

     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaCafe(this);

    }

    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager com todas as informações sobre as ArrayLists e métodos associados a estas

     * @param f Ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditCafeWindowGUI editarCafe = new EditCafeWindowGUI(manager,this,f);

    }


}
