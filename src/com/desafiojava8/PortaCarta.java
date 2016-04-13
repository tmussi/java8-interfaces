package com.desafiojava8;

import java.util.Arrays;
import java.util.List;

public class PortaCarta implements CaixaMensagem {

	List<String> cartas = Arrays.asList("Multa de transito", "Conta de luz", "Conta telefone", "Conta do condominio");
	
	@Override
	public List<String> getMensagens() {
		System.out.println("Indo até o porta carta na frente de casa...");
		System.out.println("Verificando novas cartas..");
		return cartas;
	}

}
