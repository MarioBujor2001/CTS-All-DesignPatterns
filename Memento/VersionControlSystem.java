package Memento;

import java.util.HashMap;

public class VersionControlSystem {
    private static int snapshotId = 12091;
    private HashMap<String, FileSnapshot> fileVersions = new HashMap<>();

    public void addSnapshot(FileSnapshot fs){
        this.fileVersions.put(String.valueOf(snapshotId++), fs);
    }

    public FileSnapshot getFileSnaphot(String id){
        return this.fileVersions.get(id);
    }

    public void printSnapshotList(){
        System.out.println();
        this.fileVersions.forEach((s, fileSnapshot)->{
            System.out.println(s + " - "+fileSnapshot.getComment());
        });
    }
}
