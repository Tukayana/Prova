package transporte_maritimo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUKAYANA
 */
public class Endereco {
    
    private String Cidade;
    private String Municipio;
    private String Bairro;
    private String Numerocasa;

    public Endereco(String Cidade, String Municipio, String Bairro, String Numerocasa) {
        this.Cidade = Cidade;
        this.Municipio = Municipio;
        this.Bairro = Bairro;
        this.Numerocasa = Numerocasa;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getNumerocasa() {
        return Numerocasa;
    }

    public void setNumerocasa(String Numerocasa) {
        this.Numerocasa = Numerocasa;
    }

    
    
    
}
