package models

import anorm._
import anorm.SqlParser._
import javax.inject.Inject
import play.api.db.Database

case class Task(id: Long, label: String)

class TaskRepository @Inject()(db: Database) {

  val taskParser: RowParser[Task] = Macro.namedParser[Task]

  def all(): List[Task] = db.withConnection { implicit c =>
    SQL("select * from task").as(taskParser.*)
  }

  def create(label: String): Unit = db.withConnection { implicit c =>
    SQL("insert into task (label) values ({label})").on(
      'label -> label
    ).executeUpdate()
  }

  def delete(id: Long): Unit = db.withConnection { implicit c =>
    SQL("delete from task where id = {id}").on(
      'id -> id
    ).executeUpdate()
  }
}
