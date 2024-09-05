


/**
 * Classe utilizada para representar um restaurante
 */
public abstract class Restaurant extends RestaurantBusiness {
    /**
     * Número de dias por ano que o restaurante está aberto
     */
    protected int numeroDiasFuncional;

    /**
     * Número de mesas interiores no estabelecimento
     */
    protected int numeroMesasInteriores;

    /**
     * Faturação média de cada mesa por cada dia de funcionamento
     */
    protected double faturacaoDiariaMesa;

    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public Restaurant() {
        super();


    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome do restaurante
     * @param distrito distrito do restaurante
     * @param localização localização do restaurante
     * @param salarioAnualMedio salário anual médio
     * @param numeroEmpregadosMesa número de empregados de mesa
     * @param numeroMedioClientesDia número médio de clientes por dia
     * @param numeroDiasFuncional número de dias funcional por ano
     * @param numeroMesasInteriores número de mesas interiores
     * @param faturacaoDiariaMesa faturação diária por mesa
     */
    public Restaurant(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa) {
        super(nome, distrito, localização, salarioAnualMedio, numeroEmpregadosMesa,numeroMedioClientesDia);
        this.numeroMesasInteriores = numeroMesasInteriores;
        this.numeroDiasFuncional = numeroDiasFuncional;
        this.faturacaoDiariaMesa = faturacaoDiariaMesa;
    }

    /**
     * Método setter que permite atribuir o valor do número de mesas interiores
     * @param n número de mesas interiores
     */
    public void setNumeroMesasInteriores(int n){
        this.numeroMesasInteriores = n;
    }

    /**
     * Método setter que permite atribuir o valor do número de dias funcional por ano
     * @param n número de dias funcional por ano
     */
    public void setNumeroDiasFuncional(int n){
        this.numeroDiasFuncional = n;
    }

    /**
     * Método setter que permite atribuir o valor da faturação diária por mesa
     * @param v faturação diária por mesa
     */
    public void setFaturacaoDiariaMesa(double v){
        this.faturacaoDiariaMesa = v;

    }

    /**
     * Método getter que retorna o número de mesas interiores
     * @return número de mesas interiores
     */
    public int getNumeroMesasInteriores(){return this.numeroDiasFuncional;}

    /**
     * Método getter que retorna o número de dias funcional por ano
     * @return número de dias funcional por ano
     */
    public int getNumeroDiasFuncional() {
        return this.numeroDiasFuncional;
    }

    /**
     * Método getter que retorna o valor da faturação diária por mesa
     * @return faturação diária por mesa
     */
    public double getFaturacaoDiariaMesa(){return this.faturacaoDiariaMesa;}

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a empresa na área da restauração
     * @return String formatada
     */
    public String toString(){
        return "Informação Restaurante: \n"+"Nome: "+this.nome+"\n"+"Distrito: "+"\n"+this.distrito+"localização: "+this.localização.toString()+"\n"+"Salario anual médio: "+this.salarioAnualMedio+"\n"+"Número de empregados: "+this.numeroEmpregadosMesa+"\n"+"Número médio de clientes por dia: "+this.numeroMedioClientesDia+"\n"+"Número de dias por ano funcional: "+this.numeroDiasFuncional+"\n"+"Número de mesas interiores: "+this.numeroMesasInteriores+"\n"+"Faturação diária por mesa: "+this.faturacaoDiariaMesa;

    }


}