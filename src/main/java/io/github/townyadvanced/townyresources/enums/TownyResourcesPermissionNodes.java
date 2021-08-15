package io.github.townyadvanced.townyresources.enums;

/**
 * 
 * @author Goosius
 *
 */
public enum TownyResourcesPermissionNodes {

	TOWNY_RESOURCES_SURVEY("townyresources.survey"),  //Do a resource survey in a town
	TOWNY_RESOURCES_TOWN_COLLECT("townyresources.town.collect"),  //Collect your town's share of extracted resources
	TOWNY_RESOURCES_NATION_COLLECT("townyresources.nation.collect"); //Collect your nation's share of extracted resources

	private String value;

	/**
	 * Constructor
	 * 
	 * @param permission - Permission.
	 */
	TownyResourcesPermissionNodes(String permission) {

		this.value = permission;
	}

	/**
	 * Retrieves the permission node
	 * 
	 * @return The permission node
	 */
	public String getNode() {

		return value;
	}

	/**
	 * Retrieves the permission node
	 * replacing the character *
	 * 
	 * @param replace - String
	 * @return The permission node
	 */
	public String getNode(String replace) {

		return value.replace("*", replace);
	}

	public String getNode(int replace) {

		return value.replace("*", replace + "");
	}

}
