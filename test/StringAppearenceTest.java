package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringAppearenceTest {

    StringAppearence obj;
    @Before
    public void setUp() throws Exception {
        obj = new StringAppearence();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkStrAppearence() {
        String str = "a b c d a c c";
        String strArr[] = str.split(" ");
        Map<String, Boolean> hmap1 = new HashMap<>();
        hmap1.put("a",true);
        hmap1.put("b",false);
        hmap1.put("c",true);
        hmap1.put("d",false);
        assertEquals(hmap1, obj.checkStrAppearence(strArr));

        String str2 = "";
        String strArr2[] = str2.split(" ");
        Map<String, Boolean> hmap2 = new HashMap<>();
        hmap2.put("",false);
        assertEquals(hmap2, obj.checkStrAppearence(strArr2));

        String str3 = "ab abc b c abcd d a c c";
        String strArr3[] = str3.split(" ");
        Map<String, Boolean> hmap3 = new HashMap<>();
        hmap3.put("ab",false);
        hmap3.put("abc",false);
        hmap3.put("b",false);
        hmap3.put("abcd",false);
        hmap3.put("d",false);
        hmap3.put("a",false);
        hmap3.put("c",true);
        assertEquals(hmap3, obj.checkStrAppearence(strArr3));

        String str4[] = null;
        assertNull(obj.checkStrAppearence(str4));
    }
}
