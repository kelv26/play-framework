package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Task
import javax.inject._

@Singleton
class TaskController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // Action to list tasks
  def index() = Action { implicit request =>
    val tasks = Task.getAllTasks()
    Ok(views.html.taskList(tasks))
  }

  // Action to create a task
  def createTask() = Action { implicit request =>
    val taskForm = Form("label" -> nonEmptyText)
    taskForm.bindFromRequest.fold(
      formWithErrors => BadRequest,
      label => {
        Task.create(label)
        Redirect(routes.TaskController.index())
      }
    )
  }

  // Action to delete a task
  def deleteTask(id: Long) = Action { implicit request =>
    Task.delete(id)
    Redirect(routes.TaskController.index())
  }
}
