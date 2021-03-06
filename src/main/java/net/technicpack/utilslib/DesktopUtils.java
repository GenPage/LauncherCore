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

package net.technicpack.utilslib;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopUtils {
    public static void browseUrl(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException ex) {
            //Thrown by Desktop.browse() - just log & ignore
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            //If we got a bogus URL from the internet, then this will throw.  Log & Ignore
            ex.printStackTrace();
        } catch (RuntimeException ex) {
            //browse() throws a bunch of runtime exceptions if you give it bad input
            //WHICH IS AWESOME
            ex.printStackTrace();
        }
    }
}
