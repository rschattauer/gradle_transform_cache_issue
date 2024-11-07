pluginManagement {
    repositories {
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/") {
            content {
                includeGroup("app.cash.paparazzi")
            }
        }
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
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/") {
            content {
                includeGroup("app.cash.paparazzi")
            }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
 