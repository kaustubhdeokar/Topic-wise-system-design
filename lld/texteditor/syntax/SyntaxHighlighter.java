package texteditor.syntax;

//strategy pattern.
public class SyntaxHighlighter implements ISyntaxHighlighter{

    @Override
    public void highlight() {
        System.out.println("basic highlighted");
    }
}
