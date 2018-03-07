import Idiomes.I18NManager;
import org.apache.log4j.Logger;
/**
 * Created by jordi on 07/03/2018.
 */
public class Main {
    final static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args){
        org.apache.log4j.BasicConfigurator.configure();
        String paraula = I18NManager.getInstance().GetText("T3","cat");
        System.out.println(paraula);
        log.debug("Prova de log:" + paraula);
    }
}
