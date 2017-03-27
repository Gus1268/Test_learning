package com_opet_aula05;

import com.opet.util.Reader;

public class FuncaoSWITCH_calculadora {

	public static void main(String[] args) throws Exception {
		   /*
        tenho que declarar todas as vari�veis (4), fazer a entrada das 3 variaveis exigidas
        e entrar no switch - DECORAR A ORDEM DOS COMANDOS PARA N�O SE BATER -
        DECLARAR > ENTRADAS > EXECU�AO

        Poderia, no case, colocar direto System.out.print ("A soma de"+num1+" + "+num2+" � = "+num1+num2) -
        assim sairia direto
        */

       double num1 = 0;
       double num2 = 0;
       String operacao = "";
       // Assim que se declaro String em aberto !!!
       double resultado = 0;

       System.out.println("Digite o primeiro n�mero: ");
       num1 = Reader.readDouble();
       System.out.println("Digite a opera��o  + - / * : ");
       operacao = Reader.readString();
       System.out.println ("Digite o segundo n�mero: ");
       num2 = Reader.readDouble();

       switch (operacao) {
           case "+":
               resultado = num1+num2;
               System.out.print ("A soma � "+resultado);
               break;
           case "-":
               resultado = num1-num2;
               System.out.print ("A subtra��o � "+resultado);
               break;
           case "/":
               if (num2 == 0) {
                   System.out.println("Imposs�vel dividir por ZERO");
               }
               resultado = num1/num2;
               System.out.print ("A divis�o � "+resultado);
               break;
           case "*":
               resultado = num1*num2;
               System.out.print ("A multiplica��o � "+resultado);
               break;

               default: System.out.println("A opera��o n�o � v�lida");
                           break;

 /*
  Para n�o colocar impress�o no case
  posso fazer variavel boolean opOK = true e fazer > (no caso da divis�o tenho opOK = false)
  no switch coloco opOK = false no default tbm.
  if(opOK == true) {
  System.outr.println ("Resultado: " + num 1 + op + num 2 + " =" + resultado)
  */

       }




	}

}
