package net.otfeg.itemedit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class AddEchantment implements CommandExecutor {

	private Enchant enchant;

	public AddEchantment(Enchant enchant) {
		this.enchant = enchant;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		int level = 0;
		if(!(sender instanceof Player)){
			sender.sendMessage("Can only be used by a player");
			return false;
		}
		Enchantment enchantment = this.enchant.getEnchantment(args[0]);
		if(enchantment==null){
			sender.sendMessage("Invalid Enchantment");
			return false;
		}
		try{
			level = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			sender.sendMessage("Level must be a number.");
		}
		Player player = (Player) sender;
		player.getItemInHand().addUnsafeEnchantment(enchantment, level);
		
		return false;
	}

}
