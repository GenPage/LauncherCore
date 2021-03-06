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

package net.technicpack.launchercore.auth;

<<<<<<< HEAD:src/main/java/net/technicpack/launchercore/auth/IGameAuthService.java
import net.technicpack.launchercore.exception.AuthenticationNetworkFailureException;

public interface IGameAuthService<UserData> {
    public UserData createClearedUser(String username, IAuthResponse response);
    public UserData createOfflineUser(String displayName);
    public IAuthResponse requestRefresh(UserData user) throws AuthenticationNetworkFailureException;
    public IAuthResponse requestLogin(String username, String password, String data) throws AuthenticationNetworkFailureException;
=======
public class Response {
    private String error;
    private String errorMessage;
    private String cause;

    public String getError() {
        return error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "Response{" +
                "error='" + error + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
>>>>>>> Re-tab & optimize imports for all files in core.:src/main/java/net/technicpack/launchercore/auth/Response.java
}
