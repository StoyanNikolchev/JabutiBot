package com.immedicable.commands.minecraftServer;

import com.immedicable.mcping.MinecraftPing;
import com.immedicable.mcping.MinecraftPingOptions;
import com.immedicable.mcping.MinecraftPingReply;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static com.immedicable.enums.Constants.*;

public class OnlineCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {

        if (!event.getName().equals("online")) {
            return;
        }

        event.deferReply().queue();

        MinecraftPingReply data;

        try {
            data = new MinecraftPing().getPing(new MinecraftPingOptions().setHostname("5.9.182.66").setPort(25567));

        } catch (IOException e) {
            event.getHook().sendMessage(SERVER_OFFLINE).queue();
            throw new RuntimeException(e);
        }

        List<MinecraftPingReply.Player> playerList = data.getPlayers().getSample();

        if (playerList == null) {
            event.getHook().sendMessage(NO_PLAYERS_ONLINE).queue();

        } else {
            String onlinePlayersString = playerList.stream()
                    .map(MinecraftPingReply.Player::getName)
                    .collect(Collectors.joining(", "));
            int playerCount = playerList.size();

            event.getHook().sendMessage(String.format(ONLINE_PLAYERS_FORMAT, playerCount, onlinePlayersString)).queue();
        }
    }
}
