package preponderous.ponder;

import org.bukkit.plugin.java.JavaPlugin;

/*
    At this time, I'm unsure if this class is necessary. This will depend on whether or not
    it is required for the API to be installed as a separate plugin. - Daniel
 */

public class Ponder extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Ponder is enabling.");
    }

    public void onDisable() {
        System.out.println("Ponder is disabling.");
    }

    /**
     * Method to get the Ponder API.
     *
     * @return Ponder API
     */
    public PonderAPI getAPI(JavaPlugin plugin) {
        return new PonderAPI(plugin);
    }

    /**
     * Method to drop the get the Ponder API Integrator.
     *
     * @return Ponder API Integrator
     */
    public PonderAPI_Integrator getIntegrator(JavaPlugin plugin) {
        return new PonderAPI_Integrator(plugin);
    }

}
