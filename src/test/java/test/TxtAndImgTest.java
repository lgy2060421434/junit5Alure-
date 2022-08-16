package test;

import io.qameta.allure.Allure;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TxtAndImgTest {
    @Test
    public void addDttachment() throws FileNotFoundException {
//        添加文本展示
        Allure.addAttachment("文本信息","my txt content");
//        添加图片
        Allure.addAttachment("添加图片","image/jpg",new FileInputStream("src/test/resources/IMG20220704144723.jpg"),".jpg");
    }
}
