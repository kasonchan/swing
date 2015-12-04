package demo

import java.awt.Toolkit

import scala.io.Source
import scala.swing._
import scala.swing.event.ButtonClicked

/**
 * Created by ka-son on 10/11/15.
 */
object Button extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Button"

    // Set the app to full screen
    val screenSize = Toolkit.getDefaultToolkit.getScreenSize
    preferredSize = screenSize

    contents = new GridPanel(2, 2) {
      hGap = 3
      vGap = 3
      contents += new Button {
        text = "Press Me!"
        reactions += {
          case ButtonClicked(_) =>
            val os = System.getProperty("os.name")
            val read = Source.fromURL(getClass.getResource("/read.txt")).getLines().mkString
            text = os + ". Hello everyone! " + read
        }
      }
    }
  }

}
