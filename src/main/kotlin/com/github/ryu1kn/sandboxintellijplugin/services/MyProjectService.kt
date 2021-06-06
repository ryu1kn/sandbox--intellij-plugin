package com.github.ryu1kn.sandboxintellijplugin.services

import com.github.ryu1kn.sandboxintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
