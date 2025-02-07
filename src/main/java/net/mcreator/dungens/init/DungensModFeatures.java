
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungens.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dungens.world.features.TestFeature;
import net.mcreator.dungens.DungensMod;

@Mod.EventBusSubscriber
public class DungensModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DungensMod.MODID);
	public static final RegistryObject<Feature<?>> TEST = REGISTRY.register("test", TestFeature::new);
}
