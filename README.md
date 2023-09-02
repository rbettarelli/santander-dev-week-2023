
# Santander Dev Week 2023


## Diagrama de CLasses 

```mermaid
classDiagram
  class User {
    -name: String
    -account: Account
    -features: Feature[]
    -card: Card
    -news: News[]

    +getName(): String
    +getAccount(): Account
    +getFeatures(): Feature[]
    +getCard(): Card
    +getNews(): News[]
  }

  class Account {
    -number: String
    -agency: String
    -balance: Double
    -limit: Double

    +getNumber(): String
    +getAgency(): String
    +getBalance(): Double
    +getLimit(): Double
  }

  class Feature {
    -icon: String
    -description: String

    +getIcon(): String
    +getDescription(): String
  }

  class Card {
    -number: String
    -limit: Double

    +getNumber(): String
    +getLimit(): Double
  }

  class News {
    -icon: String
    -description: String

    +getIcon(): String
    +getDescription(): String
  }

  User --> Account : -account
  User --> Feature : -features
  User --> Card : -card
  User --> News : -news

  ```