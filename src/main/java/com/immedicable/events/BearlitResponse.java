package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BearlitResponse extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();

        if (!message.getContentRaw().toLowerCase().contains("bearlit")
        || message.getAuthor().isBot()) {
            return;
        }

        message.reply("**FUCK BEARLIT**").queue();
    }
}
