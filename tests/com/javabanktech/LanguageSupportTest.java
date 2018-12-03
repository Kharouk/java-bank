package com.javabanktech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LanguageSupportTest {
    LanguageSupport language = new LanguageSupport();

    @Test
    void TestingForDefaultLanguage() {
        String expected = "English";
        assertEquals(expected, language.getLanguage());
    }

    @Test
    void BeAbleToChangeLanguage() {
        String expected = "Ruby";
        InputStream in = new ByteArrayInputStream(expected.getBytes());
        System.setIn(in);
        language.beginLaunch();
        assertEquals(expected, language.getLanguage());
    }
}