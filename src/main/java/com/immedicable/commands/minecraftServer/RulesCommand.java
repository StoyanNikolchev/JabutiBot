package com.immedicable.commands.minecraftServer;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.SERVER_RULES;

public class RulesCommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("rules")) {
            return;
        }

        event.deferReply().queue();
        event.getHook().sendMessage(SERVER_RULES).queue();
    }
}
