# Tarefa 016 - Configuração de software em tempo de execução, Generics, Closure e Logging - 03/08/2022

1. Considere o material disponibilizado no SIGAA a respeito do temas temas que compõem o título desta tarefa.
2. Solicita-se o estudo deste material e fazer o seguinte exercício:
   2.1. Criar um projeto, na linguagem de programação da sua preferência. Este projeto deverá contemplar os quatro temas, preferencialmente um em cada pacote com seu nome.


Professor, eu consegui inclui um exemplo de cada tema em separado.

Exemplo de runtime config:
Independente das linguagem de programação e IDE o desenvolvedor consegue trabalhar com as variáveis de ambiente, com todas as configurações de parametrização já definidas. Isso é utilizado quando o código é compilado e executado, resgatando o que foi armazenado.

Typescript Runtime config:
... 
 /* Modules */
    "module": "commonjs",                                /* Specify what module code is generated. */
    "rootDir": "./src",                                  /* Specify the root folder within your source files. */
    "moduleResolution": "node",                       /* Specify how TypeScript looks up a file from a given module specifier. */
    // "baseUrl": "./",                                  /* Specify the base directory to resolve non-relative module names. */
    // "paths": {},                                      /* Specify a set of entries that re-map imports to additional lookup locations. */
    // "rootDirs": [],                                   /* Allow multiple folders to be treated as one when resolving modules. */
    // "typeRoots": [],                                  /* Specify multiple folders that act like './node_modules/@types'. */
    // "types": [],                                      /* Specify type package names to be included without being referenced in a source file. */
    // "allowUmdGlobalAccess": true,                     /* Allow accessing UMD globals from modules. */
    // "moduleSuffixes": [],                             /* List of file name suffixes to search when resolving a module. */
    // "resolveJsonModule": true,                        /* Enable importing .json files. */
    // "noResolve": true,                                /* Disallow 'import's, 'require's or '<reference>'s from expanding the number of files TypeScript should add to a project. */
...

Exemplo de Closure: função dentro de função, com referência.
#include <stdio.h>
#include <math.h>

float f(float x1, float x2, float e){
    if((pow(x2,2)-x1)<0 && (-1*(pow(x2,2)-x1))<e){
        return x2;
    } else if((pow(x2,2)-x1)>0 && (pow(x2,2)-x1)<e){
            return x2;
    } else{
        return f(x1, ((x1/x2)+x2)/2, e);
    }
}

int main() {
    double x, erro;
    scanf("%lf %lf", &x, &erro);
    if(x>0 && erro>0){
        printf("%.6f\n", f(x, x/2, erro));
    }
}

Exemplo de Generics: 
import java.util.ArrayList; // import the ArrayList class
ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

O arraylist, em java, permite inserir o tipo genérico no <> a medida que a variável é declarada. No exemplo, trata-se de um arraylist de car.

Exemplo de log:
No caso de problema com a aplicação, ferramentas como log4j, auxiliam o desenvolvedor a identificar a causa raiz do problema.

try {
    ...something that can throw an ignorable exception
} catch( Exception ex ) {
    LOGGER.log( Level.SEVERE, ex.toString(), ex );
}

**INSTRUÇÕES**
1. Esta é uma tarefa individual. A entrega deve ser entregue no seu repositório pessoal utilizado para a manutenção do controle de versão dos artefatos da disciplina, dentro de uma pasta chamada tarefa016.
2. Esta é uma tarefa correspondente à aula do dia 03/08/2022, no entanto só foi disponibilizada aos alunos no dia 09/08/2022, devido aos problemas de saúde enfrentados pelo professor.
4. O prazo para entrega desta tarefa é as 23h59min do dia 16/08/2022.
