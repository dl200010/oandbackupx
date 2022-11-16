package com.machiav3lli.backup.ui.compose.navigation

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.machiav3lli.backup.R
import com.machiav3lli.backup.dbs.ODatabase
import com.machiav3lli.backup.pages.BatchPage
import com.machiav3lli.backup.pages.HomePage
import com.machiav3lli.backup.pages.SchedulerPage
import com.machiav3lli.backup.preferences.AdvancedPrefsPage
import com.machiav3lli.backup.preferences.ServicePrefsPage
import com.machiav3lli.backup.preferences.ToolsPrefsPage
import com.machiav3lli.backup.preferences.UserPrefsPage
import com.machiav3lli.backup.ui.compose.icons.Phosphor
import com.machiav3lli.backup.ui.compose.icons.phosphor.ArchiveTray
import com.machiav3lli.backup.ui.compose.icons.phosphor.Bug
import com.machiav3lli.backup.ui.compose.icons.phosphor.CalendarX
import com.machiav3lli.backup.ui.compose.icons.phosphor.ClockCounterClockwise
import com.machiav3lli.backup.ui.compose.icons.phosphor.Flask
import com.machiav3lli.backup.ui.compose.icons.phosphor.GearSix
import com.machiav3lli.backup.ui.compose.icons.phosphor.House
import com.machiav3lli.backup.ui.compose.icons.phosphor.SlidersHorizontal
import com.machiav3lli.backup.ui.compose.icons.phosphor.UserGear
import com.machiav3lli.backup.ui.compose.icons.phosphor.Warning
import com.machiav3lli.backup.ui.compose.icons.phosphor.Wrench
import com.machiav3lli.backup.viewmodels.BatchViewModel
import com.machiav3lli.backup.viewmodels.SchedulerViewModel

sealed class NavItem(var title: Int, var icon: ImageVector, var destination: String) {

    init {
        navItems[destination] = this
    }

    companion object {
        val navItems = mutableMapOf<String, NavItem>()
    }

    object Welcome :
        NavItem(R.string.welcome_to_oabx, Phosphor.House, "intro_welcome")

    object Permissions :
        NavItem(R.string.permission_not_granted, Phosphor.Warning, "intro_permissions")

    object Home :
        NavItem(R.string.home, Phosphor.House, "home")

    object Backup :
        NavItem(R.string.backup, Phosphor.ArchiveTray, "batch_backup")

    object Restore :
        NavItem(R.string.restore, Phosphor.ClockCounterClockwise, "batch_restore")

    object Scheduler :
        NavItem(R.string.sched_title, Phosphor.CalendarX, "scheduler")

    object Main :
        NavItem(R.string.main, Phosphor.House, "main")

    object Settings :
        NavItem(R.string.prefs_title, Phosphor.GearSix, "settings")

    object UserPrefs :
        NavItem(R.string.prefs_user_short, Phosphor.UserGear, "prefs_user")

    object ServicePrefs :
        NavItem(R.string.prefs_service_short, Phosphor.SlidersHorizontal, "prefs_service")

    object AdvancedPrefs :
        NavItem(R.string.prefs_advanced_short, Phosphor.Flask, "prefs_advanced")

    object ToolsPrefs :
        NavItem(R.string.prefs_tools_short, Phosphor.Wrench, "prefs_tools")

    object Terminal :
        NavItem(R.string.prefs_tools_terminal, Phosphor.Bug, "prefs_tools/terminal")

    object Exports : NavItem(
        R.string.prefs_schedulesexportimport,
        Phosphor.CalendarX,
        "prefs_tools/exports"
    )

    object Logs : NavItem(
        R.string.prefs_logviewer,
        Phosphor.Bug,
        "prefs_tools/logs"
    )

    @Composable
    fun ComposablePage(navController: NavHostController, application: Application) {
        when (destination) {
            Home.destination -> HomePage()
            Backup.destination, Restore.destination -> {
                val viewModel =
                    viewModel<BatchViewModel>(factory = BatchViewModel.Factory(application))

                BatchPage(viewModel = viewModel, backupBoolean = destination == Backup.destination)
            }
            Scheduler.destination -> {
                val viewModel = viewModel<SchedulerViewModel>(
                    factory =
                    SchedulerViewModel.Factory(
                        ODatabase.getInstance(navController.context).scheduleDao,
                        application
                    )
                )

                SchedulerPage(viewModel)
            }
            UserPrefs.destination -> UserPrefsPage()
            ServicePrefs.destination -> ServicePrefsPage()
            AdvancedPrefs.destination -> AdvancedPrefsPage()
            ToolsPrefs.destination -> ToolsPrefsPage(navController = navController)
        }
    }
}