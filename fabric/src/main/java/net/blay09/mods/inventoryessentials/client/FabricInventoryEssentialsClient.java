package net.blay09.mods.inventoryessentials.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.inventoryessentials.InventoryEssentials;
import net.fabricmc.api.ClientModInitializer;

public class FabricInventoryEssentialsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initialize(InventoryEssentials.MOD_ID, InventoryEssentialsClient::initialize);
    }
}
