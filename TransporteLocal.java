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
public class TransporteLocal extends Transporte{

      public String TipoTransporte;
   

    public TransporteLocal(String TipoTransporte, int Id, String Origem, String Destino, Date Data) {
        super(Id, Origem, Destino, Data);
       
          this.TipoTransporte = TipoTransporte;
    }

    TransporteLocal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 public String getTipoTransporte() {
        return TipoTransporte;
    } 
       public static void Local() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o lugar que pretendes ir: ");
        String novaCidade = entrada.nextLine();
        listaDeNomes.add(novaCidade); 
       
        System.out.print("Digite a Data de imbarcação: ");
        String novaData = entrada.nextLine();
        listaDeNomes.add(novaData);   
        
        System.out.println("Dados  registrado com sucesso!");
        
          System.out.print("");
       }

    void local() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
