

import java.io.File;

/**
 * Classe utilizada para representar um restaurante de fast food
 */
public class FastFoodRestaurant extends Restaurant {
    /**
     * Número médio de clientes do drive-thru
     */
    private double numeroClientesDriveThru;

    /**
     * valor médio diário de faturação por cada cliente do drive-thru
     */
    private double faturacaoClienteDriveThru;

    /**
     * Construtor vazio, apenas serve para alocar espaço de memória
     */
    public FastFoodRestaurant() {
        super();

    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome do restaurante de fast food
     * @param distrito distrito do restaurante de fast food
     * @param localização localização do restaurante de fast food
     * @param salarioAnualMedio salário anual médio
     * @param numeroEmpregadosMesa número de empregados de mesa
     * @param numeroMedioClientesDia número médio de clientes por dia
     * @param numeroDiasFuncional número de dias funcional por ano
     * @param numeroMesasInteriores número de mesas interiores
     * @param faturacaoDiariaMesa faturação diária por mesa
     * @param numeroClientesDriveThru número de clientes do drive-thru
     * @param faturacaoDiariaDriveThru valor médio diário de faturação por cada cliente do drive-thru
     */
    public FastFoodRestaurant(String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa, double numeroClientesDriveThru, double faturacaoDiariaDriveThru) {
        super(nome, distrito, localização, salarioAnualMedio, numeroEmpregadosMesa, numeroMedioClientesDia, numeroDiasFuncional,numeroMesasInteriores,faturacaoDiariaMesa);
        this.faturacaoDiariaMesa = faturacaoDiariaMesa;
        this.numeroClientesDriveThru = numeroClientesDriveThru;
        this.faturacaoClienteDriveThru = faturacaoDiariaDriveThru;
    }


    /**
     * Método getter que retorna o número médio de clientes por dia do drive-thru
     * @return número médio de clientes por dia do drive-thru
     */
    public double getNumeroClientesDriveThru() {
        return this.numeroClientesDriveThru;
    }


    /**
     * Método getter que retorna o valor médio de faturação por cada cliente do drive-thru
     * @return valor médio diário de faturação por cada cliente do drive-thru
     */
    public double getFaturacaoClienteDriveThru() {
        return this.faturacaoClienteDriveThru;
    }

    /**
     * Método setter que permite atribuir o valor do número médio de clientes do drive-thru
     * @param n número médio de clientes do drive-thru
     */
    public void setNumeroClientesDriveThru(int n) {
        this.numeroClientesDriveThru = n;
    }

    /**
     * Método setter que permite atribuir o valor da faturação por cliente do drive-thru
     * @param f valor médio de faturação por cada cliente do drive-thru
     */
    public void setFaturacaoClienteDriveThru(double f) {
        this.faturacaoClienteDriveThru = f;

    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre o restaurante de fast food
     * @return String formatada
     */
    public String toString(){
        System.out.println("Informação restaurante de fast food: ");
        return "Nome: "+this.nome+"\n"+"Distrito: "+this.distrito+"\n"+"Localização: "+localização.toString()+"\n"+"Salário anual médio: "+this.salarioAnualMedio+"€"+"\n"+"Número de empregados de mesa: "+this.numeroEmpregadosMesa+"\n"+"Número médio de clientes por dia: "+this.numeroMedioClientesDia+"\n"+"Número de dias por ano em que está aberto: "+this.numeroDiasFuncional+"\n"+"Número de mesas interiores: "+this.numeroMesasInteriores+"\n"+"Faturação média por mesa: "+ this.faturacaoDiariaMesa+"€"+"\n"+"Número médio de clientes do drive-thru por dia: "+this.numeroClientesDriveThru+"\n"+"Faturação diária média do driveThru: "+this.faturacaoClienteDriveThru +"€"+"\n"+"Receitas anuais: "+this.calculaReceitas()+"\n"+"Despesas anuais: "+this.calculaDespesas()+"\n"+"Lucro anual: "+this.calculaLucro()+"\n"+"Capacidade de clientes: "+this.numeroMedioClientesDia+"\n";
    }

    /**
     * Método que permite calcular as receitas do restaurante de fast food
     * @return receitas do restaurante de fast food
     */
    @Override
    public double calculaReceitas(){
        /*
        (Número de mesas interiores X valor médio de
faturação de cada mesa por dia + número de médio
diário de clientes drive-thru X valor médio de
faturação por cada cliente drive-thru) X número de
dias de funcionamento por ano
         */


        return (this.numeroMesasInteriores*this.faturacaoDiariaMesa+this.numeroClientesDriveThru*this.faturacaoClienteDriveThru)*this.numeroDiasFuncional;


    }

    /**
     * Método que permite calcular as despesas do restaurante de fast food
     * @return despesas do restaurante de fast food
     */
    @Override
    public double calculaDespesas(){
        return this.numeroEmpregadosMesa*this.salarioAnualMedio;

    }

    /**
     * Método que permite calcular o lucro do restaurante de fast food
     * @return lucro do restaurante de fast food
     */
    @Override
    public double calculaLucro(){
        double receita = this.calculaReceitas();
        double despesa = this.calculaDespesas();

        return receita-despesa;


    }

    /**
     *  Método que identifica de que tipo de empresa se trata o restaurante de fast food, apenas utilizado para preencher tabelas com o tipo correto
     * @return tipo da empresa
     */
    @Override
    public String getTipo(){
        return "Fast food restaurant";
    }


    /**
     * Método que permite adicionar um objeto do tipo "RestauranteFastFood" à ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void adicionarListaEspecifica(StarThriveManager manager){
        manager.addListaFastFood(this);

    }

    /**
     * Método que permite eliminar um objeto do tipo "RestauranteFastFood" da ArrayList auxiliar correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    @Override
    public void eliminarListaEspecifica(StarThriveManager manager){
        manager.eliminarListaFastFood(this);

    }


    /**
     * Método que permite abrir a janela de edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    @Override
    public void abrirJanelaEspecifica(StarThriveManager manager, File f){
        EditFastFoodRestaurantWindowGUI editarRestauranteFastFood = new EditFastFoodRestaurantWindowGUI(manager,this,f);
    }


}