package com.technovision.ironchest.blocks;

import com.technovision.ironchest.IronChests;
import com.technovision.ironchest.blocks.blockentities.*;
import com.technovision.ironchest.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public enum ExtraChestTypes {

    IRON(54, 9, 184, 222, new Identifier(IronChests.MOD_ID, "entity/chest/iron_chest"), 256, 256),
    GOLD(81, 9, 184, 276, new Identifier(IronChests.MOD_ID, "entity/chest/gold_chest"), 256, 276),
    DIAMOND(108, 12, 238, 276, new Identifier(IronChests.MOD_ID, "entity/chest/diamond_chest"), 256, 276),
    COPPER(45, 9, 184, 204, new Identifier(IronChests.MOD_ID, "entity/chest/copper_chest"), 256, 256),
    SILVER(72, 9, 184, 258, new Identifier(IronChests.MOD_ID, "entity/chest/silver_chest"), 256, 276),
    CRYSTAL(108, 12, 238, 276, new Identifier(IronChests.MOD_ID, "entity/chest/crystal_chest"), 256, 276),
    OBSIDIAN(108, 12, 238, 276, new Identifier(IronChests.MOD_ID,"entity/chest/obsidian_chest"), 256, 276),
    DIRT(1, 1, 184, 184, new Identifier(IronChests.MOD_ID, "entity/chest/dirt_chest"), 256, 256),
    HOLIDAY(27, 9, 0, 0, new Identifier("entity/chest/christmas"), 0, 0),
    WOOD(0, 0, 0, 0, new Identifier(IronChests.MOD_ID, ("entity/chest/dirt_chest")), 0, 0);

    public final int size;
    public final int rowLength;
    public final int xSize;
    public final int ySize;
    public final Identifier texture;
    public final int textureXSize;
    public final int textureYSize;

    ExtraChestTypes(int size, int rowLength, int xSize, int ySize, Identifier texture, int textureXSize, int textureYSize) {
        this.size = size;
        this.rowLength = rowLength;
        this.xSize = xSize;
        this.ySize = ySize;
        this.texture = texture;
        this.textureXSize = textureXSize;
        this.textureYSize = textureYSize;
    }

    public int getRowCount() {
        return this.size / this.rowLength;
    }

    public static Block get(ExtraChestTypes type) {
        switch (type) {
            case IRON:
                return ModBlocks.IRON_CHEST;
            case GOLD:
                return ModBlocks.GOLD_CHEST;
            case DIAMOND:
                return ModBlocks.DIAMOND_CHEST;
            case COPPER:
                return ModBlocks.COPPER_CHEST;
            case SILVER:
                return ModBlocks.SILVER_CHEST;
            case CRYSTAL:
                return ModBlocks.CRYSTAL_CHEST;
            case OBSIDIAN:
                return ModBlocks.OBSIDIAN_CHEST;
            case DIRT:
                return ModBlocks.DIRT_CHEST;
            case HOLIDAY:
                return ModBlocks.HOLIDAY_CHEST;
            default:
                return Blocks.CHEST;
        }
    }

    public GenericIronChestBlockEntity makeEntity() {
        switch (this) {
            case IRON:
                return new IronChestBlockEntity();
            case GOLD:
                return new GoldChestBlockEntity();
            case DIAMOND:
                return new DiamondChestBlockEntity();
            case COPPER:
                return new CopperChestBlockEntity();
            case SILVER:
                return new SilverChestBlockEntity();
            case CRYSTAL:
                return new CrystalChestBlockEntity();
            case OBSIDIAN:
                return new ObsidianChestBlockEntity();
            case DIRT:
                return new DirtChestBlockEntity();
            case HOLIDAY:
                return new HolidayChestBlockEntity();
            default:
                return null;
        }
    }
}
