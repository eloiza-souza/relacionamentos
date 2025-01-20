# Relacionamentos em Programação

## Associação
Relacionamento estrutural do tipo **TEM-UM**
```mermaid
classDiagram
Pessoa --> Endereco : tem um
class Pessoa {
- Endereco endereco
  }
  class Endereco {
- String rua
- String cidade
  }
```

## Agregação
Relação **É PARTE DE**, os objetos podem existir independentemente.

```mermaid
classDiagram
Time o-- Jogador : é parte de
class Time {
  - List<Jogador> jogadores
}
class Jogador {
  - String nome
}
```

## Composição
Relação **É PARTE DE**, os objetos não podem existir independentemente.

```mermaid
classDiagram
Casa *-- Quarto : é parte de
class Casa {
    - Quarto quarto
}
class Quarto {
    - String tipo
}
```

## Herança
Representa uma relação **É-UM**.
```mermaid
classDiagram
Animal <|-- Cachorro : é um
class Animal {
    - String nome
}
class Cachorro {
    - String raca
}
```

## Dependência
Representa uma relação **USA**.
```mermaid
classDiagram
Carro ..> Motor : usa
class Carro {
    + dirigir(Motor motor)
}
class Motor {
    + ligar()
}
```