package CalculadoraApp;


/**
* CalculadoraApp/CalculadoraPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculator.idl
* Segunda-feira, 7 de Fevereiro de 2022 13h30min26s BRST
*/

public abstract class CalculadoraPOA extends org.omg.PortableServer.Servant
 implements CalculadoraApp.CalculadoraOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getSoma", new java.lang.Integer (0));
    _methods.put ("getSubtracao", new java.lang.Integer (1));
    _methods.put ("getMultiplicacao", new java.lang.Integer (2));
    _methods.put ("getDivisao", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CalculadoraApp/Calculadora/getSoma
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.getSoma (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // CalculadoraApp/Calculadora/getSubtracao
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.getSubtracao (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 2:  // CalculadoraApp/Calculadora/getMultiplicacao
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.getMultiplicacao (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 3:  // CalculadoraApp/Calculadora/getDivisao
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.getDivisao (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CalculadoraApp/Calculadora:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculadora _this() 
  {
    return CalculadoraHelper.narrow(
    super._this_object());
  }

  public Calculadora _this(org.omg.CORBA.ORB orb) 
  {
    return CalculadoraHelper.narrow(
    super._this_object(orb));
  }


} // class CalculadoraPOA