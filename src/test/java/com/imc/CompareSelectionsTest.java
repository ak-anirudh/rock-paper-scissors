package com.imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareSelectionsTest {

    CompareSelections compareSelections;

    @BeforeEach
    void init(){
        compareSelections = new CompareSelections();
    }

    @Test
    @DisplayName("Test the comparisons, user and computer selections")
    void compareSelections() {

        assertEquals(0, compareSelections.compareTheSelections(2,2));
        assertEquals(1, compareSelections.compareTheSelections(2,1));
        assertEquals(-1, compareSelections.compareTheSelections(2,3));

    }
}