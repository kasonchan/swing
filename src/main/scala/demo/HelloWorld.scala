package demo

import scala.swing._

/**
 * Created by ka-son on 10/4/15.
 */
object HelloWorld extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Hello world"
    contents = new Button {
      text = "Click me"
    }
  }

}
