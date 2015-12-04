package demo

import java.awt.Toolkit
import javax.swing.ImageIcon

import scala.io.Source
import scala.swing.BorderPanel.Position._
import scala.swing._
import scala.swing.event.{Key, KeyPressed}

/**
 * Created by kasonchan on 10/13/15.
 */
object InputText extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "TextFieldSample"

    // Set the app to full screen
    val screenSize = Toolkit.getDefaultToolkit.getScreenSize
    preferredSize = screenSize

    val os = System.getProperty("os.name")

    os match {
      case "Mac OS X" =>
        //       Set launch icon in Mac OS
        com.apple.eawt.Application.getApplication
          .setDockIconImage(new ImageIcon(getClass
            .getResource("/icon.png")).getImage)
      case _ =>
        Toolkit.getDefaultToolkit.getImage(getClass.getResource("/icon.png"))
    }
    
    val textfield: TextField = new TextField()

    // Read lines from resources file
    val read = Source.fromURL(getClass.getResource("/read.txt")).getLines().mkString
    val label: Label = new Label(os + ". " + read)

    contents = new BorderPanel() {
      add(textfield, North)
      add(label, South)
    }

    listenTo(textfield.keys)

    reactions += {
      case KeyPressed(_, Key.Enter, _, _) =>
        textfield.text.isEmpty match {
          case false => label.text_=(textfield.text)
          case true => label.text_=("None")
        }
    }
  }

}
