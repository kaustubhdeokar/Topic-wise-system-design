package texteditor;

public class UndoCommand implements Command{

    private FileEditor fileEditor;
    private String prevContent;

    public UndoCommand(FileEditor fileEditor) {
        this.fileEditor = fileEditor;
        this.prevContent = fileEditor.getContent();
    }

    @Override
    public void execute() {
        fileEditor.editContent(prevContent);
    }

}
