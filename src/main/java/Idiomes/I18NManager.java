package Idiomes;

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

    public String GetText(String key,ResourceBundle language){
        ResourceBundle rb= data.get(language);
        if(rb==null)
        {
            rb=ResourceBundle.getBundle("I18N."+language);
        }
    }
}
