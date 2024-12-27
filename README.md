# deploy-maven-repository-pages

GitHub PagesでMaven Repositoryをホスティングする例

## 設定ファイル

- build.gradle.kts
- .github/workflows/deploy.yml

## 設定後

GitHub Pagesでホスティングした依存関係を使用する方法

`build.gradle.kts`
```kts
repositories {
    maven {
        url = uri("https://<username>.github.io/<repository-name>/")
    }
}

dependencies {
    implementation("<group>:<artifact-id>:<version>")
}
```

## 注意点

- 最後にGitHub Pagesに適用した依存関係のみ使用できます
