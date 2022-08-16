package test;

import com.sun.javafx.css.CalculatedValue;
import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Junit5Test {

    @Test
//    用例等级
    @Severity(SeverityLevel.BLOCKER)
    public void run1(){
        assert 1+1==3;
        assert 1+1==2;
    assertThat(2,equalTo(2));
    }

    @Test
//    link链接
    @Link(name = "测试链接",url = "https://www.kancloud.cn/apachecn/howtodoinjava-zh/1953155")
    public void run(){
        System.out.println("hahh");
//        超时断言
        assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500));
    }


    @Test
//    数组断言
    @DisplayName("测试是否相等")
    public void test() {
//        Allure.description("动态描述信息");
        boolean[] t = {true, true};
        boolean[] p = {true, true};
        Assert.assertArrayEquals("test", t, p);
    }

    @Test
    @Description("测试描述信息")
    public void test1() {
        Assertions.assertEquals(4, 2+2,"eeee");
        System.out.println("test");
//        Assertions.assertEquals(1,2,"不相等");
    }
//    @Test
//    public void test2() {
//
//        boolean[] t = {true, true};
//        boolean[] p = {true, true};
//        Assert.assertArrayEquals("test", t, p);
//    }
}
