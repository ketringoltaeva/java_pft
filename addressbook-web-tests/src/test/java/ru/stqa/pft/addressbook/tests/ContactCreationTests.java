package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        app.gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("name", "patronymic", "surname", "Ketrin", "tester", "1c", "Orenburg", "777", "888", "999", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.logout();
    }

}
