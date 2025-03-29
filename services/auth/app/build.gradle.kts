plugins {
    alias { libs.plugins.spring.boot }
    alias { libs.plugins.spring.deps }
    alias { libs.plugins.kotlin.jvm }
    alias { libs.plugins.kotlin.spring }
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get())) } }

dependencies {
    implementation(platform(libs.spring.boot.dependencies))
    implementation(projects.services.auth.api)
    implementation(projects.services.auth.domain)
    implementation(projects.services.auth.infra)

    implementation(libs.spring.boot.starter.web)

    testImplementation(libs.bundles.kotlin.test)
    testImplementation(libs.bundles.spring.test)
}