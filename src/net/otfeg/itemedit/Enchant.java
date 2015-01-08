package net.otfeg.itemedit;

import java.util.HashMap;
import org.bukkit.enchantments.Enchantment;

public class Enchant{

	private ItemEdit itemEdit;
	private HashMap<String, Enchantment> enchantments;

	public Enchant(ItemEdit itemEdit) {
	    this.itemEdit = itemEdit;
		this.itemEdit.getCommand("ADDENCHANTMENT").setExecutor(new AddEchantment(this));
		this.itemEdit.getCommand("REMOVEENCHANTMENT").setExecutor(new RemoveEnchantment(this));
	    
	    enchantments = new HashMap<String, Enchantment>();
	    enchantments.put("POWER", Enchantment.ARROW_DAMAGE);
	    enchantments.put("FLAME", Enchantment.ARROW_FIRE);
	    enchantments.put("INFINITY", Enchantment.ARROW_INFINITE);
	    enchantments.put("PUNCH", Enchantment.ARROW_KNOCKBACK);
	    enchantments.put("SHARPNESS", Enchantment.DAMAGE_ALL);
	    enchantments.put("ARTHROPODS", Enchantment.DAMAGE_ARTHROPODS);
	    enchantments.put("SMITE", Enchantment.DAMAGE_UNDEAD);
	    enchantments.put("DEPTH_STRIDER", Enchantment.DEPTH_STRIDER);
	    enchantments.put("HASTE", Enchantment.DIG_SPEED);
	    enchantments.put("UNBREAKING", Enchantment.DURABILITY);
	    enchantments.put("FIRE_ASPECT", Enchantment.FIRE_ASPECT);
	    enchantments.put("KNOCKBACK", Enchantment.KNOCKBACK);
	    enchantments.put("FORTUNE", Enchantment.LOOT_BONUS_BLOCKS);
	    enchantments.put("LOOTING", Enchantment.LOOT_BONUS_MOBS);
	    enchantments.put("LUCK", Enchantment.LUCK);
	    enchantments.put("LURE", Enchantment.LURE);
	    enchantments.put("AQUA_AFFINITY", Enchantment.OXYGEN);
	    enchantments.put("PROTECTION", Enchantment.PROTECTION_ENVIRONMENTAL);
	    enchantments.put("BLAST_PROTECTION", Enchantment.PROTECTION_EXPLOSIONS);
	    enchantments.put("FEATHER_FALLING", Enchantment.PROTECTION_FALL);
	    enchantments.put("FIRE_PRTECTION", Enchantment.PROTECTION_FIRE);
	    enchantments.put("PROJECTILE_PROTECTION", Enchantment.PROTECTION_PROJECTILE);
	    enchantments.put("SILK_TOUCH", Enchantment.SILK_TOUCH);
	    enchantments.put("THORNS", Enchantment.THORNS);
	    enchantments.put("LUCK_OF_THE_SEA", Enchantment.WATER_WORKER);
	}
	public Enchantment getEnchantment(String name){
		return enchantments.get(name);
	}
}