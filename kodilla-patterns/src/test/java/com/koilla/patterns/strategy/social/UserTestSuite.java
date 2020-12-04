package com.koilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User frank = new Millenials("Frank");
        User snider = new YGeneration("Snider");
        User tom = new ZGeneration("Tom");
        //When
        String frankPost = frank.sharePost();
        System.out.println("Frank posts on " + frankPost);
        String sniderPost = snider.sharePost();
        System.out.println("Snider posts on " + sniderPost);
        String tomPost = tom.sharePost();
        System.out.println("Tom posts on " + tomPost);
        //Then
        Assert.assertEquals("Facebook", frankPost);
        Assert.assertEquals("Snapchat", sniderPost);
        Assert.assertEquals("Twitter", tomPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User frank = new Millenials("Frank");
        //When
        String frankPost = frank.sharePost();
        System.out.println("Frank posts on " + frankPost);
        frank.setNewPublisher(new SnapchatPublisher());
        frankPost = frank.sharePost();
        System.out.println("Frank now posts on " + frankPost);
        //Then
        Assert.assertEquals("Snapchat", frankPost);
    }
}
