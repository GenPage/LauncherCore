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

package net.technicpack.launchercore.launch;

import net.technicpack.utilslib.Utils;

import java.util.List;

<<<<<<< HEAD:src/main/java/net/technicpack/launchercore/launch/GameProcess.java
public class GameProcess {
	private final List<String> commands;
	private final Process process;
	private ProcessExitListener exitListener;
	private final ProcessMonitorThread monitorThread;

	public GameProcess(List<String> commands, Process process) {
		this.commands = commands;
		this.process = process;

        String commandText = "";

        for (String command : commands) {
            commandText += command + " ";
        }
        Utils.getLogger().info(commandText);

		this.monitorThread = new ProcessMonitorThread(this);
		this.monitorThread.start();
	}

	public ProcessExitListener getExitListener() {
		return exitListener;
	}

	public void setExitListener(ProcessExitListener exitListener) {
		this.exitListener = exitListener;
	}
=======
public class MinecraftProcess {
    private final List<String> commands;
    private final Process process;
    private MinecraftExitListener exitListener;
    private final ProcessMonitorThread monitorThread;

    public MinecraftProcess(List<String> commands, Process process) {
        this.commands = commands;
        this.process = process;
        this.monitorThread = new ProcessMonitorThread(this);
        this.monitorThread.start();
    }

    public MinecraftExitListener getExitListener() {
        return exitListener;
    }

    public void setExitListener(MinecraftExitListener exitListener) {
        this.exitListener = exitListener;
    }
>>>>>>> Re-tab & optimize imports for all files in core.:src/main/java/net/technicpack/launchercore/launch/MinecraftProcess.java

    public Process getProcess() {
        return process;
    }
}
