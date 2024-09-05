

import java.io.Serializable;

/**
 * Classe utilizada para representar a localização de uma empresa através das suas coordenadas de latitude e longitude.
 * Esta implementação foi feita a pensar no formato de coordenadas em graus decimais
 */
public class GPS implements Serializable {

    /**
     * Latitude da empresa, em graus
     */
    private double latitude;

    /**
     * Longitude da empresa, em graus
     */
    private double longitude;

    /**
     * Construtor vazio, serve apenas para alocar espaço
     */
    public GPS(){

    }

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param latitude latitude da empresa em graus
     * @param longitude longitude da empresa em graus
     */
    public GPS(double latitude,double longitude){
        this.latitude = latitude;
        this.longitude= longitude;
    }


    /**
     * Método getter que retorna a latitude da empresa
     * @return latitude da empresa
     */
    public double getLatitude(){
        return this.latitude;
    }

    /**
     * Método getter que retorna a longitude da empresa
     * @return longitude da empresa
     */
    public double getLongitude(){
        return this.longitude;
    }

    /**
     * Método setter para atribuir a latitude à localização da empresa
     * @param latitude latitude da empresa
     */
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    /**
     * Método setter para atribuir a longitude à localização da empresa
     * @param longitude longitude da empresa
     */
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    /**
     * Método toString que retorna uma String formatada com toda a informação sobre a localização
     * @return String formatada
     */
    public String toString(){
        return "Latitude: "+this.latitude+" Longitude: "+this.longitude;
    }
}
