package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testAtoMorse() {
        //Arrange
        Converter converter = new Converter();
        String expected = ".-";

        //Act
        String actual = converter.toMorse("A");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testBtoMorse() {
        //Arrange
        Converter converter = new Converter();
        String expected = "-...";

        //Act
        String actual = converter.toMorse("B");

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testABtoMorse() {
        //Arrange
        Converter converter = new Converter();
        String expected = ".- -...";

        //Act
        String actual = converter.toMorse("AB");

        //Assert
        assertEquals(expected, actual);
    }

}
