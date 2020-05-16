package command.command2;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();


    public String executeOperation(TextFileOperation operation){
        textFileOperations.add(operation);
        return operation.execute();
    }

    public List<TextFileOperation> getTextFileOperations(){
        return new ArrayList<>(textFileOperations);
    }


}
