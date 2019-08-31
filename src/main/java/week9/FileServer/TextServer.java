package week9.FileServer;

import java.util.HashMap;
import java.util.Map;

public class TextServer implements FileServer {

    private Map<String, String> data;

    public TextServer() {
        this.data = new HashMap<>();
    }

    @Override
    public String download(String file) throws Exception {
        return this.data.get(file);
    }

    @Override
    public void save(String file, String string) throws Exception {
        this.data.put(file, string);
    }
}
