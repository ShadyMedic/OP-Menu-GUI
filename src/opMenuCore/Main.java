package opMenuCore;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Events(), this);
		getCommand("getOPMenu").setExecutor(new Events());
		getCommand("openOPMenu").setExecutor(new Events());
		getLogger().info("OP menu has been enabled.");
	}
	
	public void onDisable() {
		getLogger().info("OP menu has been disabled.");
	}
}
