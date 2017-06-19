/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Leandro Max
 */
public class Lixeira {
    private int id;
    private int capacidadeTotal;
    private int capacidadeUtilizada;
    private String latitude;
    private String longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getCapacidadeUtilizada() {
        return capacidadeUtilizada;
    }

    public void setCapacidadeUtilizada(int capacidadeUtilizada) {
        this.capacidadeUtilizada = capacidadeUtilizada;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return  Integer.toString(getId()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
