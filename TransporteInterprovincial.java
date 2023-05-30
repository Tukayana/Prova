/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte_maritimo;


import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author TUKAYANA
 */
public class TransporteInterprovincial extends Transporte {
   
 public String Provincia;
 
    public TransporteInterprovincial(String Provincia, int Id, String Origem, String Destino, Date Data) {
        super(Id, Origem, Destino, Data);
       this.Provincia = Provincia;
    }

    TransporteInterprovincial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public String getProvincia() {
        return Provincia;
    }
           public static void Interprovincial() {
            Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a Provincia que pretendes ir: ");
        String novaProvincia = entrada.nextLine();
        listaDeNomes.add(novaProvincia); 
       
        System.out.print("Digite a Data de imbarcação: ");
        String novaData = entrada.nextLine();
        listaDeNomes.add(novaData); 
        
        System.out.println("Dados registrado com sucesso!");
       }

    void interprovincial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
