public class Calculadora{

      int v1;
      int v2;
      int soma;
      int subtrair;
      float dividir;
      int multiplicar;
      
      public void soma(){
     
         soma = (v1 + v2 );
         System.out.println("A soma e: " + this.soma);
}

        public void subtrair(){
            subtrair = (v1 - v2);
            System.out.println("A subtracao e: " + this.subtrair);
        }
        
            public void dividir(){
                dividir = (v1 / v2);
                System.out.println("A divisao e: " + this.dividir);
           }
               
                public void multiplicar(){
                    multiplicar = (v1 * v2);
                    System.out.println("A multiplicacao e: " + this.multiplicar);
                }

                    public static void main(String[] args){
                          Calculadora um = new Calculadora();
                          Calculadora dois = new Calculadora();
                          Calculadora tres = new Calculadora();
                          pri.v1 = 12;
                          pri.v2 = 3;
                          pri.soma();
                          pri.subtrair();
                          pri.dividir();
                          pri.multiplicar();
                          
                          seg.v1 = 9;
                          seg.v2 = 5;
                          seg.soma();
                          seg.subtrair();
                          seg.dividir();
                          seg.multiplicar();

                          ter.v1 = 20;
                          ter.v2 = 4;
                          ter.soma();
                          ter.subtrair();
                          ter.dividir();
                          ter.multiplicar();
                    }
}
