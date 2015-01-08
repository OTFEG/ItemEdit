package net.otfeg.itemedit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import java.lang.NumberFormatException;
import java.lang.Override;

public class AddEchantment implements CommandExecutor {

	private Enchant enchant;

	public AddEchantment(Enchant enchant) {
		this.enchant = enchant;
	}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int level = 1;
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You can't do that!");
            return true;
        }
        Player player = (Player)sender;
        if (args.length < 1 || args.length > 2) {
            return false;
        }

        Enchantment enchantment = this.enchant.getEnchantment(args[0]);

        if (enchantment == null) {
            sender.sendMessage(ChatColor.RED + "Invalid enchantment");
            return true;
        }

        try {
            level = Integer.parseInt(args[1]);
        } catch (NumberFormatException ex) {
            sender.sendMessage(ChatColor.RED + "Level must be a number");
            return true;
        }

        player.getItemInHand().addUnsafeEnchantment(enchantment, level);
    }

}
