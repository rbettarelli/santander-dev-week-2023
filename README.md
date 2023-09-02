
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


  }

  class Account {
    -number: String
    -agency: String
    -balance: Double
    -limit: Double

    
  }

  class Feature {
    -icon: String
    -description: String

  
  }

  class Card {
    -number: String
    -limit: Double

 
  }

  class News {
    -icon: String
    -description: String

  }

  User --> Account : -account
  User --> Feature : -features
  User --> Card : -card
  User --> News : -news

  ```
