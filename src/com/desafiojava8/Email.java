package com.desafiojava8;

import java.util.Arrays;
import java.util.List;

public class Email implements CaixaMensagem {

	List<String> emails = Arrays.asList("Email 1","Email 2");
	
	@Override
	public List<String> getMensagens() {
		System.out.println("Conectando no servidor de email!");
		return emails;
	}

	public void facaAlgumaCoisa() {
		CaixaMensagem.formataMensagem(getMensagens().get(0));
	}
	

}
