

import java.io.File;

/**
 * Classe utilizada para representar uma frutaria
 */
public class FruitShop extends GroceryStore {

    /**
     * Número de produtos
     */
    private int numeroProdutos;
    /**
     * valor médio de faturação anual por produto
     */
    private double faturacaoAnualProduto;

    /**
     * Construtor vazio, serve apenas para alocar espaço
     */
    public FruitShop(){
        super();

    }


    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome da frutaria
     * @param distrito distrito da frutaria
     * @param localização coordenadas da frutaria
     * @param numeroProdutos número de produtos da frutaria
     * @param faturacaoAnualProduto valor médio de faturação anual por produto
     * @param custoAnualLimpeza custo anual da limpeza do estabelecimento
     */
    public FruitShop(String nome, String distrito, GPS localização, int numeroProdutos, double faturacaoAnualProduto, double custoAnualLimpeza){
        super(nome,distrito,localização,custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoAnualProduto = faturacaoAnualProduto;

    }


    /**
     * Método setter para atribuir o número de produtos
     * @param n número de produtos
     */
    public void setNumeroProdutos(int n){
        this.numeroProdutos = numeroProdutos;
    }

    /**
     * Método setter para atribuir o valor médio de faturação anual por produto
     * @param n valor médio de faturação anual por produto
     */
    public void setFaturacaoAnualProduto(double n){
        this.faturacaoAnualProduto = n;

    }


    /**
     * Método getter que retorna o número de produtos
     * @return número de produtos
     */
    public int getNumeroProdutos(){
        return this.numeroProdutos;
    }

    /**
     * Método getter que retorna o valor médio de faturação anual por produto
     * @return valor médio de faturação anual por produto
     */
    public double getFaturacaoAnualProduto() {
        return faturacaoAnualProduto;
    }


    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a frutaria
     * @return String formatada
     */
    public String toString() {
        System.out.println("Informação frutaria: ");
        return "Nome: " + this.nome + "\n" + "Distrito: " + this.distrito + "\n" + "Localização: " + localização.toString()+"\n"+"Número de produtos: "+this.numeroProdutos+"\n"+"Faturação anual por cada produto: "+this.faturacaoAnualProduto+"\n"+"Custo anual da limpeza: "+this.custoAnualLimpeza+"\n";


    }


    /**
     * Método que calcula as receitas da frutaria
     * @return receitas da frutaria
     */
    @Override
    public double calculaReceitas(){
        return this.numeroProdutos*this.faturacaoAnualProduto;

    }

    /**
     * Método que calcula as despesas da frutaria
     * @return despesas da frutaria
     */
    @Override
    public  double calculaDespesas(){
        return this.custoAnualLimpeza;

    }

    /**
     * Método que calcula o lucro da frutaria
     * @return lucro da frutaria
     */
    @Override
    public double calculaLucro(){
        double receita = this.calculaReceitas();
        double despesa = this.calculaDespesas();

        return receita-despesa;


    }

    /**
     *  Método que identifica de que tipo de empresa se trata a frutaria, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Fruit shop";
    }

    /**
     * Método que permite adicionar um objeto do tipo "Frutaria" à ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){
        manager.addListaFrutaria(this);


    }


    /**
     * Método que permite eliminar um objeto do tipo "Frutaria" da ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaFrutaria(this);

    }

    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditFruitShopWindowGUI editarFrutaria = new EditFruitShopWindowGUI(manager,this,f);
    }



}