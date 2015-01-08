package net.otfeg.itemedit;

import org.bukkit.plugin.java.JavaPlugin;

public class ItemEdit extends JavaPlugin{
	@Override
	public void onEnable() {
		new Enchant(this);
	}
}
