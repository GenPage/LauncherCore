/*
 * This file is part of Technic Launcher Core.
 * Copyright (C) 2013 Syndicate, LLC
 *
 * Technic Launcher Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Technic Launcher Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * as well as a copy of the GNU Lesser General Public License,
 * along with Technic Launcher Core.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.technicpack.launchercore.modpacks.sources;

import net.technicpack.launchercore.modpacks.InstalledPack;

<<<<<<< HEAD:src/main/java/net/technicpack/launchercore/modpacks/sources/IInstalledPackRepository.java
import java.util.List;
import java.util.Map;

public interface IInstalledPackRepository {
	Map<String, InstalledPack> getInstalledPacks();
	List<String> getPackNames();
	String getSelectedSlug();
	void setSelectedSlug(String slug);
	InstalledPack put(InstalledPack installedPack);
	InstalledPack remove(String name);
	void save();
=======
    private List<VersionEntry> versions;
    private LatestEntry latest;

    public List<VersionEntry> getVersions() {
        return versions;
    }

    public LatestEntry getLatest() {
        return latest;
    }
>>>>>>> Re-tab & optimize imports for all files in core.:src/main/java/net/technicpack/launchercore/minecraft/versionlist/VersionList.java
}
