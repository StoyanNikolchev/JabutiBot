package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.EmojiReferences.UNFUNNY_BANNED_EMOJI_ID;

public class UnfunnyReply extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        if (!message.getContentRaw().trim().equalsIgnoreCase("unfunny")
                || message.getMessageReference() == null) {
            return;
        }

        Message referencedMessage = message.getMessageReference().getMessage();
        referencedMessage.addReaction(Emoji.fromFormatted(UNFUNNY_BANNED_EMOJI_ID)).queue();
    }
}
