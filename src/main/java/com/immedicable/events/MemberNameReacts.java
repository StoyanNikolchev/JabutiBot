package com.immedicable.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Map;

import static com.immedicable.enums.EmojiReferences.*;

public class MemberNameReacts extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();

        if (message.getAuthor().isBot()) {
            return;
        }

        addMemberReacts(message);
    }

    private void addMemberReacts(Message message) {
        String messageContentsLower = message.getContentRaw().toLowerCase();

        for (Map.Entry<String, String> entry : PLAYER_NAME_AND_EMOJI_REFERENCES.entrySet()) {

            if (messageContentsLower.contains(entry.getKey())) {
                message.addReaction(Emoji.fromFormatted(entry.getValue())).queue();
            }
        }
    }
}