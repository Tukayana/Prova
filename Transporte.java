 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte_maritimo;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Transporte {

    private static int numeroDoNome;
  public int Id;
  public String Origem;
  public String Destino;
   public Date Data;
   public static  int v,g,sim,nao,h;
   TransporteLocal l1 = new TransporteLocal();
   TransporteInterprovincial l2 = new TransporteInterprovincial();
    static ArrayList<String> listaDeNomes = new ArrayList<String>();
   
    public Transporte(int Id, String Origem, String Destino, Date Data) {
        this.Id = Id;
        this.Origem = Origem;
        this.Destino = Destino;
        this.Data = Data;
      
    }

    Transporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

 
   
 public static void registrarNovoNome() {
     Scanner entrada = new Scanner(System.in);
     do{
         System.out.print("1-Registrar // 0-Cancelar ");
         g = entrada.nextInt();
        switch(g){
            case 1:
        System.out.print("Digite o numero de Id: ");
        String novoId = entrada.next();
        
        listaDeNomes.add(novoId); 
        System.out.print("Digite o nome a ser registrado: ");
        String novoNome = entrada.next();
        listaDeNomes.add(novoNome); 
         System.out.print("Digite a idade: ");
        String novaIdade = entrada.next();
        listaDeNomes.add(novaIdade); 
        System.out.print("Digite a Cidade ");
        String novaCidade = entrada.next();
        listaDeNomes.add(novaCidade); 
        System.out.print("Digite o Bairro: ");
        String novoBairro = entrada.next();
        listaDeNomes.add(novoBairro); 
        System.out.print("Digite o numero da casa ");
        String novoNumerocasa = entrada.next();
        listaDeNomes.add(novoNumerocasa); 
        System.out.print("Digite o Municipio ");
        String novoMunicipio = entrada.next();
        listaDeNomes.add(novoMunicipio); 
        System.out.print("Digite o Contacto: ");
        String novoContacto = entrada.next();
        listaDeNomes.add(novoContacto);
        System.out.print("Digite o Email ");
        String novoEmail = entrada.next(); 
        System.out.println("Para registrar o local onde prentende ir digite 1-para local 2-provincia ");
        h=entrada.nextInt();
        switch(h){
            case 1:
                TransporteLocal.Local();
                break;
            case 2:
                TransporteInterprovincial.Interprovincial();
                 break;
              
        }
        break;
            case 0:
                System.out.println("Obrigda!");
              System.out.println("Foram canceladas "+ Transporte.nao +" viagen/s"+ " e " + "efectuadas " +Transporte.sim + " Viagens");

                break;
                
        }
        
        if(g==1){
           sim++; 
        }  
        }while(g!=0);
     
    
    }

    public static void listarNomesRegistrados() {
        if (listaDeNomes.isEmpty()) {
            System.out.println("Lista vazia. Nenhum dado registrado.");
        } else {
            for (int i = 0;i<listaDeNomes.size(); i++) {
                System.out.println((i) + " - " + listaDeNomes.get(i));
              
        
            } 
        }
    }

    public static void cancelarRegistroDeNome() {
       
        Scanner entrada = new Scanner(System.in);
        do{
            
         System.out.println("para cancelar o sua viagem digite 1");
         v=entrada.nextInt();
         
         if(v==1){
            nao++;
         }
        
        }while(v!=1);
        
        System.out.print("Digite o Id do nome a ser cancelado: ");
        int numeroDoNome = entrada.nextInt();
       
         if ((numeroDoNome <= 0) || (numeroDoNome > listaDeNomes.size())) {
            System.out.println("Número inválido. Tente novamente.");
        } else{
            listaDeNomes.remove(numeroDoNome - 1);
            System.out.println("Nome cancelado com sucesso!");
         }
        
        

       
               
       
    }

    public static void atualizarNome() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Id do nome a ser atualizado: ");
        int numeroDoNome = entrada.nextInt();
        entrada.nextLine();

        if ((numeroDoNome <= 0) || (numeroDoNome > listaDeNomes.size())) {
            System.out.println("Número inválido. Tente novamente.");
        } else {
            System.out.print("Digite o novo nome: "); 
        String novoNome = entrada.nextLine();
        listaDeNomes.add(novoNome); 
         System.out.print("Digite a nova idade: ");
        String novaIdade = entrada.nextLine();
        listaDeNomes.add(novaIdade);  
        System.out.print("Digite a nova Cidade ");
        String novaCidade = entrada.nextLine();
        listaDeNomes.add(novaCidade); 
        System.out.print("Digite o novo Bairro: ");
        String novoBairro = entrada.nextLine();
        listaDeNomes.add(novoBairro); 
        System.out.print("Digite o novo numero da casa ");
        String novoNumerocasa = entrada.nextLine();
        listaDeNomes.add(novoNumerocasa); 
        System.out.print("Digite novo o Municipio ");
        String novoMunicipio = entrada.nextLine();
        listaDeNomes.add(novoMunicipio); 
        System.out.print("Digite o novo Contacto: ");
        String novoContacto = entrada.nextLine();
        listaDeNomes.add(novoContacto); 
        System.out.print("Digite o novo Email ");
        String novoEmail = entrada.nextLine();
        listaDeNomes.add(novoEmail);
        System.out.print("Digite a nova Provincia que pretendes ir: ");
        String novaProvincia = entrada.nextLine();
        listaDeNomes.add(novaProvincia); 
        System.out.print("Digite a nova Data de imbarcação: ");
        String novaData = entrada.nextLine();
        listaDeNomes.add(novaData);
         System.out.print("Digite o lugar que pretendes ir: ");
        String novaCidaded = entrada.nextLine();
        listaDeNomes.add(novaCidaded); 
   
            listaDeNomes.set(numeroDoNome - 1, novoNome);
            listaDeNomes.set(numeroDoNome - 1, novaIdade);
            listaDeNomes.set(numeroDoNome - 1, novaCidade);
            listaDeNomes.set(numeroDoNome - 1, novoBairro);
            listaDeNomes.set(numeroDoNome - 1, novoNumerocasa);
            listaDeNomes.set(numeroDoNome - 1, novoMunicipio);
            listaDeNomes.set(numeroDoNome - 1, novoContacto);
            listaDeNomes.set(numeroDoNome - 1, novoEmail);
            listaDeNomes.set(numeroDoNome - 1, novaProvincia);
            listaDeNomes.set(numeroDoNome - 1,novaData);
            listaDeNomes.set(numeroDoNome - 1,novaCidaded);

            System.out.println("Dados atualizado com sucesso!");
        }
    }

    public static void consultarNome() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Id do nome a ser consultado: ");
        int numeroDoNome = entrada.nextInt();

        if ((numeroDoNome <= 0) || (numeroDoNome > listaDeNomes.size())) {
            System.out.println("Número inválido. Tente novamente.");
        } else {
            String nome = listaDeNomes.get(numeroDoNome - 1);
            System.out.println("Dados  encontrados: " + listaDeNomes);
        
        }
    }

}
