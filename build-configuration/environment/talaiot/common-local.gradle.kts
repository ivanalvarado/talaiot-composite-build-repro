buildscript {

    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        classpath("io.github.cdsap.talaiot:talaiot:1.0")
    }
}

import io.github.cdsap.talaiot.entities.ExecutionReport
import io.github.cdsap.talaiot.metrics.BuildMetrics
import io.github.cdsap.talaiot.metrics.TaskMetrics
import io.github.cdsap.talaiot.plugin.TalaiotPlugin
import io.github.cdsap.talaiot.plugin.TalaiotPluginExtension
import io.github.cdsap.talaiot.publisher.Publisher

configure<io.github.cdsap.talaiot.plugin.TalaiotPluginExtension>() {

}