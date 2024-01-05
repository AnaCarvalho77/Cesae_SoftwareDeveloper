package Ex_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void isPalindrome(){
        assertTrue(StringUtils.isPalindrome("11111"));
        assertTrue(StringUtils.isPalindrome("12321"));
        assertTrue(StringUtils.isPalindrome("ala"));
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("Ana"));

        assertFalse(StringUtils.isPalindrome("amor"));
        assertFalse(StringUtils.isPalindrome("132654"));
        assertFalse(StringUtils.isPalindrome("Carro"));
        assertFalse(StringUtils.isPalindrome(null));
    }

}
