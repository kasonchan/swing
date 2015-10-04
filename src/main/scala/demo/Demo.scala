package demo

import scala.swing._

/**
 * Created by ka-son on 10/4/15.
 */
object Demo extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "First Swing App"
    contents = new Button {
      text = "Click me"
    }
  }

}
