package kun.ban_command_craft.ban_command;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class chat_check implements Listener {
    private final Main player;
    public chat_check(Main a){player=a;}

    @EventHandler
    public void onGetCommand(PlayerCommandPreprocessEvent e){

    }
}
