package SOLID_Principles_Intro_level;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class ReadOnlyFile implements Readable {

    @Override
    public void read() {
        System.out.println("Reading file");
    }
}

class EditableFile implements Readable, Writable {

    @Override
    public void read() {
        System.out.println("Reading editable file");
    }

    @Override
    public void write() {
        System.out.println("Writing to editable file");
    }
}

public class Main_9 {

    public static void main(String[] args) {

        Readable file1 = new ReadOnlyFile();
        Readable file2 = new EditableFile();

        file1.read();
        file2.read();

        Writable file3 = new EditableFile();
        file3.write();
    }
}
