package com.immedicable.features;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Status extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        event.getJDA().getPresence().setActivity(Activity.playing("on OldFacs.com"));
    }
}
