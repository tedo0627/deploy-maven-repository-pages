package org.example.sample

import org.example.deploy_maven_repository_pages.Hello

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println(Hello.hello())
        }
    }
}