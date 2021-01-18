package annabeth.voree;

import java.util.Random;

import annabeth.voree.blocks.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	private WorldGenerator GLOWSTONE_ORE;
	private WorldGenerator OVERWORLD_QUARTZ_ORE;
	private WorldGenerator PRISMARINE_ORE;
	private WorldGenerator FLINT_ORE;
	private WorldGenerator BONE_ORE;
	private WorldGenerator NETHER_BONE_ORE;
	private WorldGenerator NETHER_WART_ORE;
	private WorldGenerator NETHER_COAL_ORE;
	private WorldGenerator PURPUR_ORE;
	private WorldGenerator BLAZE_POWDER_ORE;
	private WorldGenerator NETHER_GOLD_ORE;
	
	public OreGen() {
		VoreeMain.logger.info("Creating Ore Genrator");
		if (Config.GLOWSTONE_ORE) this.GLOWSTONE_ORE = new WorldGenMinable(ModBlocks.GLOWSTONE_ORE.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.NETHERRACK));
		if (Config.QUARTZ_ORE) this.OVERWORLD_QUARTZ_ORE = new WorldGenMinable(ModBlocks.OVERWORLD_QUARTZ_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		if (Config.PRISMARINE_ORE) this.PRISMARINE_ORE = new WorldGenMinable(ModBlocks.PRISMARINE_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		if (Config.FLINT_ORE) this.FLINT_ORE = new WorldGenMinable(ModBlocks.FLINT_ORE.getDefaultState(), 17, BlockMatcher.forBlock(Blocks.STONE));
		if (Config.BONE_ORE) this.BONE_ORE = new WorldGenMinable(ModBlocks.BONE_ORE.getDefaultState(), 13, BlockMatcher.forBlock(Blocks.STONE));
		if (Config.NETHER_BONE_ORE) this.NETHER_BONE_ORE = new WorldGenMinable(ModBlocks.NETHER_BONE_ORE.getDefaultState(), 13, BlockMatcher.forBlock(Blocks.NETHERRACK));
		if (Config.NETHER_WART_ORE) this.NETHER_WART_ORE = new WorldGenMinable(ModBlocks.NETHER_WART_ORE.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.SOUL_SAND));
		if (Config.NETHER_COAL_ORE) this.NETHER_COAL_ORE = new WorldGenMinable(ModBlocks.NETHER_COAL_ORE.getDefaultState(), 17, BlockMatcher.forBlock(Blocks.NETHERRACK));
		if (Config.PURPUR_ORE) this.PURPUR_ORE = new WorldGenMinable(ModBlocks.PURPUR_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		if (Config.BLAZE_POWDER_ORE) this.BLAZE_POWDER_ORE = new WorldGenMinable(ModBlocks.BLAZE_POWDER_ORE.getDefaultState(), 11, BlockMatcher.forBlock(Blocks.NETHERRACK));
		if (Config.NETHER_GOLD_ORE) this.NETHER_GOLD_ORE = new WorldGenMinable(ModBlocks.NETHER_GOLD_ORE.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionType()) {
			case NETHER:
				if (Config.BLAZE_POWDER_ORE) this.generateOres(this.BLAZE_POWDER_ORE, world, random, chunkX, chunkZ, 5, 16, 64);
				if (Config.GLOWSTONE_ORE) this.generateOres(this.GLOWSTONE_ORE, world, random, chunkX, chunkZ, 6, 0, 48);
				if (Config.NETHER_BONE_ORE) this.generateOres(this.NETHER_BONE_ORE, world, random, chunkX, chunkZ, 8, 0, 128);
				if (Config.NETHER_COAL_ORE) this.generateOres(this.NETHER_COAL_ORE, world, random, chunkX, chunkZ, 12, 0, 128);
				if (Config.NETHER_GOLD_ORE) this.generateOres(this.NETHER_GOLD_ORE, world, random, chunkX, chunkZ, 10, 10, 117);
				if (Config.NETHER_WART_ORE) this.generateOres(this.NETHER_WART_ORE, world, random, chunkX, chunkZ, 3, 4, 87);
				break;
			case OVERWORLD:
				if (Config.BONE_ORE) this.generateOres(this.BONE_ORE, world, random, chunkX, chunkZ, 8, 0, 128);
				if (Config.FLINT_ORE) this.generateOres(this.FLINT_ORE, world, random, chunkX, chunkZ, 7, 20, 100);
				if (Config.QUARTZ_ORE) this.generateOres(this.OVERWORLD_QUARTZ_ORE, world, random, chunkX, chunkZ, 2, 4, 24);
				if (Config.PRISMARINE_ORE) this.generatePrisOres(this.PRISMARINE_ORE, world, random, chunkX, chunkZ, 4, 6, 48);
				break;
			case THE_END:
				if (Config.PURPUR_ORE) this.generateOres(this.PURPUR_ORE, world, random, chunkX, chunkZ, 10, 0, 255);
				break;
			default:
				if (Config.BLAZE_POWDER_ORE) this.generateOres(this.BLAZE_POWDER_ORE, world, random, chunkX, chunkZ, 5, 16, 64);
				if (Config.GLOWSTONE_ORE) this.generateOres(this.GLOWSTONE_ORE, world, random, chunkX, chunkZ, 6, 0, 48);
				if (Config.NETHER_BONE_ORE) this.generateOres(this.NETHER_BONE_ORE, world, random, chunkX, chunkZ, 8, 0, 128);
				if (Config.NETHER_COAL_ORE) this.generateOres(this.NETHER_COAL_ORE, world, random, chunkX, chunkZ, 12, 0, 128);
				if (Config.NETHER_GOLD_ORE) this.generateOres(this.NETHER_GOLD_ORE, world, random, chunkX, chunkZ, 10, 10, 117);
				if (Config.NETHER_WART_ORE) this.generateOres(this.NETHER_WART_ORE, world, random, chunkX, chunkZ, 3, 4, 87);
				if (Config.BONE_ORE) this.generateOres(this.BONE_ORE, world, random, chunkX, chunkZ, 8, 0, 128);
				if (Config.FLINT_ORE) this.generateOres(this.FLINT_ORE, world, random, chunkX, chunkZ, 7, 20, 100);
				if (Config.QUARTZ_ORE) this.generateOres(this.OVERWORLD_QUARTZ_ORE, world, random, chunkX, chunkZ, 2, 4, 24);
				if (Config.PURPUR_ORE) this.generateOres(this.PURPUR_ORE, world, random, chunkX, chunkZ, 10, 0, 255);
				if (Config.PRISMARINE_ORE) this.generatePrisOres(this.PRISMARINE_ORE, world, random, chunkX, chunkZ, 4, 6, 48);
				break;
		}
	}
	
	private void generateOres(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chances, int minY, int maxY) {
		if(minY < 0) minY = 0;
	    if(maxY > 255) maxY = 255;
	 
	    if(maxY < minY) {
	        int i = minY;
	        minY = maxY;
	        maxY = i;
	    } else if(maxY == minY) {
	        if(maxY < 255) {
	            maxY++;
	        } else minY--;
	    }
	 
	    BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
	    int heightDiff = maxY - minY + 1;
	 
	    for (int i = 0; i < chances; i++) {
	        generator.generate(world, random, 
	        	chunkPosAsBlockPos.add(
	        		random.nextInt(16),
	        		minY + random.nextInt(heightDiff),
	        		random.nextInt(16)
	        	)
	        );
	    }
	}
	
	private void generatePrisOres(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chances, int minY, int maxY) {
		if(minY < 0) minY = 0;
	    if(maxY > 255) maxY = 255;
	 
	    if(maxY < minY) {
	        int i = minY;
	        minY = maxY;
	        maxY = i;
	    } else if(maxY == minY) {
	        if(maxY < 255) {
	            maxY++;
	        } else minY--;
	    }
	 
	    BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
	    int heightDiff = maxY - minY + 1;
	 
	    for (int i = 0; i < chances; i++) {
	    	BlockPos pos = chunkPosAsBlockPos.add(random.nextInt(16), minY + random.nextInt(heightDiff), random.nextInt(16));
	    	Biome biome = world.getBiomeProvider().getBiome(pos);
	    	
	    	if (biome == Biomes.DEEP_OCEAN || biome == Biomes.OCEAN) {
	    		generator.generate(world, random, pos);
	    	}
	    }
	}
}