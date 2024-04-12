#Author: guilherme.lobato09@gmail.com


Feature: testar diversas funcionalidades dentro do site da kawasaki

   Background: 
   Given que eu esteja na aplicacao "https://www.kawasakibrasil.com"
  
 Scenario: pesquisar a funcionalidade ver todas as noticias
	    
	  And clicar na funcionalidade competicoes
	  When clicar na funcionalidade noticias sobre competicoes
	  Then valido a mensagem "VEJA AS ÚLTIMAS NOTÍCIAS"
	  
 Scenario: testar a funcionalidade barra de pesquisa do site kawasaki
 
 		And pesquisar o modelo da moto na barra de pesquisa "kawasaki vulcan"
 		When clicar na opcao kawasaki vulcan s | cruiser | estilo e desempenho
 		Then valido a positiva mensagem "VISÃO GERAL"
 		
 		
 Scenario: testar a funcionalidade novos produtos em destaques
 		
 		And clicar na funcionalidade Novos produtos em destaque
 		When clicar no modelo ninja zx10r krt edition
 		Then valido o resultado positivo "ESPECIFICAÇÕES DO MODELO"
 		
 Scenario: testar a funcionalidade história sobre a kawasaki
 
 		When clicar na funcionalidade historia
 		Then valido a mensagem de historia "KAWASAKI HEAVY INDUSTRIES, LTD."
 		
 Scenario: testar a funcionalidade S.A.K. - Serviço De Atendimento Kawasaki
 
 		When clicar na funcionalidade S.A.K. - Serviço De Atendimento Kawasaki
 		Then valido a mensagem do servico de atendimento "INFORMAÇÕES CORPORATIVAS"
 		
 Scenario: testar a funcionalidade de comparar veiculos
 		
 		And clicar em ferramentas de compra
 		And clicar em comparar os veiculos
 		And clicar em vulcan2
 		And clicar em adicionar a comparacao vulcans
 		And clicar em adicionar comparacao vulcan s cafe
 		When clicar em comparar veiculos
 		Then confirmo a validacao da mensagem "MOTOCICLETAS"
 		
 Scenario: testar a funcionalidade inscreva no site kawasaki brasil
 
   And clicar na funcionalidade inscreva
   And preencher "guilherme.lobato09@gmail.com"
   When clicar na funcionalidade me inscrever
   Then valido a mensagem negativa "Desculpe, não é possível submeter. Existem campos inválidos no formulário abaixo."
 		
 Scenario: testar a funcionalidade registrar
 
 	 And clicar na funcionalidade minha kawasaki
 	 And preencher o campo email "guilherme.lobato09@gmail.com"
 	 And preencher o campo senha "01624"
 	 When preencher o campo confirmar senha "01624"
 	 Then valido o resultado negativo "A senha deve ter pelo menos 8 caracteres"
 	 
 Scenario: testar a funcionalidade Recalls dentro do site kawasaki brasil
   
   When clicar na funcionalidade recalls
   Then valido a positiva "A COMISSÃO DE SEGURANÇA DOS PRODUTOS DO CONSUMIDOR RECORDA"
   
 Scenario: testar a funcionalidade barra de pesquisa com modelo de moto de outra montadora
   
   When preencher o campo barra de pesquisa "yamaha"
   Then confirmo a mensagem negativa "NENHUM RESULTADO ENCONTRADO"
   
