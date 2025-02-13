package texteditor.auto_complete;

public class AutoCompleteDecorator extends CodeEditor {
    private CodeEditor editor;

    public AutoCompleteDecorator(CodeEditor editor) {
        this.editor = editor;
    }

    @Override
    public void display() {
        editor.display();
        System.out.println("Auto-completion feature enabled.");
    }
}
