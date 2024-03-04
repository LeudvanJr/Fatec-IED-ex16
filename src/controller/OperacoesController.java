package controller;

import java.util.HashMap;

public class OperacoesController {
	
	HashMap<Long, Long> fat = new HashMap<Long, Long>();
	
	public OperacoesController() {
		fat.put(1l, 1l);
	}
	
	//Funcao para calcular a somatoria: 1+(1/2!)+(1/3!)+(1/4!)+(1/5!)+...+(1/n!)
	public double somatoriaColevati(int n) {
		//A recursica encerra quando chega no 1º termo da sequencia
		if(n == 1)
			return 1;
		
		//Faz-se divisao do termo atual e soma-se com o termo anterior da sequencia
		return (1.0/fatorial(n)) + somatoriaColevati(n-1);
	}
	
	public long fatorial(long num) {
		
		if(fat.containsKey(num))
			return fat.get(num);
		
		long resultado = num * fatorial(num-1); 
		fat.put(num, resultado);
		
		return resultado;
	}
}
