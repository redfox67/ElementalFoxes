package com.Harlefox.elementalfoxes.common.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class ExampleFoxSpawnEgg extends ForgeSpawnEggItem{
	
	protected static final List<ExampleFoxSpawnEgg> EGGS_TO_ADD = new ArrayList<>();
	protected static DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {
		@Override
		protected ItemStack execute(IBlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			EntityType <?> eType = ((EntityType<?>)((ForgeSpawnEggItem) stack.getItem()).getType(stack.getTag()));
			
			eType.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
			stack.shrink(1);
			return stack;
		}
	};
	
	private final Lazy<? extends EntityType<?>> LazyEntity;

	public ExampleFoxSpawnEgg(final RegistryObject<? extends EntityType<?>> type, final int backgroundColor, final int highlightColor,
			Properties props) {
		super(null, backgroundColor, highlightColor, props);
		this.LazyEntity = Lazy.of(type::get);
		EGGS_TO_ADD.add(this);
	}
	
	public static void initSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "field_195987_b");
		
		for (final SpawnEggItem item : EGGS_TO_ADD) {
			EGGS.put(item.getType(null), item);
			DispenserBlock.registerBehavior(item, behavior);
		}
		EGGS_TO_ADD.clear();
	}
	
	@Override
	public EntityType<?> getType(CompoundNBT nbt){
		return this.LazyEntity.get();
	}

}
