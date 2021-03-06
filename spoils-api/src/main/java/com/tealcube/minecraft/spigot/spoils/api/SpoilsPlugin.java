/*
 * This file is part of spoils-api, licensed under the ISC License.
 *
 * Copyright (c) 2014-2015 Richard Harrah
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 */
package com.tealcube.minecraft.spigot.spoils.api;

import com.tealcube.minecraft.bukkit.config.MasterConfiguration;
import com.tealcube.minecraft.spigot.spoils.api.builders.ItemBuilder;
import com.tealcube.minecraft.spigot.spoils.api.loaders.ItemGroupLoader;
import com.tealcube.minecraft.spigot.spoils.api.loaders.TierLoader;
import com.tealcube.minecraft.spigot.spoils.api.managers.ItemGroupManager;
import com.tealcube.minecraft.spigot.spoils.api.managers.TierManager;
import com.tealcube.minecraft.spigot.spoils.api.names.ResourceTable;
import com.tealcube.minecraft.spigot.spoils.api.tiers.TierTraitRegistry;
import org.bukkit.plugin.java.JavaPlugin;
import se.ranzdo.bukkit.methodcommand.CommandHandler;

public abstract class SpoilsPlugin extends JavaPlugin {

    protected static SpoilsPlugin instance;

    public static SpoilsPlugin getInstance() { return instance; }

    /**
     * Gets and returns the MasterConfiguration for this instance.
     *
     * @return MasterConfiguration
     */
    public abstract MasterConfiguration getSettings();

    /**
     * Gets and returns the TierTraitRegistry for this instance.
     *
     * @return TierTraitRegistry
     */
    public abstract TierTraitRegistry getTierTraitRegistry();

    /**
     * Gets and returns the TierManager for this instance.
     *
     * @return TierManager
     */
    public abstract TierManager getTierManager();

    public abstract TierLoader getNewTierLoader();

    public abstract ItemGroupManager getItemGroupManager();

    public abstract ItemGroupLoader getNewItemGroupLoader();

    public abstract ResourceTable getResourceTable();

    public abstract CommandHandler getCommandHandler();

    public abstract ItemBuilder getNewItemBuilder();

    public abstract boolean isValid();

    public abstract void setValid(boolean b);

    public abstract String getInvalidationReason();

    public abstract void setInvalidationReason(String s);

}
