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

package net.technicpack.rest.io;

import net.technicpack.platform.io.PlatformPackInfo;
import net.technicpack.rest.RestObject;

import java.util.ArrayList;
import java.util.List;

public class Modpack extends RestObject {
    private String minecraft;
    private List<Mod> mods;

    public Modpack() {

    }

<<<<<<< HEAD:src/main/java/net/technicpack/rest/io/Modpack.java
	public Modpack(PlatformPackInfo info) {
        minecraft = info.getGameVersion();
		mods = new ArrayList<Mod>();
		Mod mod = new Mod(info.getName(), info.getRecommended(), info.getUrl(), "");
		mods.add(mod);
	}

	public String getGameVersion() {
		return minecraft;
	}
=======
    public Modpack(PlatformPackInfo info) {
        minecraft = info.getMinecraft();
        mods = new ArrayList<Mod>();
        Mod mod = new Mod(info.getName(), info.getRecommended(), info.getUrl(), "");
        mods.add(mod);
    }

    public String getMinecraft() {
        return minecraft;
    }
>>>>>>> Re-tab & optimize imports for all files in core.:src/main/java/net/technicpack/launchercore/restful/Modpack.java

    public List<Mod> getMods() {
        return mods;
    }
}
