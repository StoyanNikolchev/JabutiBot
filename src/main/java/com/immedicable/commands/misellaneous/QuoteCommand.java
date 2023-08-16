package com.immedicable.commands.misellaneous;

import com.immedicable.utils.QuoteManager;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class QuoteCommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("quote")) {
            return;
        }

        event.deferReply().queue();
        event.getHook().sendMessage(String.format(QuoteManager.getRandomQuote())).queue();
    }
}
