 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte_maritimo;
import java.util.Scanner;
import static transporte_maritimo.Transporte.atualizarNome;
import static transporte_maritimo.Transporte.cancelarRegistroDeNome;
import static transporte_maritimo.Transporte.consultarNome;
import static transporte_maritimo.Transporte.listarNomesRegistrados;
import static transporte_maritimo.Transporte.registrarNovoNome;
import static transporte_maritimo.TransporteInterprovincial.Interprovincial;



public class Transporte_Maritimo {

    private static String q;
Transporte transporte = new Transporte();
    public static void main(String[] args) {
 int cv;
 Scanner entrada = new Scanner(System.in);

        do{
             System.out.println("Bem Vindo!! \n");
                     System.out.println("1-Registrar Viagem");
                     System.out.println("2-Consultar Viagem");
                     System.out.println("3-Actualizar Viagem");
                     System.out.println("4-Ver Lista de Viagens");
                     System.out.println("5-Canselar Viagens");
                      cv=entrada.nextInt();
                     
                 switch(cv){
                      case 1:
                                        registrarNovoNome();
                    break;
                case 2:
                     consultarNome(); 
                    break;
                case 3:
                      atualizarNome();
                    break;
                case 4:
                listarNomesRegistrados();
                    break;
                case 5:
                   cancelarRegistroDeNome();
                    break;
               
                case 0:
                   System.out.println("Volte sempre!!!");
                    break;
                 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                 }
                    
                          
    }while(cv!=0);
        
    }
    }