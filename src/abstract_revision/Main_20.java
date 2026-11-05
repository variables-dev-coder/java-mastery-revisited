package abstract_revision;

interface FileStorage {

    void upload(String fileName);

    void download(String fileName);

    default void showStorageType() {
        System.out.println("File Storage System");
    }

    static void supportedFormats() {
        System.out.println("PDF, JPG, PNG, TXT");
    }
}

class LocalStorage implements FileStorage {

    @Override
    public void upload(String fileName) {
        System.out.println(fileName + " uploaded to local storage");
    }

    @Override
    public void download(String fileName) {
        System.out.println(fileName + " downloaded from local storage");
    }
}

class CloudStorage implements FileStorage {

    @Override
    public void upload(String fileName) {
        System.out.println(fileName + " uploaded to cloud");
    }

    @Override
    public void download(String fileName) {
        System.out.println(fileName + " downloaded from cloud");
    }
}

public class Main_20 {

    public static void main(String[] args) {

        FileStorage.supportedFormats();

        FileStorage storage = new LocalStorage();

        storage.showStorageType();
        storage.upload("resume.pdf");

        storage = new CloudStorage();

        storage.upload("profile.jpg");
        storage.download("profile.jpg");
    }
}
