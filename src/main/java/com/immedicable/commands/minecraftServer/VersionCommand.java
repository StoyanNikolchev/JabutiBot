package com.immedicable.commands.minecraftServer;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static com.immedicable.enums.Constants.SUPPORTED_MINECRAFT_VERSIONS;

public class VersionCommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("version")) {
            return;
        }

        event.deferReply().queue();
        event.getHook().sendMessage(SUPPORTED_MINECRAFT_VERSIONS).queue();
    }
}