package annabeth.voree;

import annabeth.voree.blocks.ModBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void smeltingInit() {
		VoreeMain.logger.info("Registering Smelting");
		GameRegistry.addSmelting(ModBlocks.BLAZE_POWDER_ORE, new ItemStack(Items.BLAZE_ROD), 3.0f);
		GameRegistry.addSmelting(ModBlocks.BONE_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.WHITE.getDyeDamage()), 3.0f);
		GameRegistry.addSmelting(ModBlocks.FLINT_ORE, new ItemStack(Items.FLINT), 3.0f);
		GameRegistry.addSmelting(ModBlocks.GLOWSTONE_ORE, new ItemStack(Items.GLOWSTONE_DUST), 4.0f);
		GameRegistry.addSmelting(ModBlocks.NETHER_BONE_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.WHITE.getDyeDamage()), 3.0f);
		GameRegistry.addSmelting(ModBlocks.NETHER_COAL_ORE, new ItemStack(Items.COAL), 3.0f);
		GameRegistry.addSmelting(ModBlocks.NETHER_GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 4.0f);
		GameRegistry.addSmelting(ModBlocks.NETHER_WART_ORE, new ItemStack(Items.NETHER_WART), 3.0f);
		GameRegistry.addSmelting(ModBlocks.OVERWORLD_QUARTZ_ORE, new ItemStack(Items.QUARTZ), 4.0f);
		GameRegistry.addSmelting(ModBlocks.PRISMARINE_ORE, new ItemStack(Items.PRISMARINE_SHARD), 4.0f);
		GameRegistry.addSmelting(ModBlocks.PURPUR_ORE, new ItemStack(Items.CHORUS_FRUIT_POPPED), 4.0f);
	}
}