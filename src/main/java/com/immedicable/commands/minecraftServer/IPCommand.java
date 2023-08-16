package com.immedicable.commands.minecraftServer;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.IP_OF_OLDFACS;

public class IPCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("ip")) {
            event.deferReply().queue();
            event.getHook().sendMessage(IP_OF_OLDFACS).queue();
        }
    }
}