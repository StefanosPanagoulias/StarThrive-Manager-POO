

import java.io.File;
import java.io.Serializable;

/**
 * Classe utilizada para representar uma empresa
 */
public abstract class Company implements Serializable {

    /**
     * Nome da empresa
     */
    protected String nome;
    /**
     * Distrito da empresa
     */
    protected String distrito;
    /**
     * Coordenadas da empresa
     */
    protected GPS localização;


    /**
     * Construtor vazio, apenas serve para alocar espaço
     */
    public Company(){
    }


    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome nome da empresa
     * @param distrito distrito da empresa
     * @param localização coordenadas da empresa
     */
    public Company(String nome, String distrito, GPS localização){
        this.nome = nome;
        this.distrito = distrito;
        this.localização = localização;
    }


    /**
     * Método getter que retorna o nome da empresa
     * @return nome da empresa
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Método getter que retorna o distrito da empresa
     * @return distrito da empresa
     */
    public String getDistrito(){
        return this.distrito;

    }

    /**
     * Método getter que retorna as coordenadas da empresa
     * @return coordenadas da empresa
     */
    public GPS getLocalização(){
        return this.localização;
    }


    /**
     * Método setter para atribuir o nome da empresa
     * @param nome nome da empresa
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Método setter para atribuir o distrito da empresa
     * @param distrito distrito da empresa
     */
    public void setDistrito(String distrito){
        this.distrito = distrito;
    }

    /**
     * Método setter para atribuir as coordenadas da empresa
     * @param localização coordenadas da empresa
     */
    public void setLocalização(GPS localização){
        this.localização = localização;
    }

    /**
     * Método toString que imprime na consola informação sobre a empresa
     * @return String formatada
     */
    public String toString(){
        return "Nome da empresa: "+this.nome+" Distrito: "+this.distrito+"Localização: "+this.localização.toString();
    }

    /**
     * Método abstrato que permite a cada classe filha calcular as suas receitas específicas
     * @return receitas da empresa
     */
    public abstract double calculaReceitas();

    /**
     * Método abstrato que permite a cada classe filha calcular as suas despesas específicas
     * @return despesas da empresa
     */
    public abstract double calculaDespesas();

    /**
     * Método abstrato que permite a cada classe filha calcular o seu lucro
     * @return lucro da empresa
     */
    public abstract double calculaLucro();

    /**
     * Método abstrato que permite a cada classe filha retornar o tipo específico de empresa a que pertence, apenas utilizado para preencher tabelas
     * @return tipo específico de cada empresa
     */
    public abstract String getTipo();

    /**
     * Método abstrato que permite que cada classe filha seja adicionada à sua ArrayList específica
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     */
    public abstract void adicionarListaEspecifica(StarThriveManager manager);

    /**
     * Método abstrato que permite que cada classe filha seja eliminado da sua ArrayList específica
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas

     */
    public abstract void eliminarListaEspecifica(StarThriveManager manager);

    /**
     * Método abstrato que permite que cada classe filha abra a janela de  edição correta
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @param f ficheiro de objetos que vai ser atualizado
     */
    public abstract void abrirJanelaEspecifica(StarThriveManager manager, File f);


}
