


/**
 * Classe utilizada para representar uma mercearia
 */
public abstract class GroceryStore extends Company {
    /**
     * Custo anual da limpeza
     */
    protected double custoAnualLimpeza;

    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public GroceryStore(){
        super();
    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome da mercearia
     * @param distrito distrito da mercearia
     * @param localização localização da mercearia
     * @param custoAnualLimpeza custo anual da limpeza da mercearia
     */
    public GroceryStore(String nome, String distrito, GPS localização, double custoAnualLimpeza){
        super(nome,distrito,localização);
        this.custoAnualLimpeza = custoAnualLimpeza;

    }

    /**
     * Método getter que retorna o custo anual da limpeza
     * @return custo anual da limpeza
     */
    public double getCustoAnualLimpeza() {
        return custoAnualLimpeza;
    }

    /**
     * Método setter que permite atribuir o valor do custo anual da limpeza
     * @param n custo anual da limpeza
     */
    public void setCustoAnualLimpeza(double n){
        this.custoAnualLimpeza = n;
    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a mercearia
     * @return String formatada
     */
    public String toString(){
        return"Informação sobre a mercearia: \n"+"Nome: "+this.nome+"\n"+"Distrito: "+this.distrito+"\n"+"Localização: "+this.localização.toString()+"\n"+"Custo anual da limpeza: "+this.custoAnualLimpeza;
    }







}
