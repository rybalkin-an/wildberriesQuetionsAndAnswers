package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$x;

public class FaqPage {

    private final SelenideElement searchInputField = $x("//input[@class='faq-search-input tooltipstered']");
    private final SelenideElement searchInputFieldButton = $x("//input[@class='faq-search-btn']");
    private final ElementsCollection searchResultList = $$x("//ul[@class='faq-result-list j-ul-faq-search-results']//span");

    @Step("Выполнен ввод {text} в поисковое поле")
    public FaqPage sendKeysToSearchInputFields(String text){
        searchInputField.sendKeys(text);
        return this;
    }

    @Step("Выполнено нажатие на кнопку поиск")
    public FaqPage clickSearchFieldButton(){
        searchInputFieldButton.click();
        return this;
    }

    @Step("Получен список элементов с резултатами поиска")
    public ElementsCollection getSearchResultList(){
        return searchResultList;
    }
}
