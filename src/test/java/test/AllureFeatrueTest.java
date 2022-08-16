package test;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.Test;

@Feature("登录模块")
public class AllureFeatrueTest {
    @Test
    @Story("登录成功")
    public void funTest() {
        System.out.println("test1");
    }

    @Test
    public void test() {
        Allure.step("测试步骤1", this::funTestis1);
        Allure.step("测试步骤2", this::funTestis2);
        assert 1+1==2;
    }

    @Step("测试步骤1")
    private void funTestis1() {
        System.out.println("测试步骤1");
    }

    @Step("测试步骤2")
    private void funTestis2() {
        System.out.println("测试步骤2");
    }
}
