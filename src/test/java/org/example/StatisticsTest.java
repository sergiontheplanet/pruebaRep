package org.example;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StatisticsTest {

    @Test
    public void maximumValueReturnsTheRightValue() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {3.5, 2.0, 10.5, 1.2, 9.4};
        double expectedValue = 10.5;

        // Act
        double obtainedValue = statistics.maximumValue(numbers);

        // Assert
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void maximumValueRaisesAnExceptionIfTheArrayIsEmpty() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {};

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> statistics.maximumValue(numbers));
    }

    @Test
    public void meanReturnsTheRightValue() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double expectedValue = 3.0;

        // Act
        double obtainedValue = statistics.mean(numbers);

        // Assert
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void meanRaisesAnExceptionIfTheArrayIsEmpty() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {};

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> statistics.mean(numbers));
    }

    @Test
    public void minimumValueReturnsTheRightValue() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {3.5, 2.0, 7.8, 1.2, 9.4};
        double expectedValue = 1.2;

        // Act
        double obtainedValue = statistics.minimumValue(numbers);

        // Assert
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void minimumValueRaisesAnExceptionIfTheArrayIsEmpty() {
        // Arrange
        Statistics statistics = new Statistics();
        double[] numbers = {};

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> statistics.minimumValue(numbers));
    }

}