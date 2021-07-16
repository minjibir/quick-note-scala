package routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import models.Note

class NoteRoutes() extends NoteJsonProtocols {

  val newNote =
    Note(color = "green", quickNote = "Wrtie test for Linked Billable")

  val route: Route =
    path("notes") {
      concat(
        get {
          complete(newNote)
        },
        post {
          entity(as[Note]) { notePayload =>
            complete(notePayload)
          }
        }
      )
    }
}
