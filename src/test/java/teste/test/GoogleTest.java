package teste.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import teste.page.GooglePO;

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes() {

        googlePage = new GooglePO(driver);

    }

    @Test
    public void TC001_deveSerPossivelPesquisarNoGoogleBatataFrita() {

        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

    @Test
    public void TC002_deveSerPossivelPesquisarNoGoogleTextoNutella() {

        googlePage.pesquisar("Nutella");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));

    }

}
