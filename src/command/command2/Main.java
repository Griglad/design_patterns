package command.command2;

public class Main {

    public static void main(String... args) {

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file1.txt");

        //textFileOperationExecutor.executeOperation(textFile::open);
        //textFileOperationExecutor.executeOperation(textFile::save);

        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(textFile));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(textFile));


        textFileOperationExecutor.getTextFileOperations().forEach(e-> System.out.println(e.execute()));

    }

}
