package net.mcreator.dungens.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dungens.entity.HelheimwarriorEntity;

public class HelheimwarriorModel extends GeoModel<HelheimwarriorEntity> {
	@Override
	public ResourceLocation getAnimationResource(HelheimwarriorEntity entity) {
		return new ResourceLocation("dungens", "animations/helheim_warrior_bbmodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HelheimwarriorEntity entity) {
		return new ResourceLocation("dungens", "geo/helheim_warrior_bbmodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HelheimwarriorEntity entity) {
		return new ResourceLocation("dungens", "textures/entities/" + entity.getTexture() + ".png");
	}

}
