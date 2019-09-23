# JUnit training #
### Conventions de nommage ###

En règle générale, un nom de test doit expliquer en quoi consiste le test. Si cela est fait correctement, la lecture de la mise en œuvre réelle peut être évitée.
Une convention possible consiste à utiliser le "devrait" dans le nom de la méthode de test. Par exemple, "ordersShouldBeCreated" ou "menuShouldGetActive". Cela donne une indication de ce qui devrait se passer si la méthode de test est exécutée.
Une autre approche consiste à utiliser "Étant donné [ExplainYourInput] When [WhatIsDone] Then [ExpectedResult]]" pour le nom complet de la méthode de test
On finit le nom de la classe de test par “Test”. Exemple: GarageTest.
La convention standard des outils de construction Maven et Gradle consiste à utiliser:
src / main / java - pour les classes Java
src / test / java - pour les classes de test

### Exemple ###

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}
