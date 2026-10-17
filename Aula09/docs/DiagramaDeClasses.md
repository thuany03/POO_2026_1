# Aula 09 - 16/10 

Documentação técnica da aula do dia 16/10.

## Diagrama de Classes

``` mermaid
classDiagram
    class Profissional{
        <<abstract>>
        -nome : String
        +calcularSalarioBruto()* double
    }

    class Professor{
        -siape: String
        +calcularSalarioBruto() double
    }

    class Aluno {
        -matricula: String
        +autenticar(senha: String) boolean
    }

    class Autenticavel{
        
    }

    Profissional <|-- Professor
    Autenticavel <|.. Aluno
    Autenticavel <|.. Professor