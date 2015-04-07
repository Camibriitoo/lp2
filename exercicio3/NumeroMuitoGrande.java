package NumeroMuitoGrande;

import java.util.Scanner;

public class NumeroMuitoGrande {

    int a[] = new int[30];
    int b[] = new int[30];
    int soma[] = new int[30];
    int mult[] = new int[30];

    public void ler() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        String nmg1 = imput.next();
        int tamanho = nmg1.length() - 1;
        int i = 29;
        while (tamanho >= 0) {
            this.a[i] = Character.getNumericValue(nmg1.charAt(tamanho));
            i--;
            tamanho--;
        }
        System.out.println("Digite o segundo numero: ");
        String nmg2 = imput.next();

        tamanho = nmg2.length() - 1;
        i = 29;
        while (tamanho >= 0) {
            this.b[i] = Character.getNumericValue(nmg2.charAt(tamanho));
            i--;
            tamanho--;
        }

    }

    public void somar() {

        int sobe = 0;
        for (int i = 29; i >= 0; i--) {
            this.soma[i] = (this.a[i] + this.b[i] + sobe + this.soma[i]) % 10;
            sobe = (this.a[i] + this.b[i] + sobe) / 10;
        }

    }

    public void imprimirSoma() {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.soma[i]);
        }
        System.out.println("");
    }

    public void multiplicar() {

        for (int i = 29; i >= 0; i--) {
            int sobe2 = 0;
            int posi = i;
            int j = 29;
            while((j>=0) && (posi>=0)){
            this.mult[posi] = this.mult[posi] + (((this.a[j] * this.b[i]) + sobe2) % 10);
            sobe2 = (((this.a[j] * this.b[i]) + sobe2) / 10);
            posi--;
            j--;
            }
        }
        int sobe = 0;
        int i;
        for (i = 29; i >= 0; i--) {
           sobe = this.mult[i]/10;
           this.mult[i] = ((this.mult[i] + sobe)%10);
            
            
          
        }
    }

    public void imprimirMultiplicacao() {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.mult[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        NumeroMuitoGrande nmg = new NumeroMuitoGrande();
        nmg.ler();
        nmg.somar();
        nmg.multiplicar();
        nmg.imprimirSoma();
        nmg.imprimirMultiplicacao();

    }
}
