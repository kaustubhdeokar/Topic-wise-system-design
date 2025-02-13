package texteditor;

import texteditor.undo_redo.EditorHistory;
import texteditor.undo_redo.EditorState;

public class SublimeIDE {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();
        FileEditor fileEditor = new FileEditor("Initial content of test.java");
        fileManager.openFile("test.java", "Initial content of test.java");
        fileManager.editFile("test.java", "Modified content of test.java");

        UndoCommand undoCommand = new UndoCommand(fileManager.getFileEditor("test.java"));
        undoCommand.execute();

        EditorHistory editorHistory = new EditorHistory();
        editorHistory.saveState(new EditorState(fileEditor.getContent()));

        // Modifying content again
        fileManager.editFile("test.java", "Second modification.");
        editorHistory.saveState(new EditorState(fileEditor.getContent()));

        // Undo to restore previous state
        EditorState previousState = editorHistory.undo();
        if (previousState != null) {
            fileManager.getFileEditor("test.java").editContent(previousState.getContent());
            System.out.println("Restored content: " + fileManager.getFileEditor("test.java").getContent());
        }




    }

}
