
public class Testa_Banco {

public static void main(String[] args) {
	
	Clinte Daniel = new Clinte();
	Daniel.nome = "Daniel Leite";
	Daniel.CPF = "699.065.991-20";
	Daniel.profissao = "Dev";
	
	Conta contaDoDaniel = new Conta ();
	contaDoDaniel.deposita(200);
	
	contaDoDaniel.titular = Daniel;
	 System.out.println(contaDoDaniel.titular.nome);	

}




}
