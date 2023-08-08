
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<section id=""content>
        <div class="wrapper doc">
            <article>
                <h1>Hello """),_display_(/*6.28*/name),format.raw/*6.32*/("""!</h1>
            </article>
            <aside>
                """),_display_(/*9.18*/commonSidebar()),format.raw/*9.33*/("""
            """),format.raw/*10.13*/("""</aside>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/hello.scala.html
                  HASH: 69fcc459536e2c8185424d23b9dd46c3c637aa70
                  MATRIX: 907->1|1016->15|1044->18|1065->31|1104->33|1136->39|1271->148|1295->152|1391->222|1426->237|1468->251
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->6|37->6|40->9|40->9|41->10
                  -- GENERATED --
              */
          