public interface Iconta{


public  void sacar(double valor);

saldo -= valor;


void depositar(double valor);
saldo  += valor;


 void transferir(double valor, Conta contadestino);
this.sacar(valor) // objeto de origem
contadestino.depositar(valor);


public String getAgencia(){
return agencia;
 
}


public String getNumero(){
returnNumero;
 
}

public String getSaldo(){
return Saldo
 
}



void ImprimirExtrato();


}