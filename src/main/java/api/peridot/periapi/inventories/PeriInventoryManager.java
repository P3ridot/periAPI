package api.peridot.periapi.inventories;

import api.peridot.periapi.PeriAPI;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class PeriInventoryManager {

    private final Plugin plugin;
    private final PeriAPI periApi;

    public List<CustomInventory> inventoriesList = new ArrayList<>();

    public PeriInventoryManager(Plugin plugin, PeriAPI periApi) {
        this.plugin = plugin;
        this.periApi = periApi;
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    public PeriAPI getPeriApi() {
        return this.periApi;
    }

    public List<CustomInventory> getInventories() {
        return this.inventoriesList;
    }

    public void addInventory(CustomInventory inventory) {
        this.inventoriesList.add(inventory);
    }

}
