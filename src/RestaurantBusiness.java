

/**
 * Classe utilizada parar representar uma empresa da área da restauração
 */
public abstract class RestaurantBusiness extends Company {
    /**
     * Salario anual médio pago aos empregados de mesa
     */
    protected double salarioAnualMedio;
    /**
     * Número de empregados de mesa
     */
    protected int numeroEmpregadosMesa;

    /**
     * Número médio de clientes por dia no estabelecimento
     */
    protected double numeroMedioClientesDia;


    /**
     * Construtor vazio, apenas serve para alocar espaço
     */
    public RestaurantBusiness(){
        super();

    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome da empresa
     * @param distrito distrito da empresa
     * @param localização localização da empresa
     * @param salarioAnualMedio salário anual médio dos empregados
     * @param numeroEmpregadosMesa número de empregados de mesa
     * @param numeroMedioClientesDia número médio de clientes por dia
     */
    public RestaurantBusiness(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia){
        super(nome,distrito,localização);
        this.salarioAnualMedio = salarioAnualMedio;
        this.numeroEmpregadosMesa = numeroEmpregadosMesa;
        this.numeroMedioClientesDia = numeroMedioClientesDia;


    }


    /**
     * Método getter que retorna o salário anual médio dos empregados
     * @return salário anual médio dos empregados
     */
    public double getSalarioAnualMedio(){
        return this.salarioAnualMedio;
    }

    /**
     * Método getter que retorna o número de empregados de mesa
     * @return número de empregados de mesa
     */
    public int getNumeroEmpregadosMesa(){
        return this.numeroEmpregadosMesa;
    }


    /**
     * Método setter que permite atribuir o valor do salário anual médio
     * @param s salário anual médio
     */
    public void setSalarioAnualMedio(double s){
        this.salarioAnualMedio = s;
    }

    /**
     * Método setter que permite atribuir o valor do número de empregados
     * @param n número de empregados
     */
    public void setNumeroEmpregadosMesa(int n){
        this.numeroEmpregadosMesa = n;
    }

    /**
     * Método getter que retorna o número médio de clientes por dia
     * @return número médio de clientes por dia
     */
    public double getNumeroMedioClientesDia(){
        return this.numeroMedioClientesDia;
    }

    /**
     * Método setter que permite atribuir o valor do número médio de clientes por dia
     * @param n número médio de clientes por dia
     */
    public void setNumeroMedioClientesDia(double n){
        this.numeroMedioClientesDia = n;
    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a empresa na área da restauração
     * @return String formatada
     */
    public String toString(){
        return "Informação sobre a empresa da área da restauração: \n"+"Nome: "+this.nome+"\n"+"Distrito: "+this.distrito+"\n"+"Localização: "+this.localização.toString()+"\n"+"Salário anual médio: "+this.salarioAnualMedio+"\n"+"Número de empregados: "+this.numeroEmpregadosMesa+"\n"+"Número médio de clientes por dia: "+this.numeroMedioClientesDia;
    }
}
