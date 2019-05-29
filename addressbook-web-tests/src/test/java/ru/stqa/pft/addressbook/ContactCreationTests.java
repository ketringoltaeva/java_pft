package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        gotoContactPage();
        fillContactForm(new ContactData("name", "patronymic", "surname", "Ketrin", "tester", "1c", "Orenburg", "777", "888", "999"));
        submitContactCreation();
        logout();
    }

}
