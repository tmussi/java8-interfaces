package com.desafiojava8;

import java.util.Arrays;
import java.util.List;

public class SecretariaEletronica implements CaixaMensagem {

	List<String> mensagensEletronicas = Arrays.asList("Mensagem de (11) 1111.1111", "Mensagem de (22) 2222.2222");

	@Override
	public List<String> getMensagens() {
		System.out.println("Conectando na secretária eletronica...");
		System.out.println("Verificando novas mensagens...");
		return mensagensEletronicas;
	}

}