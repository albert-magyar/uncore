organization := "edu.berkeley.cs"

version := "2.0"

name := "uncore"

scalaVersion := "2.10.2"

// Provide a managed dependency on X if -DXVersion="" is supplied on the command line.
libraryDependencies ++= (Seq("chisel","junction").map {
  dep: String => sys.props.get(dep + "Version") map { "edu.berkeley.cs" %% dep % _ }}).flatten

site.settings

site.includeScaladoc()

ghpages.settings

git.remoteRepo := "git@github.com:ucb-bar/uncore.git"
