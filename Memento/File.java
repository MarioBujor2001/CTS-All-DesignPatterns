package Memento;

public class File {
    private String content;

    public File(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }

    public FileSnapshot createFileSnapshot(String comment){
        return new FileSnapshot(content, comment);
    }

    public void restoreFile(FileSnapshot snapshot){
        this.content = snapshot.getContent();
    }

    public String getContent() {
        return content;
    }
}
