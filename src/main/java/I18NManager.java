public class I18NManager {
    private static I18NManager ourInstance = new I18NManager();

    public static I18NManager getInstance() {
        return ourInstance;
    }

    private I18NManager() {
    }
}
