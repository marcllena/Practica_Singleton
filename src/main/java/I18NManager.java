import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager ourInstance;

    private HashMap<String,ResourceBundle> data;

    public static I18NManager getInstance() {
        if (ourInstance==null)
            ourInstance = new I18NManager();
        return ourInstance;
    }

    private I18NManager() {
        data= new HashMap<String, ResourceBundle>();

    }
}
