package com_opet_aula05;

import com.opet.util.Reader;

public class FuncaoSWITCH_calculadora {

	public static void main(String[] args) throws Exception {
		   /*
        tenho que declarar todas as variáveis (4), fazer a entrada das 3 variaveis exigidas
        e entrar no switch - DECORAR A ORDEM DOS COMANDOS PARA NÂO SE BATER -
        DECLARAR > ENTRADAS > EXECUÇAO

        Poderia, no case, colocar direto System.out.print ("A soma de"+num1+" + "+num2+" é = "+num1+num2) -
        assim sairia direto
        */

       double num1 = 0;
       double num2 = 0;
       String operacao = "";
       // Assim que se declaro String em aberto !!!
       double resultado = 0;

       System.out.println("Digite o primeiro número: ");
       num1 = Reader.readDouble();
       System.out.println("Digite a operação  + - / * : ");
       operacao = Reader.readString();
       System.out.println ("Digite o segundo número: ");
       num2 = Reader.readDouble();

       switch (operacao) {
           case "+":
               resultado = num1+num2;
               System.out.print ("A soma é "+resultado);
               break;
           case "-":
               resultado = num1-num2;
               System.out.print ("A subtração é "+resultado);
               break;
           case "/":
               if (num2 == 0) {
                   System.out.println("Impossível dividir por ZERO");
               }
               resultado = num1/num2;
               System.out.print ("A divisão é "+resultado);
               break;
           case "*":
               resultado = num1*num2;
               System.out.print ("A multiplicação é "+resultado);
               break;

               default: System.out.println("A operação não é válida");
                           break;

 /*
  Para não colocar impressão no case
  posso fazer variavel boolean opOK = true e fazer > (no caso da divisão tenho opOK = false)
  no switch coloco opOK = false no default tbm.
  if(opOK == true) {
  System.outr.println ("Resultado: " + num 1 + op + num 2 + " =" + resultado)
  */

       }




	}

}
