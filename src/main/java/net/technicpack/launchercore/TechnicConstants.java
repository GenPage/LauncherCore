/**
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

package net.technicpack.launchercore;

public class TechnicConstants {
    public static final String technicURL = "http://mirror.technicpack.net/Technic/";
    public static final String technicVersions = technicURL + "version/";

<<<<<<< HEAD:src/main/java/net/technicpack/launchercore/TechnicConstants.java
    public static String getTechnicVersionJson(String version) {
        return technicVersions + version + "/" + version + ".json";
    }
=======
public interface Version {

    public String getId();

    public ReleaseType getType();

    public void setType(ReleaseType releaseType);

    public Date getUpdatedTime();

    public void setUpdatedTime(Date updatedTime);

    public Date getReleaseTime();

    public void setReleaseTime(Date releaseTime);
>>>>>>> Re-tab & optimize imports for all files in core.:src/main/java/net/technicpack/launchercore/minecraft/Version.java
}
