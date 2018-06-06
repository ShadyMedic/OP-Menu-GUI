package opMenuCore;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Events implements Listener, CommandExecutor {
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent ev) {
		Action ac = ev.getAction();
		Player pl = ev.getPlayer();
		ItemStack itm = ev.getItem();
		
		if (pl != null && itm != null && itm.getType() != Material.AIR && (ac == Action.RIGHT_CLICK_AIR || ac == Action.RIGHT_CLICK_BLOCK)) {
			if (itm.equals(MenuItems.getMenuItem())) {
				if(pl.hasPermission("opmenu.open") || pl.hasPermission("opmenu.use") || pl.hasPermission("opmenu")) {GUI.openMenu(pl);}
				else {
					pl.sendMessage(ChatColor.DARK_RED + "You don´t have permission to use OP Menu!");
					try
					{
					//org.bukkit.plugin.java.JavaPlugin.getLogger.info("You can ignore this error message. It´s a bug I don´t know how to repair right now. It appears when a non-OP player tries to use OP Menu item.");
					pl.getInventory().removeItem(MenuItems.getMenuItem());
					}catch(Exception e) {}
				}
			}
		}
		else {return;}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInventoryClick(InventoryClickEvent ev) {
		InventoryAction ac = ev.getAction();
		Player pl = (Player) ev.getWhoClicked();
		ItemStack itm = ev.getCurrentItem();
		Inventory inv = ev.getInventory();
		
		if(inv.getName().equals(ChatColor.AQUA + "OP Menu") && pl != null && itm != null && !(ac == InventoryAction.NOTHING || ac == InventoryAction.UNKNOWN)) {
			ev.setCancelled(true);
			pl.closeInventory();
			if((pl.hasPermission("opmenu.choose") || pl.hasPermission("opmenu.use")|| pl.hasPermission("opmenu"))) {
				if (itm.equals(MenuItems.getOption1Item()))
				{
					pl.setGameMode(GameMode.SURVIVAL);
					pl.sendMessage(ChatColor.AQUA + "Your gamemode has been updated to " + ChatColor.GREEN + "SURVIVAL" + ChatColor.AQUA + " mode.");
				}
				
				if (itm.equals(MenuItems.getOption2Item()))
				{
					pl.setGameMode(GameMode.CREATIVE);
					pl.sendMessage(ChatColor.AQUA + "Your gamemode has been updated to " + ChatColor.RED + "CREATIVE" + ChatColor.AQUA + " mode.");
				}
				
				if (itm.equals(MenuItems.getOption3Item()))
				{
					pl.setGameMode(GameMode.ADVENTURE);
					pl.sendMessage(ChatColor.AQUA + "Your gamemode has been updated to " + ChatColor.YELLOW + "ADVENTURE" + ChatColor.AQUA + " mode.");
				}
				
				if (itm.equals(MenuItems.getOption4Item()))
				{
					pl.setGameMode(GameMode.SPECTATOR);
					pl.sendMessage(ChatColor.AQUA + "Your gamemode has been updated to " + ChatColor.BLUE + "SPECTATOR" + ChatColor.AQUA + " mode.");
				}
				
				if (itm.equals(MenuItems.getOption5Item()))
				{
					pl.getInventory().addItem(new ItemStack(Material.COMMAND_MINECART, 1));
					pl.getInventory().addItem(new ItemStack(Material.COMMAND, 1));
					pl.getInventory().addItem(new ItemStack(Material.STRUCTURE_BLOCK, 1));
					pl.getInventory().addItem(new ItemStack(Material.BARRIER, 1));
					pl.getInventory().addItem(new ItemStack(Material.MOB_SPAWNER, 1));
					pl.sendMessage(ChatColor.AQUA + "You got special items.");
				}
				
				if (itm.equals(MenuItems.getOption6Item()))
				{
					int slot = pl.getInventory().getHeldItemSlot();
					pl.getInventory().clear();
					pl.getInventory().setItem(slot, MenuItems.getMenuItem());
					pl.sendMessage(ChatColor.AQUA + "Your inventory has been cleared.");
				}
				
				if (itm.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "Kill yourself") && ((((PotionMeta) itm.getItemMeta()).getColor()).equals(Color.fromBGR(50, 0, 150))))
				{
					pl.setHealth(0.0);
					pl.sendMessage(ChatColor.AQUA + "You have been killed.");
				}
				
				if (itm.equals(MenuItems.getOption8Item()))
				{
					pl.stopSound(Sound.MUSIC_CREATIVE);
					pl.stopSound(Sound.MUSIC_CREDITS);
					pl.stopSound(Sound.MUSIC_DRAGON);
					pl.stopSound(Sound.MUSIC_END);
					pl.stopSound(Sound.MUSIC_GAME);
					pl.stopSound(Sound.MUSIC_MENU);
					pl.stopSound(Sound.MUSIC_NETHER);
					pl.stopSound(Sound.RECORD_11);
					pl.stopSound(Sound.RECORD_13);
					pl.stopSound(Sound.RECORD_BLOCKS);
					pl.stopSound(Sound.RECORD_CAT);
					pl.stopSound(Sound.RECORD_CHIRP);
					pl.stopSound(Sound.RECORD_FAR);
					pl.stopSound(Sound.RECORD_MALL);
					pl.stopSound(Sound.RECORD_MELLOHI);
					pl.stopSound(Sound.RECORD_STAL);
					pl.stopSound(Sound.RECORD_STRAD);
					pl.stopSound(Sound.RECORD_WAIT);
					pl.stopSound(Sound.RECORD_WARD);
					pl.sendMessage(ChatColor.AQUA + "Music you heared was stoped.");
				}
				
				if (itm.equals(MenuItems.getOption9Item()))
				{
					pl.teleport(pl.getWorld().getSpawnLocation());
					pl.sendMessage(ChatColor.AQUA + "You were teleported to the world spawn.");
				}
				
				if (itm.equals(MenuItems.getOption10Item()))
				{
					pl.getLocation().getBlock().setType(Material.BRICK);
					pl.sendMessage(ChatColor.AQUA + "Block has been placed on your location.");
				}
				
				if (itm.getItemMeta().getDisplayName().equals(ChatColor.RED + "Heal yourself.") && ((((PotionMeta) itm.getItemMeta()).getColor()).equals(Color.fromBGR(213, 75, 255))))
				{
					pl.setHealth(pl.getMaxHealth());
					pl.sendMessage(ChatColor.AQUA + "You have been healed.");
				}
				
				if (itm.equals(MenuItems.getOption12Item()))
				{
					pl.setFoodLevel(20);
					pl.setSaturation((float) 20);
					pl.sendMessage(ChatColor.AQUA + "You have been fed.");
				}
				
				if (itm.equals(MenuItems.getOption13Item()))
				{
					pl.setHealth(pl.getMaxHealth());
					pl.setFoodLevel(20);
					pl.setSaturation((float) 20);
					pl.sendMessage(ChatColor.AQUA + "You have been healed and fed.");
				}
				
				if (itm.getItemMeta().getDisplayName().equals(ChatColor.DARK_AQUA + "Remove all potion effects.") && ((((PotionMeta) itm.getItemMeta()).getColor()).equals(Color.fromBGR(255, 255, 255))))
				{
					pl.removePotionEffect(PotionEffectType.ABSORPTION);
					pl.removePotionEffect(PotionEffectType.BLINDNESS);
					pl.removePotionEffect(PotionEffectType.CONFUSION);
					pl.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
					pl.removePotionEffect(PotionEffectType.FAST_DIGGING);
					pl.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
					pl.removePotionEffect(PotionEffectType.GLOWING);
					pl.removePotionEffect(PotionEffectType.HARM);
					pl.removePotionEffect(PotionEffectType.HEAL);
					pl.removePotionEffect(PotionEffectType.HEALTH_BOOST);
					pl.removePotionEffect(PotionEffectType.HUNGER);
					pl.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					pl.removePotionEffect(PotionEffectType.INVISIBILITY);
					pl.removePotionEffect(PotionEffectType.JUMP);
					pl.removePotionEffect(PotionEffectType.LEVITATION);
					pl.removePotionEffect(PotionEffectType.LUCK);
					pl.removePotionEffect(PotionEffectType.NIGHT_VISION);
					pl.removePotionEffect(PotionEffectType.POISON);
					pl.removePotionEffect(PotionEffectType.REGENERATION);
					pl.removePotionEffect(PotionEffectType.SATURATION);
					pl.removePotionEffect(PotionEffectType.SLOW);
					pl.removePotionEffect(PotionEffectType.SLOW_DIGGING);
					pl.removePotionEffect(PotionEffectType.SPEED);
					pl.removePotionEffect(PotionEffectType.UNLUCK);
					pl.removePotionEffect(PotionEffectType.WATER_BREATHING);
					pl.removePotionEffect(PotionEffectType.WEAKNESS);
					pl.removePotionEffect(PotionEffectType.WITHER);
					pl.sendMessage(ChatColor.AQUA + "All potion effects were removed from you.");
				}
				
				if (itm.equals(MenuItems.getOption15Item()))
				{
					pl.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2147483647, 0));
					pl.sendMessage(ChatColor.AQUA + "Night vision effect has been applied on you.");
				}
				
				if (itm.equals(MenuItems.getOption16Item()))
				{
					pl.teleport(new Location(pl.getWorld(), pl.getLocation().getX(), (pl.getLocation().getY()+50), pl.getLocation().getZ()));
					pl.sendMessage(ChatColor.AQUA + "Whoosh!");
				}
				
				if (itm.equals(MenuItems.getOption17Item()))
				{
					pl.getInventory().addItem(new ItemStack(Material.SHIELD, 1));
					pl.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
					pl.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
					pl.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE, 1));
					pl.getInventory().addItem(new ItemStack(Material.BOW, 1));
					pl.sendMessage(ChatColor.AQUA + "You got standard combat weapons.");
				}
				
				if (itm.equals(MenuItems.getOption18Item()))
				{
					ItemStack sword = new ItemStack(Material.GOLD_SWORD, 1);
					ItemStack axe = new ItemStack(Material.GOLD_AXE, 1);
					ItemStack bow = new ItemStack(Material.BOW, 1);
					ItemStack rod = new ItemStack(Material.FISHING_ROD, 1);
					ItemStack shield = new ItemStack(Material.SHIELD, 1);
					
					ItemMeta swordMeta = sword.getItemMeta();
					ItemMeta axeMeta = axe.getItemMeta();
					ItemMeta bowMeta = bow.getItemMeta();
					ItemMeta rodMeta = rod.getItemMeta();
					ItemMeta shieldMeta = shield.getItemMeta();
					
					swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 500, true);
					axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 500, true);
					bowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 500, true);
					rodMeta.addEnchant(Enchantment.KNOCKBACK, 25, true);
					swordMeta.setUnbreakable(true);
					axeMeta.setUnbreakable(true);
					bowMeta.setUnbreakable(true);
					rodMeta.setUnbreakable(true);
					shieldMeta.setUnbreakable(true);
					swordMeta.setDisplayName(ChatColor.AQUA + "OP Sword");
					axeMeta.setDisplayName(ChatColor.AQUA + "OP Axe");
					bowMeta.setDisplayName(ChatColor.AQUA + "OP Bow");
					rodMeta.setDisplayName(ChatColor.AQUA + "OP Fishing Rod");
					shieldMeta.setDisplayName(ChatColor.AQUA + "OP Shield");
					swordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					axeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					bowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					rodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					swordMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					axeMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					bowMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					rodMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					shieldMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					swordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
					axeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
					sword.setItemMeta(swordMeta);
					axe.setItemMeta(axeMeta);
					bow.setItemMeta(bowMeta);
					rod.setItemMeta(rodMeta);
					shield.setItemMeta(shieldMeta);
					
					pl.getInventory().addItem(shield);
					pl.getInventory().addItem(rod);
					pl.getInventory().addItem(sword);
					pl.getInventory().addItem(axe);
					pl.getInventory().addItem(bow);
					pl.sendMessage(ChatColor.AQUA + "You got OP combat weapons.");
				}
				
				if (itm.equals(MenuItems.getOption19Item()))
				{
					pl.giveExpLevels(50);
					pl.sendMessage(ChatColor.AQUA + "You got 50 xp levels.");
				}
				
				if (itm.equals(MenuItems.getOption20Item()))
				{
					pl.setLevel(0);
					pl.setExp(0);
					pl.sendMessage(ChatColor.AQUA + "All xp levels have been removed from you.");
				}
				
				if (itm.equals(MenuItems.getOption21Item()))
				{
					pl.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 2147483647, 0));
					pl.sendMessage(ChatColor.AQUA + "Water breathing effect has been applied on you.");
				}
				
				if (itm.equals(MenuItems.getOption22Item()))
				{
					pl.teleport(new Location(pl.getWorld(), pl.getLocation().getX(), (pl.getLocation().getY()-50), pl.getLocation().getZ()));
					pl.sendMessage(ChatColor.AQUA + "Whoosh!");
				}
				
				if (itm.equals(MenuItems.getOption23Item()))
				{
					pl.getWorld().setTime(0);
					pl.sendMessage(ChatColor.AQUA + "World time has been set to 6:00 or 6 AM");
				}
				
				if (itm.equals(MenuItems.getOption24Item()))
				{
					pl.getWorld().setTime(6000);
					pl.sendMessage(ChatColor.AQUA + "World time has been set to 12:00");
				}
				
				if (itm.equals(MenuItems.getOption25Item()))
				{
					pl.getWorld().setTime(12000);
					pl.sendMessage(ChatColor.AQUA + "World time has been set to 18:00 or 6 PM");
				}
				
				if (itm.equals(MenuItems.getOption26Item()))
				{
					pl.getWorld().setTime(18000);
					pl.sendMessage(ChatColor.AQUA + "World time has been set to 0:00 or 24:00");
				}
				
				if (itm.equals(MenuItems.getOption27Item()))
				{
					pl.getWorld().setStorm(false);
					pl.sendMessage(ChatColor.AQUA + "World weather has been updated to " + ChatColor.YELLOW + "sunny" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption28Item()))
				{
					pl.getWorld().setStorm(true);
					pl.getWorld().setThundering(false);
					pl.sendMessage(ChatColor.AQUA + "World weather has been updated to " + ChatColor.BLUE + "rainy" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption29Item()))
				{
					pl.getWorld().setStorm(true);
					pl.getWorld().setThundering(true);
					pl.sendMessage(ChatColor.AQUA + "World weather has been updated to " + ChatColor.DARK_PURPLE + "stormy" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption30Item()))
				{
					pl.getWorld().setDifficulty(Difficulty.PEACEFUL);
					pl.sendMessage(ChatColor.AQUA + "Difficulty has been updated to " + ChatColor.GREEN + "PEACEFUL" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption31Item()))
				{
					pl.getWorld().setDifficulty(Difficulty.EASY);
					pl.sendMessage(ChatColor.AQUA + "Difficulty has been updated to " + ChatColor.YELLOW + "EASY" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption32Item()))
				{
					pl.getWorld().setDifficulty(Difficulty.NORMAL);
					pl.sendMessage(ChatColor.AQUA + "Difficulty has been updated to " + ChatColor.GOLD + "NORMAL" + ChatColor.AQUA + ".");
				}
				
				if (itm.equals(MenuItems.getOption33Item()))
				{
					pl.getWorld().setDifficulty(Difficulty.HARD);
					pl.sendMessage(ChatColor.AQUA + "Difficulty has been updated to " + ChatColor.DARK_RED + "HARD" + ChatColor.AQUA + ".");
				}
			}
			else {
				pl.sendMessage(ChatColor.DARK_RED + "You don´t have permission to use OP Menu options!");
			}
		}
	}
	
	@EventHandler
	public void onDeath(PlayerDeathEvent ev) {
		String message = ev.getDeathMessage();
		String[] death_message = message.split(" ");
		if (death_message[1].equals("died")){ev.setDeathMessage(null);}
	}
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender snd, Command cmd,String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getOPMenu")) {
			if (snd instanceof Player) {
				Player pl = (Player) snd;
				if (pl.hasPermission("opmenu.getitem") || pl.hasPermission("opmenu")) 
				{
					if (!pl.getInventory().contains(MenuItems.getMenuItem())) {
						pl.getInventory().addItem(MenuItems.getMenuItem());
						pl.sendMessage(ChatColor.DARK_AQUA + "Right click with enchanted blaze powder to open OP menu.");
						return true;
					}
				else {pl.sendMessage(ChatColor.DARK_RED + "You already have OP Menu item.");}
				}
				else {pl.sendMessage(ChatColor.DARK_RED + "You don´t have permission to use this command!");}
			}
			else {
				snd.sendMessage(ChatColor.RED + "This command can be used only by players!");
			}
		}
		else if(cmd.getName().equalsIgnoreCase("openOPMenu")) {
			if(snd instanceof Player && (snd.hasPermission("opmenu.open.others") || snd.hasPermission("opmenu")) || !(snd instanceof Player)) {
				if(args.length == 1) {
					if(snd.getServer().getPlayer(args[0]) != null) {
						GUI.openMenu(snd.getServer().getPlayer(args[0]));
						snd.sendMessage(ChatColor.AQUA + "OP Menu has been succefully opened to player " + args[0]);
						return true;
					}
					else {snd.sendMessage(ChatColor.DARK_RED + "Player not found!");}
				}
				else {snd.sendMessage(ChatColor.DARK_RED + "Wrong amount of arguments. See command help.");}
			}
			else {snd.sendMessage(ChatColor.DARK_RED + "You don´t have permission to use this command!");}
		}
		return true;
	}
}