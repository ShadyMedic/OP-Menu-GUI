package opMenuCore;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class MenuItems {
	
	public static ItemStack getMenuItem() {
	ItemStack menuItem = new ItemStack(Material.BLAZE_POWDER, 1);
	ItemMeta menuItemMeta = menuItem.getItemMeta();
	menuItemMeta.setDisplayName(ChatColor.AQUA + "OP Menu");
	ArrayList<String> lore = new ArrayList<String>(1);
	lore.add(ChatColor.GREEN + "Right click to open OP Menu");
	menuItemMeta.setLore(lore);
	menuItemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 0, true);
	menuItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	menuItem.setItemMeta(menuItemMeta);
	return menuItem;
	}
	
	public static ItemStack getOption1Item() {
		ItemStack item = new ItemStack(Material.WORKBENCH, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GREEN + "Gamemode survival");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption2Item() {
		ItemStack item = new ItemStack(Material.COMMAND, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.RED + "Gamemode creative");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption3Item() {
		ItemStack item = new ItemStack(Material.CHEST, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Gamemode adventure");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption4Item() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.BLUE + "Gamemode spectator");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption5Item() {
		ItemStack item = new ItemStack(Material.MOB_SPAWNER, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GOLD + "Get special items");
		itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 0, true);
		itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption6Item() {
		ItemStack item = new ItemStack(Material.BARRIER, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Clear your inventory");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption7Item() {
		ItemStack item = new ItemStack(Material.SPLASH_POTION, 1);
		PotionMeta potionMeta = (PotionMeta) item.getItemMeta();
		potionMeta.setDisplayName(ChatColor.DARK_RED + "Kill yourself");
		potionMeta.setColor(Color.fromBGR(50, 0, 150));
		potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(potionMeta);
		return item;
	}
	
	public static ItemStack getOption8Item() {
		ItemStack item = new ItemStack(Material.NOTE_BLOCK, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GRAY + "Stop music you hear");
		itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 0, true);
		itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption9Item() {
		ItemStack item = new ItemStack(Material.BEACON, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GREEN + "Teleport to the world spawn");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption10Item() {
		ItemStack item = new ItemStack(Material.BRICK, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_GREEN + "Place a block on your position");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption11Item() {
		ItemStack item = new ItemStack(Material.POTION, 1);
		PotionMeta potionMeta = (PotionMeta) item.getItemMeta();
		potionMeta.setDisplayName(ChatColor.RED + "Heal yourself.");
		potionMeta.setColor(Color.fromBGR(213, 75, 255));
		potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(potionMeta);
		return item;
	}
	
	public static ItemStack getOption12Item() {
		ItemStack item = new ItemStack(Material.APPLE, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_GREEN + "Feed yourself.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption13Item() {
		ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Heal and feed youself.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption14Item() {
		ItemStack item = new ItemStack(Material.POTION, 1);
		PotionMeta potionMeta = (PotionMeta) item.getItemMeta();
		potionMeta.setDisplayName(ChatColor.DARK_AQUA + "Remove all potion effects.");
		potionMeta.setColor(Color.fromBGR(255, 255, 255));
		potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(potionMeta);
		return item;
	}
	
	public static ItemStack getOption15Item() {
		ItemStack item = new ItemStack(Material.GOLDEN_CARROT, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Apply night vision effect.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption16Item() {
		ItemStack item = new ItemStack(Material.GHAST_TEAR, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.WHITE + "Move 50 blocks up.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption17Item() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.BLUE + "Get standart combat items.");
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption18Item() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_BLUE + "Get OP combat items.");
		itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 0, true);
		itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption19Item() {
		ItemStack item = new ItemStack(Material.EXP_BOTTLE, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Get some levels.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption20Item() {
		ItemStack item = new ItemStack(Material.GLASS_BOTTLE, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Remove all xp levels.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption21Item() {
		ItemStack item = new ItemStack(Material.RAW_FISH, 1, (short) 3);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.BLUE + "Apply water breathing effect.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption22Item() {
		ItemStack item = new ItemStack(Material.GOLD_NUGGET, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Move 50 blocks down.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption23Item() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GOLD + "Set time to dawn");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption24Item() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Set time to noon");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption25Item() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.RED + "Set time to dusk");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption26Item() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_BLUE + "Set time to midnight");
		item.setItemMeta(itemMeta);
		return item;
	}
	public static ItemStack getOption27Item() {
		ItemStack item = new ItemStack(Material.DOUBLE_PLANT, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Sunny weather.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption28Item() {
		ItemStack item = new ItemStack(Material.INK_SACK, 1, (short) 12);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.BLUE + "Rainy weather.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption29Item() {
		ItemStack item = new ItemStack(Material.BLAZE_ROD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Stormy weather.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption30Item() {
		ItemStack item = new ItemStack(Material.SNOW_BALL, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GREEN + "Peaceful difficulty.");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption31Item() {
		ItemStack item = new ItemStack(Material.WOOD_SWORD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.YELLOW + "Easy difficulty.");
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption32Item() {
		ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.GOLD + "Normal difficulty.");
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getOption33Item() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(ChatColor.DARK_RED + "Hard difficulty.");
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;
	}
}
