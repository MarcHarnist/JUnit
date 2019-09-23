# JUnit training #
### Conventions de nommage ###

En r�gle g�n�rale, un nom de test doit expliquer en quoi consiste le test. Si cela est fait correctement, la lecture de la mise en �uvre r�elle peut �tre �vit�e.
Une convention possible consiste � utiliser le "devrait" dans le nom de la m�thode de test. Par exemple, "ordersShouldBeCreated" ou "menuShouldGetActive". Cela donne une indication de ce qui devrait se passer si la m�thode de test est ex�cut�e.
Une autre approche consiste � utiliser "�tant donn� [ExplainYourInput] When [WhatIsDone] Then [ExpectedResult]]" pour le nom complet de la m�thode de test
On finit le nom de la classe de test par �Test�. Exemple: GarageTest.
La convention standard des outils de construction Maven et Gradle consiste � utiliser:
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
