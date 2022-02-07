import CalculadoraApp.*;
 
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;
import java.util.*;
 
/**
 *
 * @author jkayser
 */
public class StartClient {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
	    ORB orb = ORB.init(args, null);
	    org.omg.CORBA.Object objRef =   orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	    Calculadora calculadora = (Calculadora) CalculadoraHelper.narrow(ncRef.resolve_str("ABC"));
 
            int a;
            Scanner s = new Scanner(System.in);

            do {
                System.out.println("[0] SOMA - [1] SUBTRAÇÃO - [2] MULTIPLICAÇÃO - [3] DIVISÃO - [4] SAIR");
                a = s.nextInt();
                if (a >= 0 && a <= 3) {
                    System.out.println("Insira o primeiro número: ");
                    double num1 = s.nextDouble();

                    System.out.println("Insira o segundo número: ");
                    double num2 = s.nextDouble();

                    switch (a) {
                        case 0:
                            System.out.println("Resultado é: " + calculadora.getSoma(num1, num2));
                            break;
                        case 1:
                            System.out.println("Resultado é: " + calculadora.getSubtracao(num1, num2));
                            break;
                        case 2:
                            System.out.println("Resultado é: " + calculadora.getMultiplicacao(num1, num2));
                            break;
                        case 3:
                            System.out.println("Resultado é: " + calculadora.getDivisao(num1, num2));
                            break;
                    }

                }
            } while (a != 4);
            System.out.println("Finalizando...");
       }
       catch (Exception e) {
          System.out.println("Client exception: " + e);
	  e.printStackTrace();
       }
 
    }
 
}