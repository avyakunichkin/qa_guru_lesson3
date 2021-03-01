package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitHubTest {

    @Test
    void selenideGitHubTest(){
        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        $("[data-content=Wiki]").click();
        $("#wiki-pages-box")
                .$(byText("SoftAssertions"))
                .shouldBe(visible)
                .click();
        $x(".//*[contains(text(), 'Using JUnit5')]/../following-sibling::div//*[contains(text(), '@ExtendWith')]").shouldBe(visible);
    }
}
