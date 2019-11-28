package testng.test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class Test1 {

    // groups = "a" が完了し成功した後にのみ実行される
    @Test(dependsOnGroups = "a")
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = "a")
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = "a")
    public void test3() {
        System.out.println("test3");
        assertTrue(false);
    }
}
