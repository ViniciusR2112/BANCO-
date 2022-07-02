public class   conta implements Iconta{



protected int agencia; 
protected int numero; 
protected  double saldo;

public void sacar(){

}


public void depositar(){

}

public void transferir(){

}




public String getAgencia(){
return agencia;
 
}


public String getNumero(){
returnNumero;
 
}

public String getSaldo(){
return Saldo
 
}


protected void ImprimirExtrato(){
System.out.print("Extrato da conta");
System.out.print(String.Format("Agencia: %d, this.agencia"));
System.out.print(String.Format("numero: %d, this.numero"));
System.out.print(String.Format("saldo: %d, this.saldo"));

}

}