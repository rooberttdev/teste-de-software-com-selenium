package teste.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para criação das novas PagesObjects.
 * Todas as pages devem ser herdadas desta classe.
 */
public class BasePO {

    /** Driver base que será usado pelas pages. */
    protected WebDriver driver;

    /**
     * Construtor base para criação da fabrica de elementos (PageFactory)
     * 
     * @param driver Driver da página atual
     */
    protected BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
