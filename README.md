 # romanNumerals
 Resolução do desafio: http://www.novaroma.org/via_romana/numbers.html
 
 ##Modelagem da resolução
   
   Na classe RomanNumerals são lidos os números informados pela função convertNumeralToRoman() que tem sobrecarga para
   cobrir números informados em int ou em String. Após as validações do valor informado, é chamado o método convertion()
   que verifica através dos restos das divisões se o número irá passar pelas validações do milhar, centena, dezena e 
   unidade. Para a conversão são utilizados dois métodos: sum() e exceptions(). O primeiro trata dos casos em que há 
   apenas a soma de caracteres repetidos para se chegar ao número. O segundo método trata primeiramente das exceções 
   em que não é necessário subtrair nada do número, pois não será necessário concatenar outro caractere à casa do número 
   sendo verificada. Os números que se enquandram neste caso são somente o 9 e o 4. Feito isto, temos o tratamento para 
   o número 5 que é um único caractere separado, mas que pode ter outros caracteres romanos concatenados junto a ele na 
   mesma casa trabalhada. Portanto, após subtraído o valor 5 que já foi concatenado, é verificado se o número é maior 
   que 0 e, caso seja, são concatenados os caracteres no método sum().
   
 ##Execução
  
  Para realizar a execução dos testes da classe RomanNumerals basta realizar o download do projeto, abri-lo em uma
  IDE (IntelliJ, NetBeans, Eclipse ou outro) e executar a classe de testes TestRomanNumerals;
