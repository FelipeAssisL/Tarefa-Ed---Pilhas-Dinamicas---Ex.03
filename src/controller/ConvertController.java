package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class ConvertController {
	
	public ConvertController() {
		super();
	}

	
	public StringBuilder DecToBin(int num) {
		Pilha p = new Pilha();
		while(num>0) {
			if (num == 1) {
				p.push(num);
			} else {
				int resto = num % 2;
				p.push(resto);
				num/= 2;
			}	
		}
		StringBuilder binario = new StringBuilder();
		while(!p.isEmpty()) {
			try {
				int resto=p.pop();
				binario.append(resto);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return binario;
	}
}
