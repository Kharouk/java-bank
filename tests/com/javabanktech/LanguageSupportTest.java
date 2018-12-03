package com.javabanktech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageSupportTest {
    LanguageSupport language = new LanguageSupport();

    @Test
    void TestingForDefaultLanguage() {
        String expected = "English";
        assertEquals(expected, language.getLanguage());
    }
}