package mockito.test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.testng.Assert.assertEquals;
import mockito.src.Controller;
import mockito.src.Service;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class ControllerTest {

    @Mock
    private Service service;
    @Spy
    @InjectMocks
    private Controller controller; // Controllerクラスがテスト対象ですので、Controllerクラスに@InjectMocks

    @BeforeMethod
    private void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetContent() {
        Integer id = 1;
        // thenメソッド系
        // when(モックオブジェクト.メソッド(任意の引数))： スタブを可能とするメソッドです。
        // 特定のメソッドを呼び出して、その返り値に特定の値を入れる時に使います。
        // thenReturn(返り値)： スタブメソッドの返り値を指定するのに使います。
        when(service.getContentById(id)).thenReturn("Hi, Mockito");
        assertEquals(controller.getContent(id), "Hi, Mockito");
    }

    @Test
    public void test_getContent() {
        Integer id = 1;
        // idに1を入れた時、"Contetn1"が返ってくるようにServiceモックオブジェクトのスタブ化されたgetContentByIdメソッドを定義
        when(service.getContentById(id)).thenReturn("Content1");

        // Controllerモックオブジェクトのスタブ化されたeditContentメソッドだけを再定義
        doReturn("EditedContent1").when(controller).editContent("Content1");
        // Controllerモックオブジェクトの他のメソッドはスタブ化されているが、再定義しない限り元の内部ロジックを持ったまま

        // 期待している返り値
        String expected = "EditedContent1";
        // 実際の返り値
        String actual = controller.getContent(id);

        // 期待している返り値と実際の返り値を比較検証
        assertEquals(actual, expected);
    }
}
