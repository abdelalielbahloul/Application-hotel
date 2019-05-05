package com.demo01.abdelali.com.hotel.models;

public class post {
    private String nom ;
    private String tel;
    private String etoile;
    private String image ;

    public post(String nom, String tel, String etoile, String image) {
        this.nom = nom;
        this.tel = tel;
        this.etoile = etoile;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEtoile() {
        return etoile;
    }

    public void setEtoile(String etoile) {
        this.etoile = etoile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "post{" +
                "nom='" + nom + '\'' +
                ", tel='" + tel + '\'' +
                ", etoile='" + etoile + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
