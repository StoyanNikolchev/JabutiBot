package com.immedicable;

import com.immedicable.commands.CommandManager;
import com.immedicable.commands.minecraftServer.IPCommand;
import com.immedicable.commands.minecraftServer.OnlineCommand;
import com.immedicable.commands.minecraftServer.RulesCommand;
import com.immedicable.commands.minecraftServer.VersionCommand;
import com.immedicable.commands.misellaneous.QuoteCommand;
import com.immedicable.commands.misellaneous.SeagullCommand;
import com.immedicable.events.*;
import com.immedicable.features.Status;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class JabutiBot {
    public static void main(String[] args) throws Exception{

        JDA jda = JDABuilder.createDefault("",
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.MESSAGE_CONTENT)
                .build();

        jda.addEventListener(new CommandManager());
        jda.addEventListener(new IPCommand());
        jda.addEventListener(new OnlineCommand());
        jda.addEventListener(new RulesCommand());
        jda.addEventListener(new VersionCommand());
        jda.addEventListener(new Status());
        jda.addEventListener(new MemberNameReacts());
        jda.addEventListener(new UnfunnyReply());
        jda.addEventListener(new SeagullCommand());
        jda.addEventListener(new QuoteCommand());
        jda.addEventListener(new SexResponse());
        jda.addEventListener(new BearlitResponse());
        jda.addEventListener(new MemberNameReacts());
        jda.addEventListener(new BlackPeteMomentResponse());
        jda.addEventListener(new PingResponse());
    }
}
