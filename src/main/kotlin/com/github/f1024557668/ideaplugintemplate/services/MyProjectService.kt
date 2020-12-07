package com.github.f1024557668.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.f1024557668.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
