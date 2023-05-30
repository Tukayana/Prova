/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte_maritimo;

/**
 *
 * @author TUKAYANA
 */
public class Contacto {
 private String Email;
    private String Numero;

    public Contacto(String Email, String Numero) {
        this.Email = Email;
        this.Numero = Numero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
   
   
}
