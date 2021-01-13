package annabeth.voree.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPrismarineOre extends Block {
	public BlockPrismarineOre() {
		super(Material.ROCK, MapColor.STONE);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        super.getDrops(drops, world, pos, state, 0);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        
        if (fortune > 3) {
            fortune = 3;
        }
        
        if (rand.nextInt(10 - fortune * 3) == 0) {
        	drops.add(new ItemStack(Items.PRISMARINE_CRYSTALS, 1, 0));
        }
    }
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.PRISMARINE_SHARD;
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
        	return 3;
        }
        return 0;
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
    	return new ItemStack(this);
    }
}
