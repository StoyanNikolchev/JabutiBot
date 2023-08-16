package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.BLACK_PETE_MOMENT_VIDEO_LINK;

public class BlackPeteMomentResponse extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();

        if (message.getAuthor().isBot() ||
        !message.getContentRaw().toLowerCase().contains("black pete moment")) {
            return;
        }

        message.reply(BLACK_PETE_MOMENT_VIDEO_LINK).queue();
    }
}
