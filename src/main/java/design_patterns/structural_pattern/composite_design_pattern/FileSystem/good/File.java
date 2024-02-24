package design_patterns.structural_pattern.composite_design_pattern.FileSystem.good;

public class File implements FileSystem {

    String fileName;

        public File(String name){
            this.fileName = name;
        }
        public void ls(){
            System.out.println("file name " + fileName);
        }


}
