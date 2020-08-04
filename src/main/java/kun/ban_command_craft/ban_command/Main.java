package kun.ban_command_craft.ban_command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new chat_check(this), this);
        getLogger().info("Success - (ban_command)");
    }
}
