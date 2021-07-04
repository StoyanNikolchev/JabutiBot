package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DiscordServerCommands extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String input = event.getMessage().getContentRaw();
        if (isValidCommand(input)) {

            if (input.equalsIgnoreCase(".report unfunny")) {
                event.getChannel().sendMessage("<:unfunnybanned:762045145893830697>\n").queue();

            } else if (input.equalsIgnoreCase(".seagull") || input.equalsIgnoreCase(".iaxii")) {
                event.getChannel().sendMessage("*omg a black man*").queue();

            } else if (input.equalsIgnoreCase(".help")) {
                event.getChannel().sendMessageFormat("Help is not coming.%nYou're next.").queue();

            } else if (isNotOtherCommand(input)){
                event.getChannel().sendMessage("*idk what that means, " + event.getMember().getUser().getName() + "*").queue();
            }
        }
    }

    private boolean isNotOtherCommand(String input) {
        return !input.equalsIgnoreCase(".ip") && !input.equalsIgnoreCase(".version") && !input.equalsIgnoreCase(".rules");
    }

    public static boolean isValidCommand(String input) {
        return input.charAt(0) == '.' && input.length() > 1;
    }
}
