# Relacionamentos em Progamação

## Associação
Relacionamento estrutural do tipo **TEM-UM**
```mermaid
classDiagram
Person --> Address : tem um
class Person {
- Address address
  }
  class Address {
- String street
- String city
  }


