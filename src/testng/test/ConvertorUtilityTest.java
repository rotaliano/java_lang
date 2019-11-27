package testng.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ConvertorUtilityTest {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#nullToBlank(java.lang.String)}
     * のためのテスト・メソッド。(nullをブランクに)
     */
    @Test
    public void nullToBlank_01() {
        System.out.println("nullToBlank_01");
        assertEquals("", ConvertorUtility.nullToBlank(null));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#nullToBlank(java.lang.String)}
     * のためのテスト・メソッド。(ブランクをブランクに)
     */
    @Test
    public void nullToBlank_02() {
        System.out.println("nullToBlank_02");
        assertEquals("", ConvertorUtility.nullToBlank(""));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#nullToBlank(java.lang.String)}
     * のためのテスト・メソッド。(文字列はそのまま)
     */
    @Test
    public void nullToBlank_03() {
        System.out.println("nullToBlank_03");
        assertEquals("xyz", ConvertorUtility.nullToBlank("xyz"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#concatHyphen(java.lang.String, java.lang.String)}
     * のためのテスト・メソッド。(null+null)
     */
    @Test
    public void concatHyphen_01() {
        System.out.println("concatHyphen_01");
        assertEquals("-", ConvertorUtility.concatHyphen(null, null));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#concatHyphen(java.lang.String, java.lang.String)}
     * のためのテスト・メソッド。(null+文字列)
     */
    @Test
    public void concatHyphen_02() {
        System.out.println("concatHyphen_02");
        assertEquals("-xyz", ConvertorUtility.concatHyphen(null, "xyz"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#concatHyphen(java.lang.String, java.lang.String)}
     * のためのテスト・メソッド。(文字列+null)
     */
    @Test
    public void concatHyphen_03() {
        System.out.println("concatHyphen_03");
        assertEquals("abc-", ConvertorUtility.concatHyphen("abc", null));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ConvertorUtility#concatHyphen(java.lang.String, java.lang.String)}
     * のためのテスト・メソッド。(文字列+文字列)
     */
    @Test
    public void concatHyphen_04() {
        System.out.println("concatHyphen_04");
        assertEquals("abc-xyz", ConvertorUtility.concatHyphen("abc", "xyz"));
    }
}
