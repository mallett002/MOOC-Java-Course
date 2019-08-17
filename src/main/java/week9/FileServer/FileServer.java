package week9.FileServer;

public interface FileServer {
    // Interface methods can define exceptions that can be thrown
    String download(String file) throws Exception;
    void save(String file, String string) throws Exception;
}
