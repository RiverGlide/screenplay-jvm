package com.riverglide.screenplay;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ActorTest {

    @Test
    public void rememberAString() throws Exception {
        Actor inARole = new Actor();
        ItemToRemember<String> itemToRemember = new ItemToRemember<String>("Something to remember");

        inARole.remember(itemToRemember);

        assertThat(inARole.getIt(), is(itemToRemember.item()));
    }

    @Test
    public void rememberAnInteger() throws Exception {
        Actor inARole = new Actor();
        ItemToRemember<Integer> item = new ItemToRemember<Integer>(1);

        inARole.remember(item);

        assertThat(inARole.getIt(), is(item.item()));
    }
}
