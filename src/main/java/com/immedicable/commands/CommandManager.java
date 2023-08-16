package com.immedicable.commands;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

import java.util.ArrayList;
import java.util.List;

public class CommandManager extends ListenerAdapter {
    @Override
    public void onGuildReady(GuildReadyEvent event) {
        List<CommandData> commandDatum = new ArrayList<>();

        commandDatum.add(Commands.slash("ip", "Check the IP of the server."));
        commandDatum.add(Commands.slash("version", "See the compatible Minecraft versions."));
        commandDatum.add(Commands.slash("rules", "Check out the rules."));
        commandDatum.add(Commands.slash("online", "See who's online."));
        commandDatum.add(Commands.slash("seagull", "Certified Seagull moment."));
        commandDatum.add(Commands.slash("quote", "Get a random iconic quote."));

        event.getGuild().updateCommands()
                .addCommands(commandDatum)
                .queue();
    }
}
