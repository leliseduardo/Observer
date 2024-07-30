package observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void shouldNotifyAUser() {
        Theme theme = new Theme("Information Technology");
        NewsArticle newsArticle = new NewsArticle("Google Duplex Officially Launched in Brazil", "14/06/2022", theme);
        User user = new User("Anna");
        user.setTheme(theme);
        theme.updateNewsForTheme();
        assertEquals("Anna, there is a new news article about Information Technology that might interest you.", user.getLastNotification());
    }

    @Test
    void shouldNotifyUsers() {
        Theme theme = new Theme("Information Technology");
        NewsArticle newsArticle = new NewsArticle("Google Duplex Officially Launched in Brazil", "14/06/2022", theme);
        User user1 = new User("Anna");
        User user2 = new User("Rodrigo");
        user1.setTheme(theme);
        user2.setTheme(theme);
        theme.updateNewsForTheme();
        assertEquals("Anna, there is a new news article about Information Technology that might interest you.", user1.getLastNotification());
        assertEquals("Rodrigo, there is a new news article about Information Technology that might interest you.", user2.getLastNotification());
    }

    @Test
    void shouldNotNotifyUser() {
        Theme theme = new Theme("Information Technology");
        NewsArticle newsArticle = new NewsArticle("Google Duplex Officially Launched in Brazil", "14/06/2022", theme);
        User user = new User("Anna");
        theme.updateNewsForTheme();
        assertEquals(null, user.getLastNotification());
    }

    @Test
    void shouldNotifyUserInterestedInTheme1() {
        Theme theme1 = new Theme("Information Technology");
        NewsArticle newsArticle1 = new NewsArticle("Google Duplex Officially Launched in Brazil", "14/06/2022", theme1);

        Theme theme2 = new Theme("Sports");
        NewsArticle newsArticle2 = new NewsArticle("Ferrari Reveals Frenetic Call Behind Sainz's Pit Stop in Canada", "21/06/2022", theme2);

        User user1 = new User("Anna");
        User user2 = new User("Rodrigo");

        user1.setTheme(theme1);
        user2.setTheme(theme2);

        theme1.updateNewsForTheme();

        assertEquals("Anna, there is a new news article about Information Technology that might interest you.", user1.getLastNotification());
        assertEquals(null, user2.getLastNotification());
    }
}
