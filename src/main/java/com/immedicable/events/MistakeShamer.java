package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageReference;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.MISTAKE_SHAME_RESPONSE;

public class MistakeShamer extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        MessageReference messageReference = event.getMessage().getMessageReference();

        if (!event.getMessage().getContentRaw().trim().equalsIgnoreCase("mistake") ||
        messageReference == null) {
            return;
        }

        Message referencedMessage = messageReference.getMessage();
        referencedMessage.reply(MISTAKE_SHAME_RESPONSE).queue();
    }
}
