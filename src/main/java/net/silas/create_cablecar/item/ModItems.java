package net.silas.create_cablecar.item;


import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.silas.create_cablecar.CreateCableCar;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateCableCar.MOD_ID);

    public static final DeferredItem<Item> METAL_CABLE = ITEMS.register("metal_cable",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
