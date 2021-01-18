package annabeth.voree;

import annabeth.voree.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = VoreeMain.MODID)
public class RegistryHandler {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		VoreeMain.logger.info("Registering Item Blocks");
		
		IForgeRegistry<Item> reg = event.getRegistry();
		
		if (Config.BONE_ORE) reg.register(newItemBlock(ModBlocks.BONE_ORE));
		if (Config.FLINT_ORE) reg.register(newItemBlock(ModBlocks.FLINT_ORE));
		if (Config.GLOWSTONE_ORE) reg.register(newItemBlock(ModBlocks.GLOWSTONE_ORE));
		if (Config.NETHER_BONE_ORE) reg.register(newItemBlock(ModBlocks.NETHER_BONE_ORE));
		if (Config.NETHER_COAL_ORE) reg.register(newItemBlock(ModBlocks.NETHER_COAL_ORE));
		if (Config.NETHER_WART_ORE) reg.register(newItemBlock(ModBlocks.NETHER_WART_ORE));
		if (Config.QUARTZ_ORE) reg.register(newItemBlock(ModBlocks.OVERWORLD_QUARTZ_ORE));
		if (Config.PRISMARINE_ORE) reg.register(newItemBlock(ModBlocks.PRISMARINE_ORE));
		if (Config.PURPUR_ORE) reg.register(newItemBlock(ModBlocks.PURPUR_ORE));
		if (Config.BLAZE_POWDER_ORE) reg.register(newItemBlock(ModBlocks.BLAZE_POWDER_ORE));
		if (Config.NETHER_GOLD_ORE) reg.register(newItemBlock(ModBlocks.NETHER_GOLD_ORE));
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		VoreeMain.logger.info("Registering Blocks");
		
		IForgeRegistry<Block> reg = event.getRegistry();
		
		if (Config.BONE_ORE) reg.register(ModBlocks.BONE_ORE);
		if (Config.FLINT_ORE) reg.register(ModBlocks.FLINT_ORE);
		if (Config.GLOWSTONE_ORE) reg.register(ModBlocks.GLOWSTONE_ORE);
		if (Config.NETHER_BONE_ORE) reg.register(ModBlocks.NETHER_BONE_ORE);
		if (Config.NETHER_COAL_ORE) reg.register(ModBlocks.NETHER_COAL_ORE);
		if (Config.NETHER_WART_ORE) reg.register(ModBlocks.NETHER_WART_ORE);
		if (Config.QUARTZ_ORE) reg.register(ModBlocks.OVERWORLD_QUARTZ_ORE);
		if (Config.PRISMARINE_ORE) reg.register(ModBlocks.PRISMARINE_ORE);
		if (Config.PURPUR_ORE) reg.register(ModBlocks.PURPUR_ORE);
		if (Config.BLAZE_POWDER_ORE) reg.register(ModBlocks.BLAZE_POWDER_ORE);
		if (Config.NETHER_GOLD_ORE) reg.register(ModBlocks.NETHER_GOLD_ORE);
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		if (Config.BONE_ORE) registerModel(ModBlocks.BONE_ORE, 0);
		if (Config.FLINT_ORE) registerModel(ModBlocks.FLINT_ORE, 0);
		if (Config.GLOWSTONE_ORE) registerModel(ModBlocks.GLOWSTONE_ORE, 0);
		if (Config.NETHER_BONE_ORE) registerModel(ModBlocks.NETHER_BONE_ORE, 0);
		if (Config.NETHER_COAL_ORE) registerModel(ModBlocks.NETHER_COAL_ORE, 0);
		if (Config.NETHER_WART_ORE) registerModel(ModBlocks.NETHER_WART_ORE, 0);
		if (Config.QUARTZ_ORE) registerModel(ModBlocks.OVERWORLD_QUARTZ_ORE, 0);
		if (Config.PRISMARINE_ORE) registerModel(ModBlocks.PRISMARINE_ORE, 0);
		if (Config.PURPUR_ORE) registerModel(ModBlocks.PURPUR_ORE, 0);
		if (Config.BLAZE_POWDER_ORE) registerModel(ModBlocks.BLAZE_POWDER_ORE, 0);
		if (Config.NETHER_GOLD_ORE) registerModel(ModBlocks.NETHER_GOLD_ORE, 0);
	}
	
	private static ItemBlock newItemBlock(Block block) {
		return (ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName());
	}
	
	private static void registerModel(Block block, int meta) {
		registerModel(Item.getItemFromBlock(block), meta);
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}