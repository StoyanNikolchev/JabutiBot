package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MinecraftServerCommands extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String input = event.getMessage().getContentRaw();
        if (isValidCommand(input)) {

            if (input.equalsIgnoreCase(".ip")) {
                event.getChannel().sendMessage("*The IP of OldFacs is 51.68.102.222:25578*").queue();

            } else if (input.equalsIgnoreCase(".version")) {
                event.getChannel().sendMessage("*The server is currently running on 1.16.5*").queue();

            } else if (input.equalsIgnoreCase(".rules")) {
                event.getChannel().sendMessage("*The* **Minecraft server** *has* **no** *rules. But the Discord server* **does:** <#705002346274488364>").queue();
            }
        }
    }

    public static boolean isValidCommand(String input) {
        return input.charAt(0) == '.' && input.length() > 1;
    }
}
