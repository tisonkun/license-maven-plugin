/*
 * Copyright (C) 2008 Mycila (mathieu.carbou@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycila.maven.plugin.license;

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * 2013-08-01
 */
public final class Default {

    public static final String[] INCLUDE = new String[]{"**"};

    public static final String[] EXCLUDES = {
        // Miscellaneous typical temporary files
        "**/*~",
        "**/#*#",
        "**/.#*",
        "**/%*%",
        "**/._*",
        "**/.repository/**",

        // CVS
        "**/CVS",
        "**/CVS/**",
        "**/.cvsignore",

        // RCS
        "**/RCS",
        "**/RCS/**",

        // SCCS
        "**/SCCS",
        "**/SCCS/**",

        // Visual SourceSafe
        "**/vssver.scc",

        // Subversion
        "**/.svn",
        "**/.svn/**",

        // Arch
        "**/.arch-ids",
        "**/.arch-ids/**",

        //Bazaar
        "**/.bzr",
        "**/.bzr/**",

        //SurroundSCM
        "**/.MySCMServerInfo",

        // Mac
        "**/.DS_Store",

        // Serena Dimensions Version 10
        "**/.metadata",
        "**/.metadata/**",

        // Mercurial
        "**/.hg",
        "**/.hg/**",
        "**/.hgignore",

        // git
        "**/.git",
        "**/.git/**",
        "**/.gitattributes",
        "**/.gitignore",
        "**/.gitkeep",
        "**/.gitmodules",

        // GitHub
        "**/.github",
        "**/.github/**",

        // BitKeeper
        "**/BitKeeper",
        "**/BitKeeper/**",
        "**/ChangeSet",
        "**/ChangeSet/**",

        // darcs
        "**/_darcs",
        "**/_darcs/**",
        "**/.darcsrepo",
        "**/.darcsrepo/**",
        "**/-darcs-backup*",
        "**/.darcs-temp-mail",

        // maven project's temporary files
        "**/target/**",
        "**/test-output/**",
        "**/release.properties",
        "**/dependency-reduced-pom.xml",
        "**/release-pom.xml",
        "**/pom.xml.releaseBackup",
        "**/pom.xml.versionsBackup",

        // code coverage tools
        "**/cobertura.ser",
        "**/.clover/**",

        // eclipse project files
        "**/.classpath",
        "**/.project",
        "**/.settings/**",

        // IDEA projet files
        "**/*.iml",
        "**/*.ipr",
        "**/*.iws",
        ".idea/**",
        
        // Netbeans
        "**/nb-configuration.xml",

        // Hibernate Validator Annotation Processor
        "**/.factorypath",

        // descriptors
        "**/MANIFEST.MF",

        // binary files - images
        "**/*.jpg",
        "**/*.png",
        "**/*.gif",
        "**/*.ico",
        "**/*.bmp",
        "**/*.tiff",
        "**/*.tif",
        "**/*.cr2",
        "**/*.xcf",

        // binary files - programs
        "**/*.class",
        "**/*.exe",
        "**/*.dll",
        "**/*.so",

        // checksum files
        "**/*.md5",
        "**/*.sha1",

        // binary files - archives
        "**/*.jar",
        "**/*.zip",
        "**/*.rar",
        "**/*.tar",
        "**/*.tar.gz",
        "**/*.tar.bz2",
        "**/*.gz",

        // ServiceLoader files
        "**/META-INF/services/**",

        // Markdown files
        "**/*.md",

        // Office documents
        "**/*.xls",
        "**/*.doc",
        "**/*.odt",
        "**/*.ods",
        "**/*.pdf",

        // Travis
        "**/.travis.yml",

        // AppVeyor
        "**/.appveyor.yml",
        "**/appveyor.yml",

        // CircleCI
        "**/.circleci",
        "**/.circleci/**",

        // SourceHut
        "**/.build.yml",

        // flash
        "**/*.swf",

        // json files
        "**/*.json",

        // fonts
        "**/*.svg",
        "**/*.eot",
        "**/*.ttf",
        "**/*.woff",

        // office documents
        "**/*.xlsx",
        "**/*.docx",
        "**/*.ppt",
        "**/*.pptx",
    };

}
