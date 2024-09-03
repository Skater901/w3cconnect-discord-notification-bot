package au.com.skater901.wc3connect.application.config

import au.com.skater901.wc3connect.application.annotation.ConfigClass

@ConfigClass("gamesSource")
internal class GamesSourceConfiguration(val refreshInterval: Long = 30_000)