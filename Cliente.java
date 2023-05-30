/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte_maritimo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUKAYANA
 */
public class Cliente {
   private int Idade;
   String Nome;
   private Endereco endereco ;
   private Contacto contacto;

    public Cliente(int Idade, String Nome, Endereco endereco, Contacto contacto) {
        this.Idade = Idade;
        this.Nome = Nome;
        this.endereco = endereco;
        this.contacto = contacto;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
class Clientes {
   private List <Cliente> clientes;
   public Clientes(){
       clientes= new ArrayList<>();       
   }
   
}
}
