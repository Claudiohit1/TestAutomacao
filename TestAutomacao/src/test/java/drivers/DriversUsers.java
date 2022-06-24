package drivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosWeb;
import metodosuse.MetodosUser;

public class DriversUsers {

	MetodosUser metodos = new MetodosUser();
	ElementosWeb elementos = new ElementosWeb();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.invisalign.com.br/");
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void test() {

		metodos.clicarSpan(elementos.clicarSpan);
		metodos.preencherCep(elementos.preencherCep, "30110-000");
		metodos.clicarGo(elementos.clicarGo);
		metodos.agendaConsulta(elementos.agendaConsulta);
		metodos.preencherNome(elementos.preencherNome, "Joselito Carmona Machado Silva de Alencar");
		metodos.digitarData(elementos.digitarData, "26/06/1978");
		metodos.digitarPhone(elementos.digitarPhone, "(11)99999-9999");
		metodos.preencherSobrenome(elementos.preencherSobrenome, "Salinas");
		metodos.preencherEmail(elementos.preencherEmail, "salinas33@gmail.com");
		metodos.confirmaCep(elementos.confirmaCep, "30110-000");
		metodos.enviarMensagem(elementos.enviarMensagem,
				"Estou en trando em contato, pois quero agendar uma consulta. Agradeço desde então.");
		metodos.clicarMensagem(elementos.clicarMensagem);

	}

}
