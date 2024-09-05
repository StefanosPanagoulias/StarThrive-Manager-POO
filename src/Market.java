

import java.io.File;

/**
 * Classe utilizada para representar um mercado
 */
public class Market extends GroceryStore {

    /**
     * Área dos corredores
     */
    private double areaCorredores;

    /**
     * Valor médio de faturação anual por m2
     */
    private double faturacaoAnualm2;

    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public Market(){
        super();

    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome do mercado
     * @param distrito distrito do mercado
     * @param localização localização do mercado
     * @param areaCorredores área dos corredores
     * @param faturacaoAnualm2 Valor médio de faturação anual por m2
     * @param custoAnualLimpeza custo anual da limpeza
     */
    public Market(String nome, String distrito, GPS localização, double areaCorredores, double faturacaoAnualm2, double custoAnualLimpeza){
        super(nome,distrito,localização,custoAnualLimpeza);
        this.areaCorredores = areaCorredores;
        this.faturacaoAnualm2 = faturacaoAnualm2;

    }

    /**
     * Método setter que permite atribuir o valor da área dos corredores
     * @param area valor da área dos corredores
     */
    public void setAreaCorredores(double area){
        this.areaCorredores = area;
    }

    /**
     * Método setter que permite atribuir o valor da faturação anual por m2
     * @param faturacao valor da faturação anual por m2
     */
    public void setFaturacaoAnualm2(double faturacao){
        this.faturacaoAnualm2 = faturacao;
    }

    /**
     * Método getter que retorna o valor da área dos corredores
     * @return área dos corredores
     */
    public double getAreaCorredores(){
        return this.areaCorredores;
    }

    /**
     * Método getter que retorna o valor anual faturado por metro quadrado
     * @return valor anual faturado por metro quadrado
     */
    public double getFaturacaoAnualm2(){
        return this.faturacaoAnualm2;
    }

    /**
     * Método que permite calcular as receitas do mercado
     * @return receitas do mercado
     */
    @Override
    public double calculaReceitas(){
        return this.areaCorredores*this.faturacaoAnualm2;

    }

    /**
     * Método que permite calcular as despesas do mercado
     * @return despesas do mercado
     */
    @Override
    public  double calculaDespesas(){
        return this.custoAnualLimpeza;

    }


    /**
     * Método que permite calcular o lucro do mercado
     * @return lucro do mercado
     */
    @Override
    public  double calculaLucro(){
        double receita = this.calculaReceitas();
        double despesa = this.calculaDespesas();

        return receita-despesa;


    }


    /**
     *  Método que identifica de que tipo de empresa se trata o mercado, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Market";
    }

    /**
     * Método que permite adicionar um objeto do tipo "Mercado" à ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){
        manager.addListaMercado(this);

    }

    /**
     * Método que permite eliminar um objeto do tipo "Mercado" da ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaMercado(this);

    }

    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditMarketWindowGUI editarMercado = new EditMarketWindowGUI(manager,this,f);
    }


    /**
     * Método toString que retorna uma String formatada com toda a informação sobre o mercado
     * @return String formatada
     */
    public String toString(){
        System.out.println("Informação do mercado: ");
        return"Nome: "+this.nome+"\n"+"Distrito: "+this.distrito+"\n"+"Localização: "+this.localização.toString()+"\n"+"Área dos corredores: "+this.areaCorredores+"\n"+"Faturação anual por metro quadrado: "+this.faturacaoAnualm2+"\n"+"Custo anual da limpeza: "+this.custoAnualLimpeza+"\n";
    }

}
