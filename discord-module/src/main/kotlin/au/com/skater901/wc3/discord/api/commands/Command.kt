package au.com.skater901.wc3.discord.api.commands

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.interactions.commands.DefaultMemberPermissions
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData

internal interface Command {
    val name: String
    val description: String
    val options: SlashCommandData.() -> Unit
        get() = {}
    val defaultPermissions: DefaultMemberPermissions
        get() = DefaultMemberPermissions.ENABLED

    suspend fun handleCommand(command: SlashCommandInteractionEvent)
}