

import java.io.File;

/**
 * Classe utilizada para representar um restaurante local
 */
public class LocalRestaurant extends Restaurant {
    /**
     * Número de mesas na esplanada
     */
    private int numeroMesasEsplanada;

    /**
     * Custo da licença anual por cada mesa na esplanada
     */
    private double licencaAnualMesa;


    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public LocalRestaurant(){
        super();

    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome do restaurante local
     * @param distrito distrito do restaurante local
     * @param localização localização do restaurante local
     * @param salarioAnualMedio salário anual médio
     * @param numeroEmpregadosMesa número de empregados de mesa
     * @param numeroMedioClientesDia número médio de clientes por dia
     * @param numeroDiasFuncional número de dias por ano funcional
     * @param numeroMesasInteriores número de mesas interiores
     * @param faturacaoDiariaMesa faturação diária por mesa
     * @param numeroMesasEsplanada número de mesas na esplanada
     * @param licencaAnualMesa custo da licença anual por cada mesa na esplanada
     */
    public LocalRestaurant(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa, int numeroMesasEsplanada, double licencaAnualMesa){
        super(nome, distrito, localização, salarioAnualMedio, numeroEmpregadosMesa, numeroMedioClientesDia, numeroDiasFuncional,numeroMesasInteriores,faturacaoDiariaMesa);

        this.numeroMesasEsplanada = numeroMesasEsplanada;
        this.licencaAnualMesa = licencaAnualMesa;

    }

    /**
     * Método setter que permite atribuir o valor do número de mesas na esplanada
     * @param num número de mesas na esplanada
     */
   public void setNumeroMesasEsplanada(int num){
        this.numeroMesasEsplanada = num;
    }

    /**
     * Método setter que permite atribuir o valor do custo da licença anual por cada mesa na esplanada
     * @param v custo da licença anual por cada mesa na esplanada
     */
    public void setLicencaAnualMesa(double v){
        this.licencaAnualMesa = v;
    }


    /**
     * Método getter que retorna o número de mesas da esplana
     * @return número de mesas da esplana
     */
   public  int getNumeroMesasEsplanada(){
        return this.numeroMesasEsplanada;
    }

    /**
     * Método getter que retorna o custo da licença anual por cada mesa na esplanada
     * @return custo da licença anual por cada mesa na esplanada
     */
   public  double getLicencaAnualMesa(){
        return this.licencaAnualMesa;
    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre o restaurante local
     * @return String formatada
     */
    public String toString(){
        System.out.println("Informação restaurante local: ");
        return "Nome: "+this.nome+"\n"+"Distrito: "+this.distrito+"\n"+"Localização: "+localização.toString()+"\n"+"Salário anual médio: "+this.salarioAnualMedio+"€"+"\n"+"Número de empregados de mesa: "+this.numeroEmpregadosMesa+"\n"+"Número médio de clientes por dia: "+this.numeroMedioClientesDia+"\n"+"Número de dias por ano em que está aberto: "+this.numeroDiasFuncional+"\n"+"Número de mesas interiores: "+this.numeroMesasInteriores+"\n"+"Faturação média por mesa: "+ this.faturacaoDiariaMesa+"€"+"\n"+"Número de mesas na esplanada: "+this.numeroMesasEsplanada+"\n"+"Valor anual da licença por cada mesa de esplanada: "+this.licencaAnualMesa+"€"+"\n"+"Receitas anuais: "+this.calculaReceitas()+"\n"+"Despesas anuais: "+this.calculaDespesas()+"\n"+"Lucro anual: "+this.calculaLucro()+"\n"+"Capacidade de clientes: "+this.numeroMedioClientesDia+"\n";
    }

    /**
     * Método que permite calcular as receitas do restaurante local
     * @return receitas do restaurante de fast food
     */
    @Override
    public double calculaReceitas() {
        /*
        (Número de mesas interiores + número de mesas
        esplanada) X valor médio de faturação de cada
        mesa por dia X número de dias de funcionamento
         por ano
         */
        return (this.numeroMesasInteriores+this.numeroMesasEsplanada)*this.faturacaoDiariaMesa*this.numeroDiasFuncional;
    }

    /**
     * Método que permite calcular as despesas do restaurante local
     * @return despesas do restaurante de fast food
     */
    @Override
    public double calculaDespesas() {
        /*
        Número de empregados X média de
        salário anual + número de mesas na
        esplanada X custo de licença anual
        por mesa de esplanada
         */

        return this.numeroEmpregadosMesa*this.salarioAnualMedio+this.numeroMesasEsplanada*this.licencaAnualMesa;
    }

    /**
     * Método que permite calcular o lucro do restaurante de fast food
     * @return lucro do restaurante de fast food
     */
    @Override
    public double calculaLucro() {
        double receita = this.calculaReceitas();
        double despesa = this.calculaDespesas();

        return receita-despesa;
    }



    /**
     *  Método que identifica de que tipo de empresa se trata o restaurante local, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Local restaurant";
    }

    /**
     * Método que permite adicionar um objeto do tipo "RestauranteLocal" à ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){
        manager.addListaLocal(this);


    }


    /**
     * Método que permite eliminar um objeto do tipo "RestauranteLocal" da ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaLocal(this);

    }

    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditLocalRestaurantWindowGUI editarRestauranteLocal = new EditLocalRestaurantWindowGUI(manager,this,f);
    }


}
