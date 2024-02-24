package design_patterns.structural_pattern.composite_design_pattern.FileSystem.good;

public class Main {

    public static void main(String args[]){
        Directory d1 = new Directory("LLD");
        Directory d2 = new Directory("Shalu");
        Directory d3 = new Directory("Sanju");

        File f1 = new File("f1");
        File f2 = new File("f2");
        File f3 = new File("f3");
        File f4 = new File("f4");

/*

    LLD -- f1
        -- Sanju -- f2, f3,
        -- Shalu -- f4

 */
        d1.add(f1);
        d1.add(d2);
        d1.add(d3);
        d2.add(f2);
        d2.add(f3);
        d3.add(f4);
        d1.ls();

    }
}
