package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.SEX_STATUS;

public class SexResponse extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();

        User messageAuthor = message.getAuthor();
        if (!message.getContentRaw().contains("sex") || messageAuthor.isBot()) {
            return;
        }

        message.reply(String.format(SEX_STATUS, messageAuthor.getAsMention())).queue();
    }
}
