package com.vedel.MobSwords.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.vedel.MobSwords.MobSwords;

public class ItemChickenSword extends ItemSword {

	public ItemChickenSword()
	{
		super(Item.ToolMaterial.IRON);
		this.setUnlocalizedName("ChickenSword");
		this.setTextureName(MobSwords.modid + ":" + "ChickenSword");
	}

}