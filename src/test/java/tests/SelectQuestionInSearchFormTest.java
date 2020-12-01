package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FaqPage;
import pages.MainPage;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.open;

public class SelectQuestionInSearchFormTest extends BaseTest{
    private final String question = "доставка товаров";
    private final String firstExpectedResult = "Доставка товаров";
    private final String secondExpectedResult = "Когда поступит заказ?";

    @BeforeMethod
    public void setUp() {
        open(host);
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(description="Получение ответов на частые вопросы используя поиск")
    public void TestFaqSearch(){
        FaqPage faqPage = new MainPage()
                .goToFaqPage();

        ElementsCollection searchResultList = faqPage
                .sendKeysToSearchInputFields(question)
                .clickSearchFieldButton()
                .getSearchResultList();

        searchResultList.shouldHaveSize(2);
        searchResultList.get(0).shouldHave(Condition.text(secondExpectedResult));
        searchResultList.get(1).shouldHave(Condition.text(firstExpectedResult));
    }

}
