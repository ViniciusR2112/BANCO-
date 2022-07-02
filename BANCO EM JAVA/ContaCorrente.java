public class ContaCorrente extends conta{

private static  int SEQUENCIAL = 1;
public ContaCorrente(){

super.agencia = AGENCIAL_PADRAO;
super.numero = SEQUENCIAL++ ;


}



public void ImpimirExtrato(){

System.out.print("=== Extrato Conta Corrente ===");
Super.ImprimirInfosComuns();

}



}
