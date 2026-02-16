package diceGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testName() {
        //Arrange
        //Skapa objekt och testdata
        //Skapa ett Player objekt (med namnet Staffan)
        //Datatyp variabelnamn = new konstuktor(parametrar, parametrar);
        //Address address = new Address("Storgatan", 12);
        Player player = new Player("Staffan");

        //Spara expected namn (Staffan)
        String expected = "Staffan";

        //Act
        //Använd själva metoden och spara verkliga resultatet (actual)
        //Hämta det sparade namnet (actual)
        String actual = player.getName();

        //Assert
        //Jämför actual med förväntat resultat
        assertEquals(expected, actual);

    }

    @Test
    public void changeScore() {
        Player player = new Player("Staffan");
        int expected = 12;

        player.changeScore(10);
        player.changeScore(2);

        int actual = player.getScore();

        assertEquals(expected, actual);
    }


}
