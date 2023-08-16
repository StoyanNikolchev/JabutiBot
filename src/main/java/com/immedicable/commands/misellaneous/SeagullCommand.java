package com.immedicable.commands.misellaneous;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.SEAGULL_MOMENT_LINK;

public class SeagullCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("seagull")) {
            return;
        }

        event.deferReply().queue();
        event.getHook().sendMessage(SEAGULL_MOMENT_LINK).queue();
    }
}
