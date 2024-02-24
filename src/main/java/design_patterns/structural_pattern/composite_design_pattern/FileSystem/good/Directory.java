package design_patterns.structural_pattern.composite_design_pattern.FileSystem.good;


import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String name){
        this.directoryName = name;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    public void ls(){
        System.out.println("Directory Name: " + directoryName);

        for(FileSystem fileSystem: fileSystems) {
            fileSystem.ls();
        }
    }
}

