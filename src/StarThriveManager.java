

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Classe utilizada para representar um gestor responsável por todas as operações
 */
public class StarThriveManager {

    /**
     * ArrayList geral com todas as empresas
     */
    private ArrayList<Company> lista = new ArrayList<>();

    /**
     * ArrayList específica para restaurantes de fast food
     */
    private ArrayList<Company> listaFastFood = new ArrayList<>();

    /**
     * ArrayList específica para restaurantes locais
     */
    private ArrayList<Company> listaLocal = new ArrayList<>();

    /**
     * ArrayList específica para pastelarias
     */
    private ArrayList<Company> listaPastelaria = new ArrayList<>();

    /**
     * ArrayList específica para mercados
     */
    private ArrayList<Company> listaMercado = new ArrayList<>();

    /**
     * ArrayList específica para frutarias
     */
    private ArrayList<Company> listaFrutaria = new ArrayList<>();

    /**
     * ArrayList específica para cafés
     */
    private ArrayList<Company> listaCafe = new ArrayList<>();


    /**
     *Construtor vazio, apenas serve para alocar espaço de memória
     */
    public StarThriveManager() {

    }

    /**
     * Método que permite adicionar uma empresa à lista geral
     * @param e empresa que vai ser adicionada
     */
    public void addEmpresa(Company e) {
        lista.add(e);

    }


    /**
     * Método setter que permite atribuir a lista de empresas do tipo RestauranteFastFood
     * @param listaFastFood lista de empresas do tipo RestauranteFastFood
     */
    public void setListaFastFood(ArrayList<Company> listaFastFood){
        this.listaFastFood = listaFastFood;
    }

    /**
     * Método setter que permite atribuir a lista de empresas do tipo RestauranteLocal
     * @param listaLocal lista de empresas do tipo RestauranteLocal
     */
    public void setListaLocal(ArrayList<Company> listaLocal){
        this.listaLocal = listaLocal;
    }


    /**
     * Método setter que permite atribuir a lista de empresas do tipo Mercado
     * @param listaMercado lista de empresas do tipo Mercado
     */
    public void setListaMercado(ArrayList<Company> listaMercado){
        this.listaFastFood = listaMercado;
    }


    /**
     * Método setter que permite atribuir a lista de empresas do tipo Frutaria
     * @param listaFrutaria lista de empresas do tipo Frutaria
     */
    public void setListaFrutaria(ArrayList<Company> listaFrutaria){
        this.listaFrutaria = listaFrutaria;
    }


    /**
     * Método setter que permite atribuir a lista de empresas do tipo Cafe
     * @param listaCafe lista de empresas do tipo Cafe
     */
    public void setListaCafe(ArrayList<Company> listaCafe){
        this.listaCafe = listaCafe;
    }

    /**
     * Método getter que retorna a lista geral com todas as empresas
     * @return ArrayList geral com todas as empresas
     */
    public ArrayList<Company> getLista(){
        return this.lista;
    }

    /**
     * Método getter que retorna a lista de empresas do tipo RestauranteFastFood
     * @return ArrayList de empresas do tipo RestauranteFastFood
     */
    public ArrayList<Company> getListaFastFood(){
        return this.listaFastFood;
    }

    /**
     * Método getter que retorna a lista de empresas do tipo RestauranteLocal
     * @return ArrayList de empresas do tipo RestauranteLocal
     */
    public ArrayList<Company> getListaLocal(){
        return this.listaLocal;
    }


    /**
     * Método getter que retorna a lista de empresas do tipo Pastelaria
     * @return ArrayList de empresas do tipo Pastelaria
     */
    public ArrayList<Company> getListaPastelaria(){
        return this.listaPastelaria;
    }

    /**
     * Método getter que retorna a lista de empresas do tipo Mercado
     * @return ArrayList de empresas do tipo Mercado
     */
    public ArrayList<Company> getListaMercado(){
        return this.listaMercado;
    }


    /**
     * Método getter que retorna a lista de empresas do tipo Frutaria
     * @return ArrayList de empresas do tipo Frutaria
     */
    public ArrayList<Company> getListaFrutaria(){
        return this.listaFrutaria;
    }

    /**
     * Método getter que retorna a lista de empresas do tipo Cafe
     * @return ArrayList de empresas do tipo Cafe
     */
    public ArrayList<Company> getListaCafe(){
        return this.listaCafe;
    }


    /**
     * Método que permite adicionar uma empresa do tipo RestauranteFastFood  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaFastFood(Company e){
        listaFastFood.add(e);
    }

    /**
     * Método que permite adicionar uma empresa do tipo RestauranteLocal  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaLocal(Company e){
        listaLocal.add(e);
    }

    /**
     * Método que permite adicionar uma empresa do tipo Pastelaria  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaPastelaria(Company e){
        listaPastelaria.add(e);
    }

    /**
     * Método que permite adicionar uma empresa do tipo Mercado  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaMercado(Company e){
        listaMercado.add(e);
    }

    /**
     * Método que permite adicionar uma empresa do tipo Frutaria  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaFrutaria(Company e){
        listaFrutaria.add(e);
    }

    /**
     * Método que permite adicionar uma empresa do tipo Cafe  à sua lista específica
     * @param e empresa a ser adicionada à sua lista específica
     */
    public void addListaCafe(Company e){
        listaCafe.add(e);
    }

    /**
     * Método que permite eliminar uma empresa do tipo RestauranteFastFood da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaFastFood(Company e){
        for(int i = 0;i<listaFastFood.size();i++){
            if(listaFastFood.get(i).equals(e)){
                listaFastFood.remove(i);
            }
        }
    }

    /**
     * Método que permite eliminar uma empresa do tipo RestauranteLocal da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaLocal(Company e){
        for(int i = 0;i<listaLocal.size();i++){
            if(listaLocal.get(i).equals(e)){
                listaLocal.remove(i);
            }
        }
    }


    /**
     * Método que permite eliminar uma empresa do tipo Mercado da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaMercado(Company e){
        for(int i = 0;i<listaMercado.size();i++){
            if(listaMercado.get(i).equals(e)){
                listaMercado.remove(i);
            }
        }
    }


    /**
     * Método que permite eliminar uma empresa do tipo Frutaria da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaFrutaria(Company e){
        for(int i = 0;i<listaFrutaria.size();i++){
            if(listaFrutaria.get(i).equals(e)){
                listaFrutaria.remove(i);
            }
        }
    }


    /**
     * Método que permite eliminar uma empresa do tipo Cafe da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaCafe(Company e){
        for(int i = 0;i<listaCafe.size();i++){
            if(listaCafe.get(i).equals(e)){
                listaCafe.remove(i);
            }
        }
    }


    /**
     * Método que permite eliminar uma empresa do tipo Pastelaria da sua lista específica
     * @param e empresa a ser eliminada
     */
    public void eliminarListaPastelaria(Company e){
        for(int i = 0;i<listaPastelaria.size();i++){
            if(listaPastelaria.get(i).equals(e)){
                listaPastelaria.remove(i);
            }
        }
    }


    /**
     * Método que retorna a empresa com o maior lucro
     * @param input ArrayList de empresas
     * @return empresa com o maior lucro da ArrayList fornecida
     */
    public Company getMaiorLucro(ArrayList<Company> input){
        Company maior = input.get(0);

        for(int i=0;i<input.size();i++){
            if(input.get(i).calculaLucro()>maior.calculaLucro()){
                maior = input.get(i);
            }
        }

        return maior;
    }

    /**
     * Método que retorna a empresa com o maior receita
     * @param input ArrayList de empresas
     * @return empresa com o maior receita da ArrayList fornecida
     */
    public Company getMaiorReceita(ArrayList<Company> input){
        Company maior = input.get(0);

        for(int i=0;i<input.size();i++){
            if(input.get(i).calculaReceitas()>maior.calculaReceitas()){
                maior = input.get(i);
            }
        }

        return maior;

    }

    /**
     * Método que retorna a empresa com o menor despesa
     * @param input ArrayList de empresas
     * @return empresa com a menor despesa da ArrayList fornecida
     */
    public Company getMenorDespesa(ArrayList<Company> input){

        Company menor = input.get(0);

        for(int i=0;i<input.size();i++){
            if(input.get(i).calculaDespesas()<menor.calculaDespesas()){
                menor = input.get(i);
            }
        }

        return menor;

    }

    /**
     * Método que retorna um Arraylist com todas as empresas de cada tipo específico com o maior lucro
     * @return Arraylist com todas as empresas de cada tipo específico com o maior lucro
     */
    public ArrayList<Company> getEmpresasMaiorLucro(){
        ArrayList<Company> maiores = new ArrayList<>();

        Company maiorFastFood = getMaiorLucro(listaFastFood);
        Company maiorLocal = getMaiorLucro(listaLocal);
        Company maiorPastelaria = getMaiorLucro(listaPastelaria);
        Company maiorMercado = getMaiorLucro(listaMercado);
        Company maiorFrutaria = getMaiorLucro(listaFrutaria);
        Company maiorCafe = getMaiorLucro(listaCafe);

        maiores.add(maiorFastFood);
        maiores.add(maiorLocal);
        maiores.add(maiorPastelaria);
        maiores.add(maiorMercado);
        maiores.add(maiorCafe);
        maiores.add(maiorFrutaria);

        return maiores;



    }

    /**
     * Método que retorna um Arraylist com todas as empresas de cada tipo específico com a maior receita
     * @return Arraylist com todas as empresas de cada tipo específico com a maior receita
     */
    public ArrayList<Company> getEmpresasMaiorReceita(){
        ArrayList<Company> maiores = new ArrayList<>();

        Company maiorFastFood = getMaiorReceita(listaFastFood);
        Company maiorLocal = getMaiorReceita(listaLocal);
        Company maiorPastelaria = getMaiorReceita(listaPastelaria);
        Company maiorMercado = getMaiorReceita(listaMercado);
        Company maiorFrutaria = getMaiorReceita(listaFrutaria);
        Company maiorCafe = getMaiorReceita(listaCafe);

        maiores.add(maiorFastFood);
        maiores.add(maiorLocal);
        maiores.add(maiorPastelaria);
        maiores.add(maiorMercado);
        maiores.add(maiorCafe);
        maiores.add(maiorFrutaria);

        return maiores;



    }


    /**
     * Método que retorna um Arraylist com todas as empresas de cada tipo específico com a menor despesa
     * @return Arraylist com todas as empresas de cada tipo específico com a menor despesa
     */
    public ArrayList<Company> getEmpresasMenorDespesa(){
        ArrayList<Company> maiores = new ArrayList<>();

        Company maiorFastFood = getMenorDespesa(listaFastFood);
        Company maiorLocal = getMenorDespesa(listaLocal);
        Company maiorPastelaria = getMenorDespesa(listaPastelaria);
        Company maiorMercado = getMenorDespesa(listaMercado);
        Company maiorFrutaria = getMenorDespesa(listaFrutaria);
        Company maiorCafe = getMenorDespesa(listaCafe);

        maiores.add(maiorFastFood);
        maiores.add(maiorLocal);
        maiores.add(maiorPastelaria);
        maiores.add(maiorMercado);
        maiores.add(maiorCafe);
        maiores.add(maiorFrutaria);

        return maiores;



    }


    /**
     * Método que retorna a ArrayList com os dois restaurantes com maior capacidade de clientes
     * @param input ArrayList com todos os restaurantes, independentemente do tipo
     * @return ArrayList com os dois restaurantes com maior capacidade de clientes
     */
    public ArrayList<Restaurant> getMaiorCapacidadeClientes(ArrayList<Restaurant> input){

        if(input==null||input.isEmpty()){
            return null;
        }

        int indiceMaior = 0;
        Restaurant maior = input.get(0);
        ArrayList<Restaurant> maiores = new ArrayList<>();
        ArrayList<Restaurant> aux = input;


        for(int i=0;i<input.size();i++){
            if(aux.get(i).getNumeroMedioClientesDia() > maior.getNumeroMedioClientesDia()){
                maior = input.get(i);
                indiceMaior = i;
            }

        }

        aux.remove(indiceMaior);

        Restaurant segundoMaior = aux.get(0);

        for(int j = 0;j<input.size();j++){
            if(aux.get(j).getNumeroMedioClientesDia() > segundoMaior.getNumeroMedioClientesDia()){
                segundoMaior = aux.get(j);

            }


        }

        maiores.add(maior);
        maiores.add(segundoMaior);


        return maiores;

    }


    /**
     * Método que imprime na consola todas as empresas
     */
    public void listarEmpresas() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo RestauranteFastFood
     */
    public void listarFastFood(){
        for(int i = 0;i<listaFastFood.size();i++){
            System.out.println(listaFastFood.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo RestauranteLocal
     */
    public void listarLocal(){
        for(int i = 0;i<listaLocal.size();i++){
            System.out.println(listaLocal.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo Pastelaria
     */
    public void listarPastelaria(){
        for(int i = 0;i<listaPastelaria.size();i++){
            System.out.println(listaPastelaria.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo Mercado
     */
    public void listarMercado(){
        for(int i = 0;i<listaMercado.size();i++){
            System.out.println(listaMercado.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo Cafe
     */
    public void listarCafe(){
        for(int i = 0;i<listaCafe.size();i++){
            System.out.println(listaCafe.get(i).toString());
        }
    }

    /**
     * Método que imprime na consola todas as empresas do tipo Frutaria
     */
    public void listarFrutaria(){
        for(int i = 0;i<listaFrutaria.size();i++){
            System.out.println(listaFrutaria.get(i).toString());
        }
    }


    /**
     * Método que permite eliminar uma empresa da ArrayList geral
     * @param company empresa a ser eliminada
     */
    public void eliminarEmpresa(Company company) {

        if (company == null) {
            System.out.println("Empresa não encontrada, tente novamente");
            return;
        }

        else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).equals(company)) {
                    lista.remove(i);
                }
            }
        }
    }

    /**
     * Método getter que retorna a ArrayList com todos os restaurantes, independentemente do tipo
     * @return ArrayList com todos os restaurantes, independentemente do tipo
     */
    public ArrayList<Restaurant> getRestaurantes(){
        ArrayList<Company> restaurantesLocais = getListaLocal();
        ArrayList<Company> restaurantesFastFood = getListaFastFood();
        ArrayList<Restaurant> restaurants = new ArrayList<>();



        int indiceRestauranteLocal;
        int indiceRestauranteFastFood;

        for(indiceRestauranteLocal = 0;indiceRestauranteLocal<restaurantesLocais.size();indiceRestauranteLocal++){
            restaurants.add((Restaurant)restaurantesLocais.get(indiceRestauranteLocal));
        }

        for(indiceRestauranteFastFood = 0;indiceRestauranteFastFood<restaurantesFastFood.size();indiceRestauranteFastFood++){
            restaurants.add((Restaurant) restaurantesFastFood.get(indiceRestauranteFastFood));
        }



        return restaurants;
    }

    /**
     * Método setter que permite atribuir a ArrayList geral com todas as empresas
     * @param lista ArrayList geral com todas as empresa
     */
    public void setLista(ArrayList<Company> lista){
        this.lista = lista;
    }


    /**
     * Método que escreve no ficheiro de objetos a ArrayList com todas as empresas
     * @param fname ficheiro de objetos
     * @param dados ArrayList com todas as empresas
     */
    public void escreverFicheiroObjeto(File fname, ArrayList<Company> dados) {

        try {
            FileOutputStream fos = new FileOutputStream(fname);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dados);
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro a criar ficheiro.");
        } catch (IOException ex) {
            System.out.println("Erro a escrever para o ficheiro.");
        }

    }

    /**
     * Método que lê o ficheiro de objetos e retorna a ArrayList com todas as empresas que este contém
     * @param fname ficheiro de objetos
     * @param manager Objeto manager que contém todas as informações e métodos necessários para lidar com operações relacionadas com as ArrayLists específicas
     * @return ArrayList com todas as empresas que o ficheiro de objetos contém
     */
    public ArrayList<Company> lerFicheiroObjetos(File fname, StarThriveManager manager) {
        ArrayList<Company> temp = new ArrayList();

        if(fname.exists() && fname.isFile()){
            try {

                FileInputStream fis = new FileInputStream(fname);
                ObjectInputStream ois = new ObjectInputStream(fis);
                temp = (ArrayList<Company>) ois.readObject();

                for(int i=0;i<temp.size();i++) {
                    temp.get(i).adicionarListaEspecifica(manager);
                }


                ois.close();

            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir ficheiro.");
            } catch (IOException ex) {
                System.out.println("Erro a ler ficheiro.");
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro a converter objeto.");
            }



            return temp;

        }

        else{
            System.out.println("O ficheiro não existe.");
            return null;
        }


    }


    /**
     * Método que lê o ficheiro de texto, criar os objetos, atualiza todas as ArrayLists necessários, e no final cria o ficheiro de objetos.
     * Todos os parâmetros de cada objeto são validados.
     * @param f ficheiro de texto
     */
    void lerFicheiroTexto(File f){
        if(f.exists() && f.isFile()) {
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;

                while((line = br.readLine()) != null) {
                    //System.out.println(line);
                    String[] handler = line.split("\\|");

                    if(line.length()>0){
                        try{
                            String tipo = handler[0];
                            if(!tipo.equals("FastFoodRestaurant")&&!tipo.equals("LocalRestaurant")&&!tipo.equals("Cafe")&&!tipo.equals("Bakery")&&!tipo.equals("FruitShop")&&!tipo.equals("Market"))throw new IllegalArgumentException();

                        }

                        catch(IllegalArgumentException ex){
                            JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: tipo de empresa inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                            System.exit(1);


                        }

                        //String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa, double numeroClientesDriveThru, double faturacaoDiariaDriveThru
                        if(handler[0].equals("FastFoodRestaurant")){
                            try{
                                int comprimento = handler.length;


                                if(comprimento!=13) throw new IllegalArgumentException("");
                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }

                            try{

                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                double salario = Double.parseDouble(handler[5]);
                                if(salario<0) throw new IllegalArgumentException("");

                                int numeroEmpregados = Integer.parseInt(handler[6]);
                                if(numeroEmpregados<0) throw new IllegalArgumentException();

                                double numeroMedioCLientes = Double.parseDouble(handler[7]);
                                if(numeroMedioCLientes<0) throw new IllegalArgumentException("");

                                int numeroDiasFuncional = Integer.parseInt(handler[8]);
                                if(numeroDiasFuncional<0||numeroDiasFuncional>365) throw new IllegalArgumentException("");

                                int numeroMesas = Integer.parseInt(handler[9]);
                                if(numeroMesas<0) throw new IllegalArgumentException("");

                                double faturacaoDiariaMesa = Double.parseDouble(handler[10]);
                                if(faturacaoDiariaMesa<0) throw new IllegalArgumentException("");

                                double clientesDiariosDriveThru = Double.parseDouble(handler[11]);

                                if(clientesDiariosDriveThru<0) throw new IllegalArgumentException("");

                                double faturacaoDiariaDriveThru = Double.parseDouble(handler[12]);
                                if(faturacaoDiariaDriveThru<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));
                                Company temp = new FastFoodRestaurant(handler[1],handler[2],cordTemp,Double.parseDouble(handler[5]),Integer.parseInt(handler[6]),Double.parseDouble(handler[7]),Integer.parseInt(handler[8]),Integer.parseInt(handler[9]),Double.parseDouble(handler[10]),Double.parseDouble(handler[11]),Double.parseDouble(handler[12]));
                                lista.add(temp);
                                listaFastFood.add(temp);

                            }

                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            catch(IllegalArgumentException ex){
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }


                            //System.out.println(temp);

                        }




                        else if(handler[0].equals("LocalRestaurant")){
                            //String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, int numeroDiasFuncional, int numeroMesasInteriores, double faturacaoDiariaMesa, int numeroMesasEsplanada, double licencaAnualMesa


                            try{
                                int comprimento = handler.length;

                                if(comprimento!=13) throw new IllegalArgumentException("");
                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }

                            try {
                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                double salario = Double.parseDouble(handler[5]);
                                if(salario<0) throw new IllegalArgumentException("");

                                int numeroEmpregados = Integer.parseInt(handler[6]);
                                if(numeroEmpregados<0) throw new IllegalArgumentException();

                                double numeroMedioCLientes = Double.parseDouble(handler[7]);
                                if(numeroMedioCLientes<0) throw new IllegalArgumentException("");

                                int numeroDiasFuncional = Integer.parseInt(handler[8]);
                                if(numeroDiasFuncional<0||numeroDiasFuncional>365) throw new IllegalArgumentException("");

                                int numeroMesasInteriores = Integer.parseInt(handler[9]);
                                if(numeroMesasInteriores<0) throw new IllegalArgumentException("");

                                double faturacaoDiariaMesa = Double.parseDouble(handler[10]);
                                if(faturacaoDiariaMesa<0) throw new IllegalArgumentException("");

                                int numeroMesasEsplanada = Integer.parseInt(handler[11]);

                                if(numeroMesasEsplanada<0) throw new IllegalArgumentException("");

                                double licencaAnualMesa = Double.parseDouble(handler[12]);
                                if(licencaAnualMesa<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));

                                Company temp = new LocalRestaurant(handler[1],handler[2],cordTemp,Double.parseDouble(handler[5]),Integer.parseInt(handler[6]),Double.parseDouble(handler[7]),Integer.parseInt(handler[8]),Integer.parseInt(handler[9]),Double.parseDouble(handler[10]),Integer.parseInt(handler[11]),Double.parseDouble(handler[12]));

                                lista.add(temp);
                                listaLocal.add(temp);

                            }

                            catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                            System.exit(1);


                        }

                            catch(IllegalArgumentException ex){
                            JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                            System.exit(1);


                        }


                            //System.out.println(temp);

                        }


                        else if(handler[0].equals("Cafe")){
                            //String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, double numeroMedioCafesDia, double faturacaoAnual

                            try{
                                int comprimento = handler.length;

                                if(comprimento!=10) throw new IllegalArgumentException("");
                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }
                            try {
                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                double salario = Double.parseDouble(handler[5]);
                                if(salario<0) throw new IllegalArgumentException("");

                                int numeroEmpregados = Integer.parseInt(handler[6]);
                                if(numeroEmpregados<0) throw new IllegalArgumentException();

                                double numeroMedioCLientes = Double.parseDouble(handler[7]);
                                if(numeroMedioCLientes<0) throw new IllegalArgumentException("");


                                double numeroMedioCafesDia = Double.parseDouble(handler[8]);
                                if(numeroMedioCafesDia<0) throw new IllegalArgumentException("");

                                double faturacaoAnual = Double.parseDouble(handler[9]);
                                if(faturacaoAnual<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));

                                Company temp = new Cafe(handler[1],handler[2],cordTemp,Double.parseDouble(handler[5]),Integer.parseInt(handler[6]),Double.parseDouble(handler[7]),Double.parseDouble(handler[8]),Double.parseDouble(handler[9]));

                                lista.add(temp);
                                listaCafe.add(temp);

                            }

                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            catch(IllegalArgumentException ex){
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }


                            //System.out.println(temp);
                        }

                        else if(handler[0].equals("Bakery")){

                            //String nome, String distrito, GPS localização, double salarioAnualMedio, int numeroEmpregadosMesa, double numeroMedioClientesDia, double numeroMedioBolosDia, double faturacaoAnualMediaBolo

                            try{
                                int comprimento = handler.length;
                                if(comprimento!=10) throw new IllegalArgumentException("");
                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }

                            try {
                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                double salario = Double.parseDouble(handler[5]);
                                if(salario<0) throw new IllegalArgumentException("");

                                int numeroEmpregados = Integer.parseInt(handler[6]);
                                if(numeroEmpregados<0) throw new IllegalArgumentException();

                                double numeroMedioCLientes = Double.parseDouble(handler[7]);
                                if(numeroMedioCLientes<0) throw new IllegalArgumentException("");


                                double numeroMedioBolosDia = Double.parseDouble(handler[8]);
                                if(numeroMedioBolosDia<0) throw new IllegalArgumentException("");

                                double faturacaoAnualMediaBolo = Double.parseDouble(handler[9]);
                                if(faturacaoAnualMediaBolo<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));

                                Company temp = new Bakery(handler[1],handler[2],cordTemp,Double.parseDouble(handler[5]),Integer.parseInt(handler[6]),Double.parseDouble(handler[7]),Double.parseDouble(handler[8]),Double.parseDouble(handler[9]));

                                lista.add(temp);
                                listaPastelaria.add(temp);

                            }

                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            catch(IllegalArgumentException ex){
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            //System.out.println(temp);


                        }

                        else if(handler[0].equals("FruitShop")){

                            //String nome,String distrito,GPS localização,int numeroProdutos,double faturacaoAnualProduto,double custoAnualLimpeza

                            try{
                                int comprimento = handler.length;

                                if(comprimento!=8) throw new IllegalArgumentException("");
                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }

                            try {
                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                int numeroProdutos = Integer.parseInt(handler[5]);
                                if(numeroProdutos<0) throw new IllegalArgumentException("");

                                double faturacaoAnualProduto = Double.parseDouble(handler[6]);
                                if(faturacaoAnualProduto<0) throw new IllegalArgumentException("");

                                double custoAnualLimpeza = Double.parseDouble(handler[7]);
                                if(custoAnualLimpeza<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));

                                Company temp = new FruitShop(handler[1],handler[2],cordTemp,Integer.parseInt(handler[5]),Double.parseDouble(handler[6]),Double.parseDouble(handler[7]));

                                lista.add(temp);
                                listaFrutaria.add(temp);

                            }

                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            catch(IllegalArgumentException ex){
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            //System.out.println(temp);
                        }

                        else if(handler[0].equals("Market")){

                            //String nome,String distrito,GPS localização,double areaCorredores,double faturacaoAnualm2,double custoAnualLimpeza

                            try{
                                int comprimento = handler.length;
                                if(comprimento!=8) throw new IllegalArgumentException("");

                            }
                            catch(IllegalArgumentException ex1){
                                JOptionPane.showMessageDialog(null, "Número de argumentos inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);

                            }

                            try {
                                String nome = handler[1];
                                if(nome.equals("")) throw new IllegalArgumentException();


                                String distrito = handler[2];
                                if(distrito.equals(""))throw new IllegalArgumentException();
                                for (int i = 0; i < distrito.length(); i++) {
                                    if(!Character.isLetter(distrito.charAt(i))){

                                        throw new IllegalArgumentException("");

                                    }

                                }
                                double latitude = Double.parseDouble(handler[3]);
                                double longitude = Double.parseDouble(handler[4]);

                                double areaCorredores = Double.parseDouble(handler[5]);
                                if(areaCorredores<0) throw new IllegalArgumentException("");

                                double faturacaoAnualM2 = Double.parseDouble(handler[6]);
                                if(faturacaoAnualM2<0) throw new IllegalArgumentException("");

                                double custoAnualLimpeza = Double.parseDouble(handler[7]);
                                if(custoAnualLimpeza<0) throw new IllegalArgumentException("");


                                GPS cordTemp = new GPS(Double.parseDouble(handler[3]),Double.parseDouble(handler[4]));

                                Company temp = new Market(handler[1],handler[2],cordTemp,Integer.parseInt(handler[5]),Double.parseDouble(handler[6]),Double.parseDouble(handler[7]));

                                lista.add(temp);
                                listaMercado.add(temp);

                            }

                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            catch(IllegalArgumentException ex){
                                JOptionPane.showMessageDialog(null, "Erro de leitura do ficheiro de texto: formato de parâmetros inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                                System.exit(1);


                            }

                            //System.out.println(temp);

                        }

                    }

                }
                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir ficheiro de texto.");
            } catch (IOException ex) {
                System.out.println("Erro a ler ficheiro de texto.");
            }
        } else {
            System.out.println("Ficheiro não existe.");
        }

    }

}
