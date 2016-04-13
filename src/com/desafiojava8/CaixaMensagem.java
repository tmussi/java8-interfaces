package com.desafiojava8;

import java.util.List;

@FunctionalInterface
public interface CaixaMensagem {

	static String formataMensagem(String mensagem) {
		return "\tMensagem: " + mensagem;
	}
	
	List<String> getMensagens();
	
	default String getPrimeiraMensagem(){
		return formataMensagem(getMensagens().get(0));
	}
	
}
	