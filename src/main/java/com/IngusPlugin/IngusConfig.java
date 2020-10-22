package com.IngusPlugin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Ingus Plugin")
public interface IngusConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "showBankNums",
		name = "Show Bank Indices",
		description = "Enable or disable whether the index number of an item in the bank is displayed."
	)
	default boolean showBankNums()
	{
		return true;
	}
}
