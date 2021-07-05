import Commands.DiscordServerCommands;
import Commands.MinecraftServerCommands;
import Events.OwnerReact;
import Events.MemeEvents;
import Features.Status;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main(String[] args) throws Exception{

        JDA jda = JDABuilder.createDefault("ODYwOTg0NTE1NTE0MzM1MjQy.YODMUA.WpwdgnkJNft1yFnHMD0udIzKgEM").build();
        jda.addEventListener(new MemeEvents());
        jda.addEventListener(new MinecraftServerCommands());
        jda.addEventListener(new DiscordServerCommands());
        jda.addEventListener(new Status());
        jda.addEventListener(new OwnerReact());
    }
}
