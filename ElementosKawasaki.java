package elementos;

import org.openqa.selenium.By;

public class ElementosKawasaki {

	// Elementos funcionalidade noticias de competicoes

	private By buttonCompeticoes = By.id("racingDropdown");
	private By buttonNoticias = By.cssSelector(
			"body > nav > div.categoryContainer.clearfix.d-none.d-lg-block > div > ul.nav.float-right > li:nth-child(3) > div > div > div > div > div.col.col-lg-3.listContainer > a:nth-child(2)");
	private By mensagemValidacao = By.cssSelector(
			"body > div.body-content > div.news > section > div:nth-child(2) > div > div.col-sm-12.col-md-9 > h3");

	public By getButtonCompeticoes() {
		return buttonCompeticoes;
	}

	public By getButtonNoticias() {
		return buttonNoticias;
	}

	public By getMensagemValidacao() {
		return mensagemValidacao;
	}

	// testar a funcionalidade barra de pesquisa do site da kawasaki

	public By getBarraPesquisaKawasaki() {
		return barraPesquisaKawasaki;
	}

	public By getVulcanS() {
		return vulcanS;
	}

	public By getMensagemVulcan() {
		return MensagemVulcan;
	}

	public By getLupaPesquisa() {
		return lupaPesquisa;
	}

	private By barraPesquisaKawasaki = By.cssSelector(
			"body > nav > div.navbar.navbar-expand-lg > div > div > ul > li:nth-child(3) > div > div > input");
	private By vulcanS = By.cssSelector("#resultsInfo > div:nth-child(2) > div > div > a > div");
	private By MensagemVulcan = By.cssSelector("#overview > div > table > tbody > tr > td:nth-child(1) > h1");
	private By lupaPesquisa = By.cssSelector("#searchboxbutton > svg");

	// testar a funcionalidade Novos produtos em destaque

	public By getNovosProdutosDestaque() {
		return novosProdutosDestaque;
	}

	public By getNinjaZx10r() {
		return ninjaZx10r;
	}

	public By getEspecificacoesModelo() {
		return especificacoesModelo;
	}

	private By novosProdutosDestaque = By.cssSelector("#news > div:nth-child(1) > a:nth-child(1)");
	private By ninjaZx10r = By.cssSelector(
			"body > div.body-content > section > div > div > div.col-sm-12.col-lg-9.productGroup > div > div > div:nth-child(1) > a > div.headFour");
	private By especificacoesModelo = By.cssSelector("#specs > div > table > tbody > tr > td:nth-child(1) > h1");

	// testar a funcionalidade História da Kawasaki

	public By getHistoriaKawasaki() {
		return historiaKawasaki;
	}

	public By getMensagemHistoria() {
		return mensagemHistoria;
	}

	private By historiaKawasaki = By.cssSelector("#about > div:nth-child(1) > a:nth-child(1)");
	private By mensagemHistoria = By.cssSelector(
			"body > div.body-content > div.history > section.corporation > div > table > tbody > tr > td:nth-child(1) > h1");

	// testar a funcionalidade serviço de atendimento ao consumidor

	public By getServicoAtendimento() {
		return servicoAtendimento;
	}

	public By getInformacoesCorporativas() {
		return informacoesCorporativas;
	}

	private By servicoAtendimento = By.cssSelector("#resources > div:nth-child(1) > a:nth-child(1)");
	private By informacoesCorporativas = By.cssSelector(
			"body > div.body-content > div.corporateInfo.pb-4 > section > div > table > tbody > tr > td:nth-child(1) > h1");

//testar a funcionalidade comparação entre os veiculos

	public By getFerramentaDeCompra() {
		return ferramentaDeCompra;
	}

	public By getCompararVeiculos() {
		return compararVeiculos;
	}

	public By getVulcan2() {
		return vulcan2;
	}

	public By getAdicionarComparacao1() {
		return adicionarComparacao1;
	}

	public By getAdicionarComparacao2() {
		return adicionarComparacao2;
	}

	public By getComparacaoVeiculos() {
		return comparacaoVeiculos;
	}

	public By getMessageComparacao() {
		return messageComparacao;
	}

	private By ferramentaDeCompra = By.id("purchaseTools");
	private By compararVeiculos = By.cssSelector(
			"body > nav > div.categoryContainer.clearfix.d-none.d-lg-block > div > ul.nav.float-right > li:nth-child(1) > div > div > div > div > div.col.col-lg-5.split > div > a:nth-child(4) > h3");
	private By vulcan2 = By.cssSelector("#collapseModel > label:nth-child(4)");
	private By adicionarComparacao1 = By.cssSelector(
			"#CompareVehiclesDetail > div.container > div.row.compareLanding > div.col-sm-12.col-md-9 > div:nth-child(4) > div.groupContainer > div.trimGroupContainer > div.row > div:nth-child(1) > div > div > div.headFive.addCompareText");
	private By adicionarComparacao2 = By.cssSelector(
			"#CompareVehiclesDetail > div.container > div.row.compareLanding > div.col-sm-12.col-md-9 > div:nth-child(4) > div.groupContainer > div.trimGroupContainer > div.row > div:nth-child(2) > div > div > div.headFive.addCompareText");
	private By comparacaoVeiculos = By.cssSelector(
			"#CompareVehiclesDetail > div.container > div.selectedVehiclesADA.sticky-top-compare-veh.pt-xs-1.pt-sm-1.pt-lg-2 > div.row.d-flex.justify-content-center.xs-min-height-100.md-min-height > div.col-3.offset.text-center.d-xs-none.d-sm-none.d-md-none.d-lg-block > a.blackBtn.compareButton");
	private By messageComparacao = By
			.cssSelector("#CompareVehiclesDetail > div.container > table > tbody > tr > td:nth-child(1) > h1");

//Caso de Teste Negativo da funcionalidade Me Inscreva

	public By getInscreva() {
		return inscreva;

	}

	public By getEmailInscreva() {
		return emailInscreva;
	}

	public By getMensagemNegativaRobo() {
		return mensagemNegativaRobo;
	}

	public By getMeInscrever() {
		return meInscrever;
	}

	private By inscreva = By.cssSelector("#subscribe > a.footerBtn");
	private By emailInscreva = By.cssSelector("#Email");
	private By meInscrever = By.cssSelector("#subscribeForm > div:nth-child(8) > button");
	private By mensagemNegativaRobo = By.cssSelector("#validationSummary > div > span");

	// Caso de Teste Negativo da funcionalidade Registrar-se

	public By getMinhaKawasaki() {
		return minhaKawasaki;
	}

	public By getCampoEmailKawasaki() {
		return campoEmailKawasaki;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public By getConfirmSenha() {
		return confirmSenha;
	}

	public By getRegistraSe() {
		return registraSe;
	}

	public By getNegativaKawasakiSenha() {
		return negativaKawasakiSenha;
	}

	private By minhaKawasaki = By.cssSelector(
			"body > nav > div.navbar.navbar-expand-lg > div > div > ul > li.list-inline-item.myHide > a > div");
	private By campoEmailKawasaki = By.id("RegistrationEmail");
	private By campoSenha = By.id("RegistrationPassword");
	private By confirmSenha = By.id("ConfirmRegistrationPassword");
	private By negativaKawasakiSenha = By.id("RegistrationPassword-error");
	private By registraSe = By.cssSelector("#regForm > div:nth-child(11) > button");

	// Testar a funcionalidade Recalls do site kawasaki brasil

	public By getRecalls() {
		return recalls;
	}

	public By getMensagemRecalls() {
		return mensagemRecalls;
	}

	private By recalls = By.cssSelector("#resources > div:nth-child(1) > a:nth-child(2)");
	private By mensagemRecalls = By.cssSelector(
			"body > div.body-content > div.recall > section > div > div > div > div > p:nth-child(1) > span");

	// Testando a funcionalidade barra de pesquisa com outro modelo de montadora

	public By getYamahaPesquisa() {
		return yamahaPesquisa;
	}

	public By getYamahaMensagemNeg() {
		return yamahaMensagemNeg;
	}

	public By getLupaYamaha() {
		return lupaYamaha;
	}

	private By yamahaPesquisa = By.cssSelector(
			"body > nav > div.navbar.navbar-expand-lg > div > div > ul > li:nth-child(3) > div > div > input");
	private By yamahaMensagemNeg = By.cssSelector("#SearchResults > div > div:nth-child(3) > div > h1");
	private By lupaYamaha = By.cssSelector("#searchboxbutton > svg");

	// Testar a funcionalidade de emplacamento gratis 2023

	public By getEmplacamentoGratis() {
		return emplacamentoGratis;

	}

	public By getCondicoesEspeciais() {
		return condicoesEspeciais;
	}

	private By emplacamentoGratis = By.cssSelector(
			"body > div.body-content > section.homePromotions > div > div > div:nth-child(1) > a > div > div > div > h2");
	private By condicoesEspeciais = By.cssSelector(
			"body > div.body-content > div.offersDetail > section:nth-child(1) > div.container > table > tbody > tr > td:nth-child(1) > h1");

}
