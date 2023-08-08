package models

case class Task(id: Long, label: String)

object Task {
  private var tasks = Seq.empty[Task]
  private var currentId: Long = 1

  def getAllTasks(): Seq[Task] = tasks

  def create(label: String): Unit = {
    tasks = tasks :+ Task(currentId, label)
    currentId += 1
  }

  def delete(id: Long): Unit = {
    tasks = tasks.filterNot(_.id == id)
  }
}
