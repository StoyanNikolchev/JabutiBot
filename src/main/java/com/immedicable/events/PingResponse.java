package com.immedicable.events;

import net.dv8tion.jda.api.entities.Mentions;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import static com.immedicable.enums.Constants.*;
public class PingResponse extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if (!botIsMentioned(event.getMessage().getMentions())) {
            return;
        }

        event.getMessage().reply(PING_RESPONSE).queue();
    }

    private boolean botIsMentioned(Mentions mentions) {
        return mentions.getMembers().stream().anyMatch(m -> m.getIdLong() == JABUTI_BOT_ID);
    }
}
