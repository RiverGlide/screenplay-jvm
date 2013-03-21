package com.riverglide.screenplay;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ActorTest {

    @Test
    public void remembersAnyOldThing() throws Exception {
        List<ItemToRemember<?>> items = new ArrayList<ItemToRemember<?>>();
        items.add(new ItemToRemember<Float>(new Float(1.234)));
        items.add(new ItemToRemember<Boolean>(false));

        for(ItemToRemember<?> remembered : items) {
            Actor inARole = new Actor();
            inARole.remember(remembered);

            assertThat("for example [" + remembered.item().toString() + "]",
                    inARole.getIt(), is(remembered.item())
            );
        }
    }

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
        ItemToRemember<Integer> remembered = new ItemToRemember<Integer>(1);

        inARole.remember(remembered);

        assertThat(inARole.getIt(), is(remembered.item()));
    }
}
