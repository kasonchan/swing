package demo

import scala.swing.BorderPanel.Position._
import scala.swing.event.{Key, KeyPressed}
import scala.swing.{BorderPanel, Label, MainFrame, SimpleSwingApplication, TextField}

/**
 * Created by kasonchan on 10/13/15.
 */
object InputText extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "TextFieldSample"
    val textfield: TextField = new TextField("Input")
    val label: Label = new Label("Output")

    contents = new BorderPanel() {
      add(textfield, North)
      add(label, South)
    }

    listenTo(textfield.keys)

    reactions += {
      case KeyPressed(_, Key.Enter, _, _) => label.text_=(textfield.text)
    }
  }

}
