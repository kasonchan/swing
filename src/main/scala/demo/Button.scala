package demo

import scala.swing._
import scala.swing.event.ButtonClicked

/**
 * Created by ka-son on 10/11/15.
 */
object Button extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Button"
    contents = new GridPanel(2, 2) {
      hGap = 3
      vGap = 3
      contents += new Button {
        text = "Press Me!"
        reactions += {
          case ButtonClicked(_) => text = "Hello Scala"
        }
      }
    }
    size = new Dimension(300, 300)
  }

}
