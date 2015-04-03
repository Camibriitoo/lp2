import java.util.Scanner;
public class CPF {
       
    public static void main(String[] args) {
       int j=2;
       int resto;
       int soma=0;
       int i;
       int peso [] = new int[11];
       int numero [] = new int [11];
       int resultado [] = new int [11];
       
       
       Scanner input = new Scanner(System.in);
       System.out.println ("Digite os nove primeiros digitos: ");
       String cpfnro = input.next(); 
            for (i=8;i>=0;i--){
                numero [i] = Character.getNumericValue(cpfnro.charAt(i));
                System.out.println("No cpf: " + numero[i]);
            }
           
            for (i=8;i>=0;i--){
                peso[i] = j;
                j++;
                System.out.println("peso: " + peso[i]);
            }
        
            for (i=8;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
                System.out.println("P*N: " + resultado[i]);
            }
           
            for (i=0;i<9; i++) { 
                soma+=resultado[i];
            }
        System.out.println("soma: " + soma);
        resto = soma%11;
        
        System.out.println("Resto: " + resto);
        if(resto<2){
            i=9;
            numero[i]=0;
        }
        else{
            numero[i]= 11-resto;
        System.out.println("1o verificador: " + numero[i]);
        }
        for (i=9;i>=0;i--){
        System.out.println("num" + numero[i]);
        }
         j=2;
              for (i=9;i>=0;i--){
                peso[i] = j;
                j++;
                System.out.println("peso: " + peso[i]);
            }
            
            for (i=9;i>=0;i--) {
                resul[i]= 0;
            }
      
             
            for (i=9;i>=0;i--) {
                resultado[i]= numero[i] * peso[i];
                System.out.println("P*N: " + resultado[i]);
            }
            soma=0;
            for (i=0;i<10; i++) { 
		soma+=resultado[i];
            }
           
             System.out.println("soma: " + soma);
             resto = soma%11;
        
            System.out.println("Resto: " + resto);
            
          if(resto<2){
            i=10;
            numero[i]=0;
        }
        else{
            numero[i]= 11-resto;
        
        }
        System.out.println("2o verificador: " + numero[i]);
        System.out.println("Seu CPF:");
        for (i=0;i<=10;i++){
        System.out.print(numero[i]);
        System.out.println("");
        } 
}
}
}
