package texteditor;

public class FileEditor {

    private String content;

    public FileEditor(String content) {
        this.content = content;
    }

    public void editContent(String newContent) {
        this.content = newContent;
        System.out.println("File content edited.");
    }

    public String getContent() {
        return content;
    }
}
