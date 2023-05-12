/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomany.entities;

/**
 *
 * @author Lenovo
 */
//taw n7oto fi description
public class User {
    
     protected int idUtilisateur ; 
    protected String username ; 
    protected String email ; 
    protected String numero ; 
    protected String Adresse; 
    protected String password;  
    protected String Image ; 
    protected String Type ; 
    protected int nombreProduitAchetes ;  
    protected int nombreProduitPublier ; 
    protected int nombreProduitVendus ; 
    protected int avis ; 
    protected String role ;

    public User(int id, String username, String email, String numero, String Adresse, String password, String Image, String Type, int nombreProduitAchetes, int nombreProduitPublier, int nombreProduitVendus, int avis, String role) {
        this.idUtilisateur = id;
        this.username = username;
        this.email = email;
        this.numero = numero;
        this.Adresse = Adresse;
        this.password = password;
        this.Image = Image;
        this.Type = Type;
        this.nombreProduitAchetes = nombreProduitAchetes;
        this.nombreProduitPublier = nombreProduitPublier;
        this.nombreProduitVendus = nombreProduitVendus;
        this.avis = avis;
        this.role = role;
    }

    public User() {
    }

    public int getId() {
        return idUtilisateur;
    }

    public void setId(int id) {
        this.idUtilisateur = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getNombreProduitAchetes() {
        return nombreProduitAchetes;
    }

    public void setNombreProduitAchetes(int nombreProduitAchetes) {
        this.nombreProduitAchetes = nombreProduitAchetes;
    }

    public int getNombreProduitPublier() {
        return nombreProduitPublier;
    }

    public void setNombreProduitPublier(int nombreProduitPublier) {
        this.nombreProduitPublier = nombreProduitPublier;
    }

    public int getNombreProduitVendus() {
        return nombreProduitVendus;
    }

    public void setNombreProduitVendus(int nombreProduitVendus) {
        this.nombreProduitVendus = nombreProduitVendus;
    }

    public int getAvis() {
        return avis;
    }

    public void setAvis(int avis) {
        this.avis = avis;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + idUtilisateur + ", username=" + username + ", email=" + email + ", numero=" + numero + ", Adresse=" + Adresse + ", password=" + password + ", Image=" + Image + ", Type=" + Type + ", nombreProduitAchetes=" + nombreProduitAchetes + ", nombreProduitPublier=" + nombreProduitPublier + ", nombreProduitVendus=" + nombreProduitVendus + ", avis=" + avis + ", role=" + role + '}';
    }
    
    

    
    
    
    
    
}