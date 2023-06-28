package bootcamp.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User steven = new Millenials("Steven");
        User david = new YGeneration("David");
        User luck = new ZGeneration("Luck");

        //when
        String stevenShouldBe = steven.sharePost();
        System.out.println(stevenShouldBe);
        String davidShouldBe = david.sharePost();
        System.out.println(davidShouldBe);
        String luckShouldBe = luck.sharePost();
        System.out.println(luckShouldBe);

        //then
        assertEquals("Twitter", stevenShouldBe);
        assertEquals("Facebook", davidShouldBe);
        assertEquals("Snapchat", luckShouldBe);
    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User steven = new Millenials("Steven");

        //when
        steven.setSharePost(new SnapchatPublisher());
        String result = steven.sharePost();

        //then
        assertEquals("Snapchat", result);
    }
}
