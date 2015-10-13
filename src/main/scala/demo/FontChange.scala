package demo

import scala.swing._

/**
 * Created by kasonchan on 10/12/15.
 */
object FontChange extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Hello world"

    contents = new Button {
      text = "Click me"
      font = new Font("Ariel", java.awt.Font.ITALIC, 24)
    }
  }

}