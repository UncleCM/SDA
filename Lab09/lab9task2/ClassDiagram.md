# Lab 9 Task 2 - Mediator Pattern Class Diagram

```mermaid
classDiagram
    class Mediator {
        -SwedishBuyer swedishBuyer
        -FrenchBuyer frenchBuyer
        -AmericanSeller americanSeller
        -DollarConverter dollarConverter
        +registerSwedishBuyer(swedishBuyer: SwedishBuyer)
        +registerFrenchBuyer(frenchBuyer: FrenchBuyer)
        +registerAmericanSeller(americanSeller: AmericanSeller)
        +registerDollarConverter(dollarConverter: DollarConverter)
        +placeBid(bid: float, currency: String): boolean
    }
    
    class Buyer {
        #Mediator mediator
        #String unitOfCurrency
        +Buyer(mediator: Mediator, unitOfCurrency: String)
        +attemptToPurchase(bid: float): boolean
    }
    
    class SwedishBuyer {
        +SwedishBuyer(mediator: Mediator)
    }
    
    class FrenchBuyer {
        +FrenchBuyer(mediator: Mediator)
    }
    
    class AmericanSeller {
        -Mediator mediator
        -float priceInDollars
        +AmericanSeller(mediator: Mediator, priceInDollars: float)
        +isBidAccepted(bidInDollars: float): boolean
    }
    
    class DollarConverter {
        -Mediator mediator
        +DOLLAR_UNIT: float = 1.0f
        +EURO_UNIT: float = 0.7f
        +KRONA_UNIT: float = 8.0f
        +DollarConverter(mediator: Mediator)
        -convertEurosToDollars(euros: float): float
        -convertKronorToDollars(kronor: float): float
        +convertCurrencyToDollars(amount: float, unitOfCurrency: String): float
    }
    
    class Demo {
        +main(args: String[]): void
    }

    %% Inheritance relationships
    Buyer <|-- SwedishBuyer
    Buyer <|-- FrenchBuyer
    
    %% Mediator pattern relationships
    Mediator --> SwedishBuyer : mediates
    Mediator --> FrenchBuyer : mediates
    Mediator --> AmericanSeller : mediates
    Mediator --> DollarConverter : uses
    
    %% Components know about mediator
    SwedishBuyer --> Mediator : registers with
    FrenchBuyer --> Mediator : registers with
    AmericanSeller --> Mediator : registers with
    DollarConverter --> Mediator : registers with
    
    %% Demo creates and uses all components
    Demo ..> Mediator : creates
    Demo ..> SwedishBuyer : creates
    Demo ..> FrenchBuyer : creates
    Demo ..> AmericanSeller : creates
    Demo ..> DollarConverter : creates

    note for Mediator "Central coordinator that handles\ncommunication between buyers,\nseller, and currency converter"
    note for Buyer "Abstract base class for\nall buyer types"
    note for DollarConverter "Handles currency conversions\nfrom Krona and Euro to USD"
```

## Pattern Explanation

### Mediator Pattern Components:

1. **Mediator**: Central coordinator that encapsulates how multiple objects interact
2. **Colleagues**: 
   - `SwedishBuyer` & `FrenchBuyer` (buyers with different currencies)
   - `AmericanSeller` (accepts/rejects bids in USD)
   - `DollarConverter` (currency conversion service)

### Key Relationships:

- **Registration**: All components register themselves with the mediator
- **Communication**: Buyers don't directly communicate with seller or converter
- **Coordination**: Mediator handles bid placement, currency conversion, and seller interaction
- **Decoupling**: Components are loosely coupled through the mediator interface

### Workflow:
1. Buyer calls `attemptToPurchase()`
2. Mediator receives `placeBid()` call
3. Mediator uses DollarConverter to convert currency
4. Mediator checks with AmericanSeller for bid acceptance
5. Result is returned through the mediator chain