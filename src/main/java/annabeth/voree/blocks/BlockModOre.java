package annabeth.voree.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockModOre extends Block {
	public BlockModOre() {
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public BlockModOre(MapColor mapColor) {
		super (Material.ROCK, mapColor);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (this == ModBlocks.BONE_ORE || this == ModBlocks.NETHER_BONE_ORE) {
        	return Items.DYE;
        } else if (this == ModBlocks.FLINT_ORE) {
        	return Items.FLINT;
        } else if (this == ModBlocks.GLOWSTONE_ORE) {
        	return Items.GLOWSTONE_DUST;
        } else if (this == ModBlocks.NETHER_COAL_ORE) {
        	return Items.COAL;
        } else if (this == ModBlocks.OVERWORLD_QUARTZ_ORE) {
        	return Items.QUARTZ;
        } else if (this == ModBlocks.BLAZE_POWDER_ORE) {
        	return Items.BLAZE_POWDER;
        } else {
        	return this == ModBlocks.PURPUR_ORE ? Items.CHORUS_FRUIT_POPPED : Item.getItemFromBlock(this);
        }
    }
	
    public int quantityDropped(Random random) {
        return 1;
    }
    
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
        	int i = random.nextInt(fortune + 2) - 1;
            
            if (i < 0) {
            	i = 0;
            }
            
            return this.quantityDropped(random) * (i + 1);
        } else {
        	return this.quantityDropped(random);
        }
    }
    
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
    	super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
    	Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
        	if (this == ModBlocks.BONE_ORE || this == ModBlocks.NETHER_BONE_ORE) {
            	return 1;
            } else if (this == ModBlocks.FLINT_ORE) {
            	return 1;
            } else if (this == ModBlocks.GLOWSTONE_ORE) {
            	return 3;
            } else if (this == ModBlocks.NETHER_COAL_ORE) {
            	return 2;
            } else if (this == ModBlocks.OVERWORLD_QUARTZ_ORE) {
            	return 3;
            } else if (this == ModBlocks.BLAZE_POWDER_ORE) {
            	return 3;
            } else {
            	return this == ModBlocks.PURPUR_ORE ? 5 : 0;
            }
        }
        return 0;
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
    	return new ItemStack(this);
    }
    
    public int damageDropped(IBlockState state) {
        return (this == ModBlocks.BONE_ORE || this == ModBlocks.NETHER_BONE_ORE) ? EnumDyeColor.WHITE.getDyeDamage() : 0;
    }
}