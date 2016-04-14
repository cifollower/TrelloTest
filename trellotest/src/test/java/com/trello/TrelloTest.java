package com.trello;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TrelloTest {


    @Test
    public void testLoginAndBoard() {
        //open current page
        open("https://trello.com/login/");
        //Find element with $ command, #user this mask for our id element which equal to [id='user']
        //Command .setValue it's command for "What to do" for login type action
        $("#user").setValue("mkoval@tcgsi.com");
        $("#password").setValue("mkoval21388");
        //Command .pressEnter it's press Enter action
        $("#user").pressEnter();

        //Create new board Test1
        $(".js-open-add-menu").click();
        $(".js-new-board").click();
        $("#boardNewTitle").setValue("Test1");
        $(".primary").click();
    }

        @Test
        public void AddCard() {
            //Create new Lists "SeleniumTest"
            $(".list-name-input").click();
            $(".list-name-input").sendKeys("SeleniumTest", Keys.ENTER);
            $(".open-card-composer").click();
            $(".list-card-composer-textarea").setValue("12345").pressEnter();
            $(".icon-lg").click();
        }

            @Test
            public void AddCardSe() {
                //Create new Lists "SeleniumAutoTest"
                $(".list-name-input").click();
                $(".list-name-input").sendKeys("SeleniumAutoTest", Keys.ENTER);
                $(By.xpath("//*[@id='board']/div[2]/div/a")).shouldBe(visible).click();
                $(".list-card-composer-textarea").setValue("0908765").pressEnter();
                $(".icon-lg").click();
            }
    

/*
        //Find login menu buttons as class and click on it
        $(".member").click();
        $(".js-logout").click();
*/

}
