package controllers

import akka.actor.{ActorSystem, Props}

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Task
import models.TaskRepository

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(
                                cc: ControllerComponents ,
                                taskRepository: TaskRepository,
                                actorSystem: ActorSystem
                              )
    extends AbstractController(cc)
    with play.api.i18n.I18nSupport {

  private val taskActor = actorSystem.actorOf(Props(new TaskActor(taskRepository)))

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  val taskForm = Form(
    "label" -> nonEmptyText
  )

  def index() = Action { implicit request: Request[AnyContent] =>
    Redirect(routes.HomeController.tasks())
  }

  def tasks = Action { implicit request =>
    Ok(views.html.index(taskRepository.all(), taskForm))
  }

  def newTask = Action { implicit request =>
  taskForm.bindFromRequest.fold(
    errors => BadRequest(views.html.index(taskRepository.all(), errors)),
    label => {
      taskActor! TaskActor.CreateTask(label)
      Redirect(routes.HomeController.tasks)
    }
  )
}

  def deleteTask(id: Long) = Action {
    taskActor ! TaskActor.DeleteTask(id)
    Redirect(routes.HomeController.tasks)
  }
}
