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

package net.technicpack.launchercore.image.face;

import net.technicpack.launchercore.auth.IUserType;
import net.technicpack.launchercore.image.IImageStore;
import net.technicpack.launchercore.mirror.MirrorStore;
import net.technicpack.utilslib.Utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class MinotarFaceImageStore implements IImageStore<IUserType> {
	private String mBaseUrl;
    private MirrorStore mirrorStore;

	public MinotarFaceImageStore(String baseUrl, MirrorStore mirrorStore) {
		mBaseUrl = baseUrl;
        this.mirrorStore = mirrorStore;
	}

    @Override
    public void downloadImage(IUserType user, File location) {
        try {
            mirrorStore.downloadFile(mBaseUrl+"helm/"+user.getDisplayName()+"/100", user.getDisplayName(), location.getAbsolutePath());
        } catch (IOException e) {
            Utils.getLogger().log(Level.INFO, "Error downloading user face image: " + user.getDisplayName(), e);
        }
    }

    @Override
    public String getJobKey(IUserType key) {
        return "user-face-"+key.getDisplayName();
    }

    @Override
    public boolean canRetry(IUserType key) { return false; }
}
