package com.github.Ringoame196

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    private val plugin = this
    private val serverManager = ServerManager(plugin)
    override fun onEnable() {
        super.onEnable()
        plugin.saveDefaultConfig()
        serverManager.start()
        server.pluginManager.registerEvents(Events(), plugin)
    }

    override fun onDisable() {
        super.onDisable()
        serverManager.stop()
    }
}
