# Kata

[Guess the random number](https://www.codurance.com/katas/random-number-kata)

## Business rules

- The user starts playing, the game generates a random number that must not
  change until the game it's over.
- If the user guesses the number the player wins.
- If the user does not guess the number the system would have to notify the user
  if the number it's higher or lower.
- If the user does not guess the number on three intents it will lose.

## Domain terms

- Target (number to guess)
- Guess
- Attempt

### What can I practice with this kata

Working with collaborators
Baby steps
Object Calisthenics
Test doubles

# Base para hacer tests

Configuración básica para empezar a hacer una kata o aprender a hacer tests en
los siguientes lenguajes:

- Java con Junit y Mockito

# Configuración específica por lenguaje

## Java con Junit y Mockito

1. Instalar las dependencias y tests con Maven [mvn test]
2. Ejecutar los tests con el IDE

### 📚 Documentación

- [JUnit](https://github.com/junit-team/junit/wiki)
- [Mockito](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html)

Basic parameterized test junit

```
@ParameterizedTest
@CsvSource({"4", "3", "2"})
```
