# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

# Resposta do Desafio

**Conteudo abaixo editado e adicionado por hawkeruh.**

Para a aplicação foi feito os objetos: 'Usuario', 'Professor', 'ConteudoEducacional' e 'Formacao'.

Para os objetos de classe de dados foi utilizado variavéis imutavéis por questões de segurança. 

Foi montado três cenários diferentes para demonstrar o uso dos objetos com seus atributos e funções. As informações (input) a serem passadas para os objetos foram colocadas diretamente no main para simular os cenários ao invés de perguntas ao usuários utilizando funções (tipo 'cadastrarProfessor()') para focar na orientação de objetos utilizando Kotlin. 

## Observações

- Existem vários modos de otimizar esse código quando se trata da criação de objetos e a inserção dos mesmos dentro da lista, evitando repetições. Porém, desse modo, está legível e dá pra entender passo a passo a lógica para seguir nos cenários, está mirado em um código mais educacional. 

- Já que todos os input são feitos dentro do main, capturar exceções de erros de input são desnecessários.

## Cenário 1 

Há uma mudança no elenco de professores da Dio. O professor Gustavo está se aposentando e um novo professor foi contratado! O novo professor chamado Vlad Tepes inicia lecionando o conteudo de 'Teoria dos Grafos' com os demais professores.

## Cenário 2 

Para aproveitar a sua especialidade em computação quântica e interesse do mercado na área, professor Vlad Tepes cria um conteudo detalhado e avançado sobre o assunto. A formação é de nível avançado e especializado.

## Cenário 3

Grande quantidade de novatos se inscrevem devido ao sucesso do conteúdo abrangendo a computação quântica. Surgindo assim uma nova necessidade: Uma formação para ensinar os fundamentos necessários para um melhor entendimento e facilidade para acompanhar o curso avançado de computação quântica. 
Nova leva de professores são contratados, e pela primeira vez na plataforma, não são professores da área de tecnologia, mas da área de física, matemática e química. 
