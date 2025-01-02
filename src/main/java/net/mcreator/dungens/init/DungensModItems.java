
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungens.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.dungens.DungensMod;

public class DungensModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DungensMod.MODID);
	public static final RegistryObject<Item> HELHEIMWARRIOR_SPAWN_EGG = REGISTRY.register("helheimwarrior_spawn_egg", () -> new ForgeSpawnEggItem(DungensModEntities.HELHEIMWARRIOR, -1, -1, new Item.Properties()));
}
