package mockito.src;

public class Controller
{
    private Service service = new Service();

    public String getContent(Integer id) {
        // Serviceクラスのメソッドに依存している部分
        String content = service.getContentById(id);
        content = editContent(content);
        return content;
    }

    public String editContent(String content) {
        String editContent = "Edited" + content;
        return editContent;
    }
}
