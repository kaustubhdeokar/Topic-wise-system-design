package texteditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FileManager {

    private ConcurrentMap<String, FileEditor> openFiles = new ConcurrentHashMap<>();
    //any number of threads can read - but write has to be done by taking a lock.
    //syncrhonized hash map - total lock on the file.
    public void openFile(String fileName, String content) {
        FileEditor fileEditor = new FileEditor(content);
        openFiles.put(fileName, fileEditor);
    }

    public void editFile(String fileName, String newContent) {
        FileEditor fileEditor = openFiles.get(fileName);
        if (fileEditor != null) {
            fileEditor.editContent(newContent);
        } else {
            System.out.println("File not found.");
        }
    }

    public FileEditor getFileEditor(String fileName) {
        return openFiles.get(fileName);
    }

}
