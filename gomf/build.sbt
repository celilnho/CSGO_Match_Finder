import play.Project._
import net.litola.SassPlugin

name := "gomf"

version := "1.0"

playScalaSettings

play.Project.playScalaSettings ++ SassPlugin.sassSettings