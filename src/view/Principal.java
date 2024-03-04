package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController opController = new OperacoesController();
		int pos = 5;
		double resultado = opController.somatoriaColevati(pos);
		
		System.out.println(resultado);
	}

}
