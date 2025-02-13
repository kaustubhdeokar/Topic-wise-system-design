package texteditor.undo_redo;

import java.util.Stack;

public class EditorHistory {
    private Stack<EditorState> history = new Stack<>();

    public void saveState(EditorState state) {
        history.push(state);
    }

    public EditorState undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
