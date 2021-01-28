package annabeth.voree;

import java.io.File;

import org.apache.logging.log4j.Logger;

import annabeth.voree.blocks.ModBlocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = VoreeMain.MODID, name = VoreeMain.NAME, version = VoreeMain.VERSION)
public class VoreeMain {
    public static final String MODID = "voree";
    public static final String NAME = "Vanilla Ore Extension";
    public static final String VERSION = "1.0";
    
    public static Configuration config;
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath()), "vanilla_extension\\ores.cfg");
        Config.readConfig();
        ModBlocks.initBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        CraftingManager.smeltingInit();
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        OreDictionary.registerOre("oreBlazePowder", ModBlocks.BLAZE_POWDER_ORE);
        OreDictionary.registerOre("oreBone", ModBlocks.BONE_ORE);
        OreDictionary.registerOre("oreFlint", ModBlocks.FLINT_ORE);
        OreDictionary.registerOre("oreGlowstone", ModBlocks.GLOWSTONE_ORE);
        OreDictionary.registerOre("oreBone", ModBlocks.NETHER_BONE_ORE);
        OreDictionary.registerOre("oreBoneNether", ModBlocks.NETHER_BONE_ORE);
        OreDictionary.registerOre("oreCoal", ModBlocks.NETHER_COAL_ORE);
        OreDictionary.registerOre("oreCoalNether", ModBlocks.NETHER_COAL_ORE);
        OreDictionary.registerOre("oreGold", ModBlocks.NETHER_GOLD_ORE);
        OreDictionary.registerOre("oreGoldNether", ModBlocks.NETHER_GOLD_ORE);
        OreDictionary.registerOre("oreNetherWart", ModBlocks.NETHER_WART_ORE);
        OreDictionary.registerOre("orePrismarine", ModBlocks.PRISMARINE_ORE);
        OreDictionary.registerOre("oreQuartz", ModBlocks.OVERWORLD_QUARTZ_ORE);
        OreDictionary.registerOre("oreQuartzOverworld", ModBlocks.OVERWORLD_QUARTZ_ORE);
        OreDictionary.registerOre("orePurpur", ModBlocks.PURPUR_ORE);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}