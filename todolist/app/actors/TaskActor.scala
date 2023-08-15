package controllers

import akka.actor.Actor
import models.TaskRepository

import javax.inject.Inject

object TaskActor {
  case class CreateTask(label: String)
  case class DeleteTask(id: Long)
}

class TaskActor @Inject()(taskRepository: TaskRepository) extends Actor {
  import TaskActor._

  def receive: Receive = {
    case CreateTask(label) =>
      // Simulate longer processing time (check if the action is registered)
      Thread.sleep(1000)
      //Log the message received
      println(s"TaskActor received CreateTask message with label: $label")
      taskRepository.create(label)

    case DeleteTask(id) =>
      // Simulate longer processing time (check if the action is registered)
      Thread.sleep(1000)
      //Log the message received
      println(s"TaskActor received DeleteTask message with id: $id")
      taskRepository.delete(id)
  }
}
