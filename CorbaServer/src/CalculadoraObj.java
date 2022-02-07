import CalculadoraApp.CalculadoraPOA;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jkayser
 */
public class CalculadoraObj extends CalculadoraPOA{
    private ORB orb;
	
    public void setORB(ORB a) {
            orb = a;
    }

    @Override
    public double getSoma(double a, double b) {
            // TODO Auto-generated method stub
            return a + b;
    }

    @Override
    public double getSubtracao(double a, double b) {
            // TODO Auto-generated method stub
            return a - b;
    }

    @Override
    public double getMultiplicacao(double a, double b) {
            // TODO Auto-generated method stub
            return a * b;
    }

    @Override
    public double getDivisao(double a, double b) {
            // TODO Auto-generated method stub
            return a / b;
    }
}
