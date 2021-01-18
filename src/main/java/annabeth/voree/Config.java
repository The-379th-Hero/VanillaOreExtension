package annabeth.voree;

import net.minecraftforge.common.config.Configuration;

public class Config {
	private static final String ROOT = "ores";
	
	public static boolean BLAZE_POWDER_ORE = true, BONE_ORE = true, FLINT_ORE = true, GLOWSTONE_ORE = true, NETHER_BONE_ORE = true, NETHER_COAL_ORE = true, NETHER_GOLD_ORE = true, NETHER_WART_ORE = true, PRISMARINE_ORE = true, PURPUR_ORE = true, QUARTZ_ORE = true;
	
	public static void readConfig() {
		Configuration cfg = VoreeMain.config;
		
		try {
			cfg.load();
			cfg.addCustomCategoryComment(ROOT, "Toggle whether ores are registered");
			BLAZE_POWDER_ORE = cfg.getBoolean("blaze_powder_ore", ROOT, BLAZE_POWDER_ORE, "Blaze Powder Ore");
			BONE_ORE = cfg.getBoolean("bone_ore", ROOT, BONE_ORE, "Bone Ore");
			FLINT_ORE = cfg.getBoolean("flint_ore", ROOT, FLINT_ORE, "Flint Ore");
			GLOWSTONE_ORE = cfg.getBoolean("glowstone_ore", ROOT, GLOWSTONE_ORE, "Glowstone Ore");
			NETHER_BONE_ORE = cfg.getBoolean("nether_bone_ore", ROOT, NETHER_BONE_ORE, "Nether Bone Ore");
			NETHER_COAL_ORE = cfg.getBoolean("nether_coal_ore", ROOT, NETHER_COAL_ORE, "Nether Coal Ore");
			NETHER_GOLD_ORE = cfg.getBoolean("nether_gold_ore", ROOT, NETHER_GOLD_ORE, "Nether Gold Ore");
			NETHER_WART_ORE = cfg.getBoolean("nether_wart_ore", ROOT, NETHER_WART_ORE, "Nether Wart Ore");
			PRISMARINE_ORE = cfg.getBoolean("prismarine_ore", ROOT, PRISMARINE_ORE, "Prismarine Ore");
			PURPUR_ORE = cfg.getBoolean("purpur_ore", ROOT, PURPUR_ORE, "Purpur Ore");
			QUARTZ_ORE = cfg.getBoolean("quartz_ore", ROOT, QUARTZ_ORE, "Quartz Ore");
		} catch (Exception e) {
			VoreeMain.logger.error("Error loading config file!", e);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}
}