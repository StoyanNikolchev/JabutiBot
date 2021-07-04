package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

            } else if (input.equalsIgnoreCase(".quote")) {
                String[] randomQuote = generateRandomQuote();
                event.getChannel().sendMessageFormat("%s%n%s", randomQuote[0], randomQuote[1]).queue();

            } else if (isNotOtherCommand(input)){
                event.getChannel().sendMessage("*idk what that means, " + event.getMember().getUser().getName() + "*").queue();
            }
        }
    }

    private String[] generateRandomQuote() {
        List<String> quotes = new ArrayList<>();
        List<String> correspondingAuthors = new ArrayList<>();

        quotes.add("*sarah and i fuck all the time*");
        correspondingAuthors.add("--GronkWizard");

        quotes.add("*omg a black man*");
        correspondingAuthors.add("--iAxii");

        quotes.add("*why are there discord rules if its anarchy smh*");
        correspondingAuthors.add("--onion");

        quotes.add("*Don't forget, the facesitting Contest starts next weekend!*");
        correspondingAuthors.add("--Weiss");

        quotes.add("*i hope black pete dreams of pretzels*");
        correspondingAuthors.add("--Weiss");

        quotes.add("*Friendly reminder that he*");
        correspondingAuthors.add("--he");

        Random random = new Random();
        int number = random.nextInt(quotes.size());
        String[] output = new String[2];
        output[0] = quotes.get(number);
        output[1] = correspondingAuthors.get(number);

        return output;
    }

    private boolean isNotOtherCommand(String input) {
        return !input.equalsIgnoreCase(".ip") && !input.equalsIgnoreCase(".version") && !input.equalsIgnoreCase(".rules");
    }

    public static boolean isValidCommand(String input) {
        return input.charAt(0) == '.' && input.length() > 1;
    }
}
