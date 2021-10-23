package com.github.splaroche.gitlabintegration.services

import com.intellij.openapi.project.Project
import com.github.splaroche.gitlabintegration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
