package annabeth.voree.blocks;

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
		GLOWSTONE_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(4.0f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "glowstone_ore").setResistance(17.0f).setUnlocalizedName("voree.oreGlowstone");
		OVERWORLD_QUARTZ_ORE = new BlockModOre().setHardness(5.0f).setRegistryName(VoreeMain.MODID, "quartz_ore").setResistance(25.0f).setUnlocalizedName("voree.oreQuartz");
		PRISMARINE_ORE = new BlockPrismarineOre().setHardness(5.0f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "prismarine_ore").setResistance(25.0f).setUnlocalizedName("voree.orePrismarine");
		FLINT_ORE = new BlockModOre().setHardness(2.5f).setRegistryName(VoreeMain.MODID, "flint_ore").setResistance(15.0f).setUnlocalizedName("voree.oreFlint");
		BONE_ORE = new BlockModOre().setHardness(3.75f).setRegistryName(VoreeMain.MODID, "bone_ore").setResistance(18.0f).setUnlocalizedName("voree.oreBone");
		NETHER_BONE_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(0.6f).setRegistryName(VoreeMain.MODID, "nether_bone_ore").setResistance(3.0f).setUnlocalizedName("voree.oreBoneNether");
		NETHER_WART_ORE = new BlockSoulSandOre().setHardness(0.6f).setRegistryName(VoreeMain.MODID, "nether_wart_ore").setResistance(3.1f).setUnlocalizedName("voree.oreWart");
		NETHER_COAL_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(3.0f).setRegistryName(VoreeMain.MODID, "nether_coal_ore").setResistance(15.0f).setUnlocalizedName("voree.oreCoalNether");
		PURPUR_ORE = new BlockModOre(MapColor.SAND).setHardness(7.5f).setRegistryName(VoreeMain.MODID, "purpur_ore").setResistance(30.0f).setUnlocalizedName("voree.orePurpur");
		BLAZE_POWDER_ORE = new BlockModOre(MapColor.NETHERRACK).setHardness(4.5f).setLightLevel(0.625F).setRegistryName(VoreeMain.MODID, "blaze_powder_ore").setResistance(22.5f).setUnlocalizedName("voree.oreBlazePowder");
		NETHER_GOLD_ORE = new Block(Material.ROCK, MapColor.NETHERRACK).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setHardness(5.0f).setRegistryName(VoreeMain.MODID, "nether_gold_ore").setResistance(30.0f).setUnlocalizedName("voree.oreGoldNether");
		
		GLOWSTONE_ORE.setHarvestLevel("pickaxe", 2);
		OVERWORLD_QUARTZ_ORE.setHarvestLevel("pickaxe", 2);
		PRISMARINE_ORE.setHarvestLevel("pickaxe", 2);
		FLINT_ORE.setHarvestLevel("pickaxe", 1);
		BONE_ORE.setHarvestLevel("pickaxe", 1);
		NETHER_BONE_ORE.setHarvestLevel("pickaxe", 1);
		NETHER_COAL_ORE.setHarvestLevel("pickaxe", 1);
		PURPUR_ORE.setHarvestLevel("pickaxe", 2);
		BLAZE_POWDER_ORE.setHarvestLevel("pickaxe", 1);
		NETHER_GOLD_ORE.setHarvestLevel("pickaxe", 2);
	}
}