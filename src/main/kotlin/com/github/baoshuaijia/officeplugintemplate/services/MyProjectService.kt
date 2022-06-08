package com.github.baoshuaijia.officeplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.baoshuaijia.officeplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
