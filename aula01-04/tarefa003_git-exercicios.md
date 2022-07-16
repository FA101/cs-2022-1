### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
O comando é: git --version. O meu, por exemplo, apresentou a resposta git version 2.33.0.windows.2.

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help 
  A resposta foi um enorme conjunto de linhas com exemplos de comandos de uso, como --version, --help, --path; E comandos comuns do git, como "start a working area", "work on the current change", "examine the history and state", "grow, mark and tweak your common history", "collaborate" e subcomandos.
  
  b. git help checkout
  A princípio eu achei que nada havia ocorrido, mesmo após um tempo de processamento. Em teoria eu sei que deveria explicar o que é o comando "checkout". Depois eu vi que uma aba no navegador foi aberta, com um arquivo .html apresentando a página do manual para o comando git-checkout. A explicação é simples: to switch branches or restore working tree files.
  
  c. git help merge
  Uma aba no navegador foi aberta, com um arquivo .html apresentando a página do manual para o comando git-merge. A explicação é simples: to join two or more development histories together.
  
  d. git init
  Inicializa um repositório Git vazio no usuário local.
  
  e. git add --all
  Adiciona todos os arquivos do repositório para o stage.
  
  f. git add -u
  Adiciona apenas os arquivos alterados do repositório para o stage.
  
  g. git config -l
  O mesmo que git config --list, ou seja, lista todas as variáveis que podem ser utilizadas em uma configuração do git e seus respectivos valores.
  
  h. git mv a.txt b.txt
  Comando para apagar o arquivo a.txt e criar o arquivo b.txt com o mesmo conteúdo de a.txt, ou seja, um atalho para mv a.txt b.txt -> git add b.txt -> git rm a.txt.
  
  i. git reset --hard
  Encontrei que o comando reseta o índice e a árvore em que se trabalha, mas não compreendi o que isso significa. Imagino que seja para apagar uma branch e descartar arquivos não comitados. Parece ser um comando avançado pela descrição na documentação de apoio não ser amigável a usuários iniciantes.
  
  j. git log -27
  Mostra o log de commits até o limite de 27 itens.
  
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
Depois do commit é necessário incluir a mensagem do commit, geralmente editando um editor de texto e salvando a mensagem, e, por fim, fazer um git push <a> <b>, como o git push origin main.

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
O comando git status.

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
O comando git status -u[<mode>] ou git status --untracked-files[<mode>] serve para isso.

6. Qual o comando para efetuar um _commit_?
O comando é git commit.

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
Agora eu entendi a função do git reset -hard! Outro comando para isso é o git clean -fxd.

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
O repositório a ser ignorado deve possui um arquivo .gitignore. Existem configurações mais avançadas para o uso avançado desse arquivo.

9. O que acontece se o seu repositório local for acidentalmente removido?
Ele continuará removido, até você recuperá-lo por uma gerramenta na interface gráfica antes de 90 dias. Depois desse prazo ele é permanentemente deletado.

10. Como clonar um repositório remoto?
O comando git clone <url> permite clonar um repositório remoto.

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
O comando para isso é o git log --pretty=oneline.

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
No disco local para um dado usuário, com nome .gitconfig.

13. Qual o comando para criar um repositório local?
O ocmando git init cria um repositório local.

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
O nome padrão é main. Parece quem em algumas versões o nome padrão era master.

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
O comando é git add . adiciona todos os arquivos em um dado diretório. O comando git add * adiciona todos os arquivos em um dado diretório, exceto os que começam com .

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
SHA1 significa secure hash algorithm, recurso de criptografia criado para identificar revisões e proteger os códigos contra corrupção.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
Para não mostrar todas as informações, o comando deve ser formatado conforme a informação que se busca com git log --pretty=format: %an %ae %s por exemplo.

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
A partir do momento que se utiliza o git add -u os dois arquivos passam do status untracked para o stage, prontos para serem comitados.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
Essa parte exige maior atenção, pois pode ser confusa. Os dois comandos trabalham com os conceitos de: diretório de trabalho - árvore de trabalho, stage = índice, e cabeça = repositório. São comandos que seguem o padrão git reset <mode> <commit>. No mode=soft não há alteração no arquivo índice ou na área de trabalho, apenas o resete na cabeça. No mode=hard há alteração no arquivo índice e na área de trabalho, deletando qualquer arquivo não comitado ou não adicionado.
Assim, um git reset --soft HEAD~1 irá remover o último commit da área de trabalho corrente, sem alterar as edições feitas nos arquivos editados. Isso permite tranquilamente utilizar o comando git commit na sequência. Agora, caso seja utilizado um git reset --hard apaga tudo o que foi feito, inclusive descartando as alterações nos arquivos.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
Os comandos são git clean -f -d ou git clean -fd.

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
O arquivo se chama .gitignore.

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
Trata-se de uma configuração do arquivo .gitignore. É possível utilizar o prefixo ! para remover esse padrão.

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery). Faça o clone deste repositório.
Feito!

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
Apareceu uma lista de usuários em três colunas: um número, um nome e um e-mail.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
Apareceu duas mensagens:
origin  https://github.com/jquery/jquery (fetch)
origin  https://github.com/jquery/jquery (push)


26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
O comando é git tag.

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
Neste caso o comando é git tag -1 <padrão>.

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Cria a tag "3.4-gold" e adiciona a mensagem "minha versão ouro"

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Mostra as tags "3.4-gold".

30. O que o comando **git push origin 3.4-gold** teria como efeito?
Envia os arquivos na stage com a tag "3.4-gold".

31. Após executar um commit, qual o efeito de **git commit --amend**?
Ele permite modificar o último commit, como a mensagem do log ou arquivos comitados. 

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
Você deleta qualquer alteração feita no arquivo.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
Você recupera o arquivo a.txt da árvore de trabalho. A minha dúvida está no nome diferente. O anterior era x.txt e o comando usa a.txt. 

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
O primeiro comando deleta as alterações feitas em a.txt e o segundo insere novamente o arquivo a.txt na árvore de trabalho.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
O comando foi executado, porém não compreendi o resultado, mesmo após a leitura da referência.


INSTRUÇÕES:

1. No seu repositório pessoal, criar a pasta aula04.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 07/06/2021, as 23h59min.











</DIV/>
