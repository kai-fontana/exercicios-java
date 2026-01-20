package semana;

import java.util.*;

public class DiasDaSemana {
	Scanner input = new Scanner(System.in);

	public String receberDia() {
		System.out.println("Insira o dia da semana:");
		String dia = input.nextLine();
		return dia;
	}

	public void verificarDias() {
		String dia = receberDia();
		switch (dia) {
		case "segunda", "terca", "terça", "quarta", "quinta", "sexta":
			System.out.println(dia + " é um " + Semana.DIA_DA_SEMANA);
			System.out.println("Bom trabalho!");
			break;
		case "sábado", "sabado", "domingo":
			System.out.println(dia + " é um " + Semana.FINAL_DE_SEMANA);
			System.out.println("Bom final de semana!");
			break;
		default:
			System.out.println("Ocorreu um erro");
		}
	}
}