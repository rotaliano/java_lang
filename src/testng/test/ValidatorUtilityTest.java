package testng.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatorUtilityTest {

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
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isBlank(java.lang.String)}
     * のためのテスト・メソッド。(null)
     */
    @Test
    public void isBlank_01() {
        System.out.println("isBlank_01");
        assertTrue(ValidatorUtility.isBlank(null));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isBlank(java.lang.String)}
     * のためのテスト・メソッド。(空白)
     */
    @Test
    public void isBlank_02() {
        System.out.println("isBlank_02");
        assertTrue(ValidatorUtility.isBlank(""));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isBlank(java.lang.String)}
     * のためのテスト・メソッド。(正常)
     */
    @Test
    public void isBlank_03() {
        System.out.println("isBlank_03");
        assertFalse(ValidatorUtility.isBlank("xxxxx"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(null)
     */
    @Test
    public void isInt_01() {
        System.out.println("isInt_01");
        assertFalse(ValidatorUtility.isInt(null));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(空白)
     */
    @Test
    public void isInt_02() {
        System.out.println("isInt_02");
        assertFalse(ValidatorUtility.isInt(""));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(数値以外)
     */
    @Test
    public void isInt_03() {
        System.out.println("isInt_03");
        assertFalse(ValidatorUtility.isInt("x"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(正常)
     */
    @Test
    public void isInt_04() {
        System.out.println("isInt_04");
        assertTrue(ValidatorUtility.isInt("123456"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(正常マイナス値)
     */
    @Test
    public void isInt_05() {
        System.out.println("isInt_05");
        assertTrue(ValidatorUtility.isInt("-123456"));
    }

    /**
     * {@link com.mitchy_world.testng.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。(int桁あふれ)
     */
    @Test
    public void isInt_06() {
        System.out.println("isInt_06");
        assertFalse(ValidatorUtility.isInt("12345678901234567890"));
    }
}
