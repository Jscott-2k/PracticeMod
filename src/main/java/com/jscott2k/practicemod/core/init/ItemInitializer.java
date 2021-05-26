package com.jscott2k.practicemod.core.init;

import com.jscott2k.practicemod.PracticeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitializer  {


    private final static RegistryObject<Item> SUN_MASK = Initializer.ITEMS.register("sun_mask", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static void init(){}
}
