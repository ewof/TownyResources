package io.github.townyadvanced.townyresources.listeners;

import com.gmail.goosius.siegewar.settings.Translation;
import com.palmergames.bukkit.towny.event.statusscreen.NationStatusScreenEvent;
import com.palmergames.bukkit.towny.object.Nation;
import io.github.townyadvanced.townyresources.TownyResources;
import io.github.townyadvanced.townyresources.settings.Settings;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Goosius
 *
 */
public class TownyResourcesNationEventListener implements Listener {

	@SuppressWarnings("unused")
	private final TownyResources plugin;
	
	public TownyResourcesNationEventListener(TownyResources instance) {

		plugin = instance;
	}

	/*
	 * TownyResources will add resource info to the town screen
	 */
	@EventHandler
	public void onNationStatusScreen(NationStatusScreenEvent event) {
		if (Settings.isEnabled()) {
			List<String> out = new ArrayList<>();
			Nation nation = event.getNation();

			//Resources:
			out.add(Translation.of("town.screen.header"));
			out.add(Translation.of("town.screen.daily.production", "dummy list"));
			out.add(Translation.of("town.screen.available.for.collection", "dummy list"));

	        event.addLines(out);
		}
	}
}
