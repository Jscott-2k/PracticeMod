package com.jscott2k.practicemod.core.init;

import com.jscott2k.practicemod.PracticeMod;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Initializer {
    public final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PracticeMod.MODID);
    public static void init(){
        IEventBus modeEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modeEventBus);
    }
}
