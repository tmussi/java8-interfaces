package com.desafiojava8;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CaixaMensagem sms = new CaixaMensagem() {
			
			@Override
			public List<String> getMensagens() {
				return Arrays.asList("SMS 1", "SMS 2");
			}
		};
		
		CaixaMensagem smsLambda = () -> Arrays.asList("SMS Lambda 1", "SMS Lambda 2");
		
		System.out.println(sms.getPrimeiraMensagem());
		System.out.println(smsLambda.getPrimeiraMensagem());
		
//		List<CaixaMensagem> caixasMensagem = Arrays.asList(new Email(),new SecretariaEletronica(), new PortaCarta());
//
//		for (CaixaMensagem caixaMensagem : caixasMensagem) {
//			System.out.println(caixaMensagem.getPrimeiraMensagem());
//		}
	}

}
