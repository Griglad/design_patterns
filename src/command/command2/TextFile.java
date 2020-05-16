package command.command2;

public class TextFile {
    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String save() {
        return String.format("Saving file %s",name);
    }

    public String open() {
        return String.format("Opening file %s",name);
    }
}
