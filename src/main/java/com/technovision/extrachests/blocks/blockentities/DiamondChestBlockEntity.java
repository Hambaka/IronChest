package com.technovision.extrachests.blocks.blockentities;

import com.technovision.extrachests.blocks.ExtraChestTypes;
import com.technovision.extrachests.registry.ModBlockEntityType;
import com.technovision.extrachests.registry.ModScreenHandlerType;
import com.technovision.extrachests.screenhandlers.ExtraChestScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class DiamondChestBlockEntity extends GenericExtraChestBlockEntity {

    public DiamondChestBlockEntity() {
        super(ModBlockEntityType.DIAMOND_CHEST, ExtraChestTypes.DIAMOND);
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
        return new ExtraChestScreenHandler(ModScreenHandlerType.DIAMOND_CHEST, type, syncId, inventory, ScreenHandlerContext.create(world, pos));
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory inventory) {
        return new ExtraChestScreenHandler(ModScreenHandlerType.DIAMOND_CHEST, type, syncId, inventory, ScreenHandlerContext.create(world, pos));
    }
}
