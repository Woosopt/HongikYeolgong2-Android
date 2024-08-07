pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HongikYeolgong2"
include(":app")
include(":core:designsystem")
include(":calendar-domain")
include(":calendar-presentation")
include(":main-presentation")
include(":setting-presentation")
include(":setting-data")
include(":setting-domain")
include(":timer-domain")
include(":timer-presentation")
