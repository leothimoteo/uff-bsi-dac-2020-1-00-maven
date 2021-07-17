package hello;

/**
*
* @author Maycon Prata
*/
public class Cumprimento {

	private static String cumprimento;

	private static int horario;

	public Cumprimento(String dia, String tarde, String noite) {
		this.setCumprimento(this.cumprimentar(dia, tarde, noite, horario));
	}

	public static String getCumprimento() {
		return cumprimento;
	}

	public void setCumprimento(String cumprimento) {
		this.cumprimento = cumprimento;
	}

	public static int getHorario() {
		return horario;
	}

	public static void setHorario(int horario) {
		Cumprimento.horario = horario;
	}

	/**
	 * Retorna um cumprimento de acordo com horário o correspodente
	 * 
	 * @return cumprimento
	 */
	private String cumprimentar(String dia, String tarde, String noite, int horario) {
		String cumprimento;
		if (horario >= 12 && horario < 18) {
			cumprimento = tarde;
		} else if (horario >= 18 && horario < 24) {
			cumprimento = noite;
		} else {
			cumprimento = dia;
		}
		return cumprimento;
	}

}
