package net.goldcraft.atlasmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GILDED_BERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent GILDED_FLESH = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent GILDED_BERRY_SOUP = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build();
    public static final FoodComponent GILDED_HEART = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent GILDED_BEEF = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}
