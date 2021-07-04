package Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class OwnerReact extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split("\\s+");
        for (String element : message) {
            if (element.equalsIgnoreCase("immedicable")) {
                Message message1 = event.getMessage();
                message1.addReaction(":immedicable:600447154233802847").queue();
            } else if (element.equalsIgnoreCase("void")) {
                Message message1 = event.getMessage();
                message1.addReaction("void:641631494527254539").queue();
            }
        }
    }

}
