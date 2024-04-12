package testes;

import elementos.ElementosKawasaki;
import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Stepskawasaki {

	Metodos me = new Metodos();
	ElementosWeb ew = new ElementosWeb();
	ElementosKawasaki ewk = new ElementosKawasaki();

	// Funcionalidade ver todas as noticias sobre competicoes

	@Given("que eu esteja na aplicacao {string}")
	public void que_eu_esteja_na_aplicacao(String appURL) {
		me.abrirNavegador(appURL, "Abrindo Navegador");
		me.maximizarTela();

	}

	@Given("clicar na funcionalidade competicoes")
	public void clicar_na_funcionalidade_competicoes() {
		me.clicar(ewk.getButtonCompeticoes());

	}

	@When("clicar na funcionalidade noticias sobre competicoes")
	public void clicar_na_funcionalidade_noticias_sobre_competicoes() {
		me.clicar(ewk.getButtonNoticias());

	}

	@Then("valido a mensagem {string}")
	public void valido_a_mensagem(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getMensagemValidacao());
		me.fecharNavegador();

	}

	// Testar a barra de pesquisa do site kawasaki

	@Given("pesquisar o modelo da moto na barra de pesquisa {string}")
	public void pesquisar_o_modelo_da_moto_na_barra_de_pesquisa(String kawasakiVulcan) {
		me.escrever(kawasakiVulcan, ewk.getBarraPesquisaKawasaki());
		me.clicar(ewk.getLupaPesquisa());

	}

	@When("clicar na opcao kawasaki vulcan s | cruiser | estilo e desempenho")
	public void clicar_na_opcao_kawasaki_vulcan_s_cruiser_estilo_e_desempenho() {
		me.clicar(ewk.getVulcanS());

	}

	@Then("valido a positiva mensagem {string}")
	public void valido_a_positiva_mensagem(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getMensagemVulcan());
		me.fecharNavegador();

	}

	// testar a funcionalidade novos produtos em destaques

	@Given("clicar na funcionalidade Novos produtos em destaque")
	public void clicar_na_funcionalidade_novos_produtos_em_destaque() {
		me.clicar(ewk.getNovosProdutosDestaque());

	}

	@When("clicar no modelo ninja zx10r krt edition")
	public void clicar_no_modelo_ninja_zx10r_krt_edition() {
		me.clicar(ewk.getNinjaZx10r());

	}

	@Then("valido o resultado positivo {string}")
	public void valido_o_resultado_positivo(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getEspecificacoesModelo());
		me.fecharNavegador();

	}

	// testar a funcionalidade Histora da Kawasaki

	@When("clicar na funcionalidade historia")
	public void clicar_na_funcionalidade_historia() {
		me.clicar(ewk.getHistoriaKawasaki());

	}

	@Then("valido a mensagem de historia {string}")
	public void valido_a_mensagem_de_historia(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getMensagemHistoria());
		me.fecharNavegador();

	}

	// Testar a funcionalidade Serviço de Atendimento ao Consumidor

	@When("clicar na funcionalidade S.A.K. - Serviço De Atendimento Kawasaki")
	public void clicar_na_funcionalidade_s_a_k_serviço_de_atendimento_kawasaki() {
		me.clicar(ewk.getServicoAtendimento());

	}

	@Then("valido a mensagem do servico de atendimento {string}")
	public void valido_a_mensagem_do_servico_de_atendimento(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getInformacoesCorporativas());
		me.fecharNavegador();

	}

	// testar a funcionalidade comparar veiculos

	@Given("clicar em ferramentas de compra")
	public void clicar_em_ferramentas_de_compra() {
		me.clicar(ewk.getFerramentaDeCompra());

	}

	@Given("clicar em comparar os veiculos")
	public void clicar_em_comparar_os_veiculos() {
		me.clicar(ewk.getCompararVeiculos());

	}

	@Given("clicar em vulcan2")
	public void clicar_em_vulcan2() throws InterruptedException {
		Thread.sleep(1000);
		me.clicar(ewk.getVulcan2());

	}

	@Given("clicar em adicionar a comparacao vulcans")
	public void clicar_em_adicionar_a_comparacao_vulcans() {
		me.clicar(ewk.getAdicionarComparacao1());

	}

	@Given("clicar em adicionar comparacao vulcan s cafe")
	public void clicar_em_adicionar_comparacao_vulcan_s_cafe() {
		me.clicar(ewk.getAdicionarComparacao2());

	}

	@When("clicar em comparar veiculos")
	public void clicar_em_comparar_veiculos() {
		me.clicar(ewk.getComparacaoVeiculos());

	}

	@Then("confirmo a validacao da mensagem {string}")
	public void confirmo_a_validacao_da_mensagem(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getMessageComparacao());
		me.fecharNavegador();
	}

	// Teste Negativo da funcionalidade Me Increva

	@Given("clicar na funcionalidade inscreva")
	public void clicar_na_funcionalidade_inscreva() {
		me.clicar(ewk.getInscreva());

	}

	@Given("preencher {string}")
	public void preencher(String email) {
		me.escrever(email, ewk.getEmailInscreva());

	}

	@When("clicar na funcionalidade me inscrever")
	public void clicar_na_funcionalidade_me_inscrever() {
		me.submit(ewk.getMeInscrever());
	}

	@Then("valido a mensagem negativa {string}")
	public void valido_a_mensagem_negativa(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getMensagemNegativaRobo());
		me.fecharNavegador();

	}

	// Teste Negativo da funcionalidade Registrar-se

	@Given("clicar na funcionalidade minha kawasaki")
	public void clicar_na_funcionalidade_minha_kawasaki() {
		me.clicar(ewk.getMinhaKawasaki());

	}

	@Given("preencher o campo email {string}")
	public void preencher_o_campo_email(String campoEmailKawasaki) {
		me.escrever(campoEmailKawasaki, ewk.getCampoEmailKawasaki());

	}

	@Given("preencher o campo senha {string}")
	public void preencher_o_campo_senha(String campoSenha) {
		me.escrever(campoSenha, ewk.getCampoSenha());

	}

	@When("preencher o campo confirmar senha {string}")
	public void preencher_o_campo_confirmar_senha(String confirmSenha) {
		me.escrever(confirmSenha, ewk.getConfirmSenha());

	}

	@Then("valido o resultado negativo {string}")
	public void valido_o_resultado_negativo(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getNegativaKawasakiSenha());
		me.fecharNavegador();

	}

	// Testar a funcionalidade Recalls

	@When("clicar na funcionalidade recalls")
	public void clicar_na_funcionalidade_recalls() {
		me.clicar(ewk.getRecalls());

	}

	@Then("valido a positiva {string}")
	public void valido_a_positiva(String mensagemRecalls) {
		me.validarTexto(mensagemRecalls, ewk.getMensagemRecalls());
		me.fecharNavegador();

	}

	// Testar a funcionalidade barra de pesquisa com outra montadora/Caso de Teste
	// Negativo

	@When("preencher o campo barra de pesquisa {string}")
	public void preencher_o_campo_barra_de_pesquisa(String yamahaPesquisa) {
		me.escrever(yamahaPesquisa, ewk.getYamahaPesquisa());
		me.clicar(ewk.getLupaYamaha());

	}

	@Then("confirmo a mensagem negativa {string}")
	public void confirmo_a_mensagem_negativa(String textoEsperado) {
		me.validarTexto(textoEsperado, ewk.getYamahaMensagemNeg());
		me.fecharNavegador();

	}

}