package opMenuCore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GUI {
	
	public static void openMenu(Player p) {
		Inventory menu = Bukkit.createInventory(null, 36, ChatColor.AQUA + "OP Menu");
		menu.setItem(0, MenuItems.getOption1Item());
		menu.setItem(1, MenuItems.getOption2Item());
		menu.setItem(2, MenuItems.getOption3Item());
		menu.setItem(3, MenuItems.getOption4Item());
		menu.setItem(9, MenuItems.getOption5Item());
		menu.setItem(10, MenuItems.getOption6Item());
		menu.setItem(11, MenuItems.getOption7Item());
		menu.setItem(12, MenuItems.getOption8Item());
		menu.setItem(13, MenuItems.getOption9Item());
		menu.setItem(14, MenuItems.getOption10Item());
		menu.setItem(18, MenuItems.getOption11Item());
		menu.setItem(19, MenuItems.getOption12Item());
		menu.setItem(20, MenuItems.getOption13Item());
		menu.setItem(21, MenuItems.getOption14Item());
		menu.setItem(22, MenuItems.getOption15Item());
		menu.setItem(23, MenuItems.getOption16Item());
		menu.setItem(27, MenuItems.getOption17Item());
		menu.setItem(28, MenuItems.getOption18Item());
		menu.setItem(29, MenuItems.getOption19Item());
		menu.setItem(30, MenuItems.getOption20Item());
		menu.setItem(31, MenuItems.getOption21Item());
		menu.setItem(32, MenuItems.getOption22Item());
		menu.setItem(6, MenuItems.getOption23Item());
		menu.setItem(15, MenuItems.getOption24Item());
		menu.setItem(24, MenuItems.getOption25Item());
		menu.setItem(33, MenuItems.getOption26Item());
		menu.setItem(7, MenuItems.getOption27Item());
		menu.setItem(16, MenuItems.getOption28Item());
		menu.setItem(25, MenuItems.getOption29Item());
		menu.setItem(8, MenuItems.getOption30Item());
		menu.setItem(17, MenuItems.getOption31Item());
		menu.setItem(26, MenuItems.getOption32Item());
		menu.setItem(35, MenuItems.getOption33Item());
		if (p != null) {p.openInventory(menu);}
	}
}
