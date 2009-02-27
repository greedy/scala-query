import sbt._

class ScalaQuery(info: ProjectInfo) extends DefaultProject(info) {
  override def mainSources = ("src" ** "*.scala") --- ("src" / "test" ** "*")
  override def testSources = ("src" / "test" ** "*.scala")
  override def allSources = (("src" ##) ** "*")
}
