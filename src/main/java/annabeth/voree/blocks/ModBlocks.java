package annabeth.voree.blocks;

import annabeth.voree.Config;
import annabeth.voree.VoreeMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static Block GLOWSTONE_ORE;
	public static Block OVERWORLD_QUARTZ_ORE;
	public static Block PRISMARINE_ORE;
	public static Block FLINT_ORE;
	public static Block BONE_ORE;
	public static Block NETHER_BONE_ORE;
	public static Block NETHER_WART_ORE;
	public static Block NETHER_COAL_ORE;
	public static Block PURPUR_ORE;
	public static Block BLAZE_POWDER_ORE;
	public static Block NETHER_GOLD_ORE;
	
	public static void initBlocks() {
		VoreeMain.logger.info("Creating Blocks");
		if (Config.GLOWSTONE_ORE) GLOWSTONE_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(4.0f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "glowstone_ore").setResistance(17.0f).setUnlocalizedName("voree.oreGlowstone");
		if (Config.QUARTZ_ORE) OVERWORLD_QUARTZ_ORE = new BlockModOre().setHardness(5.0f).setRegistryName(VoreeMain.MODID, "quartz_ore").setResistance(25.0f).setUnlocalizedName("voree.oreQuartz");
		if (Config.PRISMARINE_ORE) PRISMARINE_ORE = new BlockPrismarineOre().setHardness(5.0f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "prismarine_ore").setResistance(25.0f).setUnlocalizedName("voree.orePrismarine");
		if (Config.FLINT_ORE) FLINT_ORE = new BlockModOre().setHardness(2.5f).setRegistryName(VoreeMain.MODID, "flint_ore").setResistance(15.0f).setUnlocalizedName("voree.oreFlint");
		if (Config.BONE_ORE) BONE_ORE = new BlockModOre().setHardness(3.75f).setRegistryName(VoreeMain.MODID, "bone_ore").setResistance(18.0f).setUnlocalizedName("voree.oreBone");
		if (Config.NETHER_BONE_ORE) NETHER_BONE_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(0.6f).setRegistryName(VoreeMain.MODID, "nether_bone_ore").setResistance(3.0f).setUnlocalizedName("voree.oreBoneNether");
		if (Config.NETHER_WART_ORE) NETHER_WART_ORE = new BlockSoulSandOre().setHardness(0.6f).setRegistryName(VoreeMain.MODID, "nether_wart_ore").setResistance(3.1f).setUnlocalizedName("voree.oreWart");
		if (Config.NETHER_COAL_ORE) NETHER_COAL_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(3.0f).setRegistryName(VoreeMain.MODID, "nether_coal_ore").setResistance(15.0f).setUnlocalizedName("voree.oreCoalNether");
		if (Config.PURPUR_ORE) PURPUR_ORE = new BlockModOre(MapColor.SAND).setHardness(7.5f).setRegistryName(VoreeMain.MODID, "purpur_ore").setResistance(30.0f).setUnlocalizedName("voree.orePurpur");
		if (Config.BLAZE_POWDER_ORE) BLAZE_POWDER_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(4.5f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "blaze_powder_ore").setResistance(22.5f).setUnlocalizedName("voree.oreBlazePowder");
		if (Config.NETHER_GOLD_ORE) NETHER_GOLD_ORE = new Block(Material.ROCK, MapColor.NETHERRACK).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setHardness(5.0f).setRegistryName(VoreeMain.MODID, "nether_gold_ore").setResistance(30.0f).setUnlocalizedName("voree.oreGoldNether");
		
		if (Config.GLOWSTONE_ORE) GLOWSTONE_ORE.setHarvestLevel("pickaxe", 2);
		if (Config.QUARTZ_ORE) OVERWORLD_QUARTZ_ORE.setHarvestLevel("pickaxe", 2);
		if (Config.PRISMARINE_ORE) PRISMARINE_ORE.setHarvestLevel("pickaxe", 2);
		if (Config.FLINT_ORE) FLINT_ORE.setHarvestLevel("pickaxe", 1);
		if (Config.BONE_ORE) BONE_ORE.setHarvestLevel("pickaxe", 1);
		if (Config.NETHER_BONE_ORE) NETHER_BONE_ORE.setHarvestLevel("pickaxe", 1);
		if (Config.NETHER_COAL_ORE) NETHER_COAL_ORE.setHarvestLevel("pickaxe", 1);
		if (Config.PURPUR_ORE) PURPUR_ORE.setHarvestLevel("pickaxe", 2);
		if (Config.BLAZE_POWDER_ORE) BLAZE_POWDER_ORE.setHarvestLevel("pickaxe", 1);
		if (Config.NETHER_GOLD_ORE) NETHER_GOLD_ORE.setHarvestLevel("pickaxe", 2);
	}
}