package Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MemeEvents extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] messageReceived = event.getMessage().getContentRaw().split("\\s+");

        String name = event.getMember().getUser().getName();

        for (String messageElement : messageReceived) {

            if (!event.getMember().getUser().isBot()) {
                if (messageElement.equalsIgnoreCase("sex")) {
                    event.getChannel().sendMessage("*Sex is not enabled on this server, " + name + "!*").queue();
                    break;

                } else if (messageElement.equalsIgnoreCase("bearlit")) {
                    event.getChannel().sendMessage("FUCK BEARLIT").queue();
                }
            }
        }
    }
}
